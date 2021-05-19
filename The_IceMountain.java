package proj1;

import java.util.Scanner;

public class The_IceMountain implements Locations {


	Player p;
	int currMaxHP;
	Caranthir c;
	Scanner scan = new Scanner(System.in);
	The_IceMountain(Player p, Caranthir c){
		this.p=p;
		this.c=c;
		this.currMaxHP = p.health_level;
	}
	@Override
	public void L_right() {
		// TODO Auto-generated method stub
		System.out.println("Here you can interact with the Chemist!\nThe chemist can heal the player fully and provide the player with potions. ");

		System.out.println("You can purchase health/spell sets from here: "
				+ "\n1. Invisibility Potion - 15 coins" 
				+ "\n2. Speed Potion - 25 coins \t Spell Attack bonus: +15"
				+ "\n3. Half Heal Potion - 35 coins "
				+ "\n4. Full Health Potion - 50 coins" 
				+ "\n5. Giant Size Potion- 65 coins \t Attack: +500 \tHealth: +500"
				+ "\nEnter option number to select \tType exit to leave:");
		while(!scan.next().equals("exit")) {

			if(scan.nextInt() == 1) {
				if(p.coins - 15 < 0)
				{
					System.out.println("Cannot afford");
				}
				else {
					p.coins -= 15;
					System.out.println("Now you have the ability to turn invisble for 30 seconds");
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
					p.coins -= 25;
					System.out.println("Now you have the ability to become fast for 40 seconds");
					System.out.println("Coins left: " + p.coins);
				}
			}

			else if(scan.nextInt() == 3) {
				if(p.coins - 35 < 0)
				{
					System.out.println("Cannot afford");
				}
				else {
					p.health_level += currMaxHP/2;
					p.coins -= 35;
					System.out.println("Now you have the ability to restore half your health");
					System.out.println("Coins left: " + p.coins);
				}
			}
			else if(scan.nextInt() == 4) {
				if(p.coins - 50 < 0)
				{
					System.out.println("Cannot afford");
				}
				else {
					p.health_level += currMaxHP;
					p.coins -= 50;
					System.out.println("Now you have the ability to restore your full health");
					System.out.println("Coins left: " + p.coins);
				}
			}
			else if(scan.nextInt() == 5) {
				if(p.coins - 65 < 0)
				{
					System.out.println("Cannot afford");
				}
				else {
					p.attack_level = 500;
					p.health_level += 500;
					p.coins -= 65;
					System.out.println("Now you have the ability to upsize to giant (name of character controlled by player?)");
					System.out.println("Coins left: " + p.coins);
				}
			}
			else {
				System.out.println("Enter from the given options:");
			}
		}
	}

	@Override
	public void L_left() {
		// TODO Auto-generated method stub
		System.out.println("Here you can interact with the Armourer and/or the trader!\nThe Armourer can mend or sell weapons and armours\nThe Trader can upgrade weapons or armours, fully developed potions/spells");
		System.out.println("Enter the character you want to interact with ie(talk to ...):");
		while(!scan.next().equals("exit")) {
			if(scan.nextLine().equalsIgnoreCase("talk to Armourer")) 
			{
				System.out.println("You can purchase armour sets from here: "
						+ "\n1. Griffin Gear Set - 15 coins" + "\t Attack: +20 \tHealth: +50"
						+ "\n2. Manticore Gear Set - 25 coins \t Spell bonus: +15 \tHealth: +75"
						+ "\n3. Ursine Gear Set - 35 coins \t Attack: +10 \tHealth: +100"
						+ "\n4. Sword Set - 50 coins \t Attack: +35"
						+ "\n5. Twohanded Sword Set - 65 coins \t Attack: +90"
						+ "\nEnter option number to select \tType exit to leave:");
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
				else if(scan.nextInt() == 4) {
					if(p.coins - 50 < 0)
					{
						System.out.println("Cannot afford");
					}
					else {
						p.attack_level += 35;
						p.coins -= 50;
						System.out.println("Coins left: " + p.coins);
					}
				}
				else if(scan.nextInt() == 5) {
					if(p.coins - 65 < 0)
					{
						System.out.println("Cannot afford");
					}
					else {
						p.attack_level += 90;
						p.coins -= 65;
						System.out.println("Coins left: " + p.coins);
					}
				}
				else {
					System.out.println("Enter from the given options:");
				}
			}
			if(scan.nextLine().equalsIgnoreCase("talk to Trader")) {
				System.out.println("You can upgrade weapons or armours, fully developed potions/spells here: "
						+ "\n1. Griffin Gear Upgrade Set - 7 coins" + "\t Attack: +5 \tHealth: +12"
						+ "\n2. Manticore Gear Upgrade Set - 9 coins \t Spell bonus: +12 \tHealth: +7"
						+ "\n3. Ursine Gear Upgrade Set - 15 coins \t Attack: +15 \tHealth: +15"
						+ "\n4. Sword(10% Damage) - 20 coins"
						+ "\n5. Twohanded Sword (5% Damage) - 10 coins"
						+ "\nEnter option number to select \tType exit to leave:");
				if(scan.nextInt() == 1) {
					p.attack_level += 5;
					p.health_level += 12;
					p.coins -= 7;
					System.out.println("Coins left: " + p.coins);
				}
				else if(scan.nextInt() == 2) {
					p.bonus_attack += 12;
					p.health_level += 7;
					p.coins -= 9;
					System.out.println("Coins left: " + p.coins);
				}
				else if(scan.nextInt() == 3) {
					p.attack_level += 15;
					p.health_level += 15;
					p.coins -= 15;
					System.out.println("Coins left: " + p.coins);
				}
				else if(scan.nextInt() == 4) {
					p.attack_level += p.attack_level*0.1;
					p.coins -= 20;
					System.out.println("Coins left: " + p.coins);
				}
				else if(scan.nextInt() == 5) {
					p.attack_level += p.attack_level*0.05;
					p.coins -= 10;
					System.out.println("Coins left: " + p.coins);
				}
				else {
					System.out.println("Enter from the given options:");
				}


			}
		}


		this.currMaxHP = p.health_level;
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
		System.out.println("To the right there's a Chemist, and to the left theres an Armourer and a Trader."
				+ " And to theres an odd force to the front" + "\n\t (You can go right, left or forth)");
	}

	@Override
	public void goForth() {
		// TODO Auto-generated method stub
		
		if(c.isAlive == true){
			System.out.println("Here's Caranthir!");
		UserFight uF = new UserFight(p,c);
		EnemyFight eF = new EnemyFight(p,c);
			}
		else {
			//goto location 3
		}
	}
}
