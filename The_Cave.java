package Project;

import java.util.Scanner;

public class The_Cave implements Locations{

	Player p;
	int currMaxHP;
	Nithral n;
	static String curLoc="";
	Scanner scan = new Scanner(System.in);
	The_Cave(Player p, Nithral n){
		this.p=p;
		this.n=n;
		this.currMaxHP = p.health_level;
	}
	
	public void goTo(String loc) {
		if(loc=="right") {
			L_right();
		}
		else if(loc=="left") {
			L_left();
		}
		else if(loc=="front") {
			goForth();
		}
		else if(loc=="back") {
			goBack();
		}
	}
	@Override
	public void L_right() {
		// TODO Auto-generated method stub
		System.out.println("The Armourer");
		
		System.out.println("You can purchase armour sets from here: "
		+ "\n1. Griffin Gear Set - 15 coins" + "\t Attack: +20 \tHealth: +50"
		+ "\n2. Manticore Gear Set - 25 coins \t Spell bonus: +15 \tHealth: +75"
		+ "\n3. Ursine Gear Set - 35 coins \t Attack: +10 \tHealth: +100"
		+ "\nEnter option number to select \tType exit to leave");
		
		//Scanner scan = new Scanner(System.in);
		while(!scan.next().equals("exit")) {
			if(scan.nextInt() == 1) {
				if(p.coins - 15 < 0)
				{
					System.out.println("Cannot afford");
				}
				else {
				p.attack_level += 20;
				p.health_level += 50;
				p.coins -= 15;
				System.out.println("Coins left: " + p.coins);
				}
			}
			else if(scan.nextInt() == 2) {
				if(p.coins - 25 < 0)
				{
					System.out.println("Cannot afford");
				}
				else {
				p.bonus_attack += 15;
				p.health_level += 70;
				p.coins -= 25;
				System.out.println("Coins left: " + p.coins);
				}
			}
			else if(scan.nextInt() == 3) {
				if(p.coins - 35 < 0)
				{
					System.out.println("Cannot afford");
				}
				else {
				p.attack_level += 10;
				p.health_level += 100;
				p.coins -= 35;
				System.out.println("Coins left: " + p.coins);
				}
			}
			else {
				System.out.println("Enter from the given options");
			}
		}
		this.currMaxHP = p.health_level;
		//create a variable in the UI which keeps the player's location
		
	} 

	@Override
	public void L_left() {
		// TODO Auto-generated method stub
		System.out.println("The Healer" + "\n The healer will either increase your health by half or fully."
		+ "\nHalf recovery - 5 coins"
		+ "\tFull recovery - 10 coins"
		+"\nEnter half or full");
		while(!scan.next().equals("exit")) {
			if(scan.next().equals("half")) {
				if(p.coins - 5 < 0)
				{
					System.out.println("Cannot afford");
				}
				else {
				p.health_level += (currMaxHP/2); 
				p.coins -= 5;
				}
			}
			else if(scan.next().equals("full")) {
				if(p.coins - 10 < 0)
				{
					System.out.println("Cannot afford");
				}
				else {
				p.health_level += currMaxHP; 
				p.coins -= 10;
				}
			}
			else {
				System.out.println("Enter from the given options");
			}
		}
		//create a variable in the UI which keeps the player's location
	}

	@Override
	public boolean battles() {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public void lookAround() {
		// TODO Auto-generated method stub
		System.out.println("To the right there's an Armourer, and to the left theres a Healer."
				+ " And to theres an odd force to the front" + "\n\t (You can go right, left or forth)");
	}

	@Override
	public void goForth() {
		// TODO Auto-generated method stub
		
		if(n.isAlive == true){
			System.out.println("Here's Nithral!!");
			Watch wT = new Watch(p);
		UserFight uF = new UserFight(p,n,wT);
		EnemyFight eF = new EnemyFight(p,n);
		if(uF.done == true) {
			//lost to Nithral
		}
		else if(eF.done == true) {
			//won against Nithral
			p.health_level+= 10;
			p.attack_level+= 10;
		}
			}
		else {
			//goto location 2
			System.out.println("now entering The Ice Mountain");
			curLoc = "The Ice Mountain";

		}
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		System.out.println("now entering Kaer Morhen");
		curLoc = "Kaer Morhen";
	}

}
