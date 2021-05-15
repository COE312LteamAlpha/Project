package proj1;

import java.util.Scanner;

public class The_Cave implements Locations{

	Player p;
	int currMaxHP;
	Nithral n;
	Scanner scan = new Scanner(System.in);
	The_Cave(Player p, Nithral n){
		this.p=p;
		this.n=n;
		this.currMaxHP = p.health_level;
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
				p.attack_level += 20;
				p.health_level += 50;
				p.coins -= 15;
				System.out.println("Coins left: " + p.coins);
			}
			else if(scan.nextInt() == 2) {
				p.bonus_attack += 15;
				p.health_level += 70;
				p.coins -= 25;
				System.out.println("Coins left: " + p.coins);
			}
			else if(scan.nextInt() == 3) {
				p.attack_level += 10;
				p.health_level += 100;
				p.coins -= 35;
				System.out.println("Coins left: " + p.coins);
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
				p.health_level += (currMaxHP/2); 
			}
			else if(scan.next().equals("full")) {
				p.health_level += currMaxHP; 
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

}
