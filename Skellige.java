package Project;

import java.util.Scanner;

public class Skellige implements Locations{

	Player p;
	int currMaxHP;
	String curLoc;
	Eredin er = new Eredin();
	Scanner scan = new Scanner(System.in);
	Skellige(Player p)
	{
		this.p=p;
		//this.er=er;
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
				p.armor = 1;
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
				p.armor = 2;
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
				p.armor = 3;
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
							Swallow s = new Swallow();
							System.out.println("Brewing a Swallow: ");
							s.makePotion();
							System.out.println("Brewed Swallow!");
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
							EnhancedSwallow es = new EnhancedSwallow();
							System.out.println("Brewing a Enhanced Swallow: ");
							Swallow s = new Swallow();
							s.makePotion();
							System.out.println("Brewed Swallow!");
							es.makePotion();
							System.out.println("Brewed Enhanced Swallow!");
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
		p.dialogueIntro(curLoc);
		er.dialogueIntro(curLoc);
		return false;
	}
	@Override
	public void lookAround() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void goForth() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		System.out.println("now entering The Ice Mountain");
		The_Cave.curLoc="The Ice Mountain";
	}
	

}
