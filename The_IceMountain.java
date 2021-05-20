package Project;

import java.util.Scanner;

public class The_IceMountain implements Locations {


	Player p;
	int currMaxHP;
	Caranthir c = new Caranthir();
	Scanner scan = new Scanner(System.in);
	The_IceMountain(Player p){
		this.p=p;
		//this.c=c;
		this.currMaxHP = p.health_level;
	}
	public void goTo(String loc) {
		if(loc.equals("right")) {
			L_right();
		}
		else if(loc.equals("left")) {
			L_left();
		}
		else if(loc.equals("forth")) {
			goForth();
		}
		else if(loc.equals("back")) {
			goBack();
		}
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
				+ "\nEnter option number to select \tType 6 to leave:");
		while(true) {
			int option = scan.nextInt();
			if(option == 1) {
				if(p.coins - 15 < 0)
				{
					System.out.println("Cannot afford");
				}
				else {
					p.coins -= 15;
					System.out.println("Now you have the ability to turn invisble for 30 seconds");
					p.potionsAv.add("Invisibility Potion");
					System.out.println("Coins left: " + p.coins);
				}
			}
			else if(option == 2) {
				if(p.coins - 25 < 0)
				{
					System.out.println("Cannot afford");
				}
				else {
					p.bonus_attack += 15;
					p.coins -= 25;
					System.out.println("Now you have the ability to become fast for 40 seconds");
					p.potionsAv.add("Speed Potion");
					System.out.println("Coins left: " + p.coins);
				}
			}

			else if(option == 3) {
				if(p.coins - 35 < 0)
				{
					System.out.println("Cannot afford");
				}
				else {
					p.health_level += currMaxHP/2;
					p.coins -= 35;
					System.out.println("Now you have the ability to restore half your health");
					p.potionsAv.add("Half Heal Potion");
					System.out.println("Coins left: " + p.coins);
				}
			}
			else if(option == 4) {
				if(p.coins - 50 < 0)
				{
					System.out.println("Cannot afford");
				}
				else {
					p.health_level += currMaxHP;
					p.coins -= 50;
					System.out.println("Now you have the ability to restore your full health");
					p.potionsAv.add("Full Health Potion");
					System.out.println("Coins left: " + p.coins);
				}
			}
			else if(option == 5) {
				if(p.coins - 65 < 0)
				{
					System.out.println("Cannot afford");
				}
				else {
					p.attack_level = 500;
					p.health_level += 500;
					p.coins -= 65;
					System.out.println("Now you have the ability to upsize to giant (name of character controlled by player?)");
					p.potionsAv.add("Giant Size Potion");
					System.out.println("Coins left: " + p.coins);
				}
			}
			else if(option==6) {
				break;
			}
			else {
				System.out.println("Enter from the given options:");
			}
		}
		System.out.println("Now leaving the Chemist");
	}

	@Override
	public void L_left() {
		// TODO Auto-generated method stub
		System.out.println("Here you can interact with the trader!\nThe Trader can upgrade weapons or armours, fully developed potions/spells");
		System.out.println("You can upgrade weapons or armours, fully developed potions/spells here: "
				+ "\n1. Griffin Gear Upgrade Set - 7 coins" + "\t Attack: +5 \tHealth: +12"
				+ "\n2. Manticore Gear Upgrade Set - 9 coins \t Spell bonus: +12 \tHealth: +7"
				+ "\n3. Ursine Gear Upgrade Set - 15 coins \t Attack: +15 \tHealth: +15"
				+ "\n4. Sword(10% Damage) - 20 coins"
				+ "\n5. Twohanded Sword (5% Damage) - 10 coins"
				+ "\nEnter option number to select \tType 6 to leave:");
		while(true) {
			int option = scan.nextInt();
				if(option == 1) {
					p.attack_level += 5;
					p.health_level += 12;
					p.coins -= 7;
					System.out.println("Coins left: " + p.coins);
				}
				else if(option == 2) {
					p.bonus_attack += 12;
					p.health_level += 7;
					p.coins -= 9;
					System.out.println("Coins left: " + p.coins);
				}
				else if(option == 3) {
					p.attack_level += 15;
					p.health_level += 15;
					p.coins -= 15;
					System.out.println("Coins left: " + p.coins);
				}
				else if(option == 4) {
					p.attack_level += p.attack_level*0.1;
					p.coins -= 20;
					System.out.println("Coins left: " + p.coins);
				}
				else if(option == 5) {
					p.attack_level += p.attack_level*0.05;
					p.coins -= 10;
					System.out.println("Coins left: " + p.coins);
				}
				else if(option==6) {
					break;
				}
				else {
					System.out.println("Enter from the given options:");
				}
		}

		System.out.println("Now leaving the Trader");
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
		System.out.println("To the right there's a Chemist, and to the left theres a Trader."
				+ " And to theres an odd force to the front" + "\n\t (You can go right, left or forth)");
		//goTo(scan.next());
	}

	@Override
	public void goForth() {
		// TODO Auto-generated method stub
		int pHP = p.health_level;
		if(c.isAlive == true){
			System.out.println("Here's Caranthir!");
			p.dialogueIntro(The_Cave.curLoc);
			c.dialogueIntro(The_Cave.curLoc);
			Watch wT = new Watch(p);
		UserFight uF = new UserFight(p,c,wT);
		EnemyFight eF = new EnemyFight(p,c);
		p.health_level = currMaxHP;
		if(uF.done == true) {
			//lost to Caranthir
			
			p.health_level = pHP;
		}
		else if(eF.done == true) {
			//won against Caranthir
			p.health_level+= 15;
			p.attack_level+= 15;
			p.coins+= 100;
			Skellige sK = new Skellige(p);
			System.out.println("now entering Skellige");
			The_Cave.curLoc = "Skellige";
			sK.lookAround();
		}
			}
		else {
			//goto location 3
			Skellige sK = new Skellige(p);
			System.out.println("now entering Skellige");
			The_Cave.curLoc = "Skellige";
			sK.lookAround();
		}
	}
	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		System.out.println("now entering The Cave");
		The_Cave tC = new The_Cave(p);
		The_Cave.curLoc = "The Cave";
		tC.lookAround();
	}
}
