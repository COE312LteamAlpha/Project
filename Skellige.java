package proj1;

import java.util.Scanner;

public class Skellige implements Locations{

	Player p;
	int currMaxHP;
	Eredin er = new Eredin();
	AngryEredin ae = new AngryEredin();
	//String curLoc;
	Scanner scan = new Scanner(System.in);
	EnemyDialogues eD = new EnemyDialogues("Skellige");
	EnemyDialogues aeD = new EnemyDialogues("Skellige2");
	UserDialogues uD = new UserDialogues("Skellige");
	UserDialogues uD2 = new UserDialogues("Skellige2");
	Skellige(Player p)
	{
		this.p=p;
		//this.er=er;
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
		System.out.println("The Armourer");
		System.out.println(" .-------..___\r\n"
				+ "  '-._     :_.-'\r\n"
				+ "   .- ) _ ( --.\r\n"
				+ "  :  '-' '-'  ;.\r\n"
				+ " /'-.._____.-' |\r\n"
				+ " |   |     \\   |\r\n"
				+ " \\   |     /   \\\r\n"
				+ " |   \\     )_.-'LGB\r\n"
				+ " '-._/__..-'\r\n"
				+ "");
		System.out.println("You can purchase armour sets from here: "
				+ "\n1. Griffin Gear Set - 15 coins" + "\t Attack: +50 \tHealth: +50"
				+ "\n2. Manticore Gear Set - 25 coins \t Spell bonus: +30 \tHealth: +75"
				+ "\n3. Ursine Gear Set - 35 coins \t Attack: +25 \tHealth: +100"
				+ "\nEnter option number to select \tType 4 to leave");

		
		while(true) {
			int option = scan.nextInt();
			if(option == 1) {
				if(p.coins - 15 < 0)
				{
					System.out.println("Cannot afford");
				}
				else {
					p.attack_level += 50;
					p.health_level += 50;
					p.coins -= 15;
					System.out.println("Coins left: " + p.coins+ "\t Enter exit to leave");
				}
			}
			else if(option == 2) {
				if(p.coins - 25 < 0)
				{
					System.out.println("Cannot afford");
				}
				else {
					p.bonus_attack += 30;
					p.health_level += 75;
					p.coins -= 25;
					System.out.println("Coins left: " + p.coins+ "\t Enter exit to leave");
				}
			}
			else if(option == 3) {
				if(p.coins - 35 < 0)
				{
					System.out.println("Cannot afford");
				}
				else {
					p.attack_level += 25;
					p.health_level += 100;
					p.coins -= 35;
					System.out.println("Coins left: " + p.coins+ "\t Enter exit to leave");
				}
			}
			else if (option == 4) {
				break;
			}
			else {
				System.out.println("Enter from the given options");
			}
		}
		System.out.println("Now leaving the Armourer" + "\tStats: "); p.pStats();
		this.currMaxHP = p.health_level;

	}

	@Override
	public void L_left() {
		// TODO Auto-generated method stub
		System.out.println("The Healer" 
				+ "   _____\r\n"
				+ "     `.___,'\r\n"
				+ "      (___)\r\n"
				+ "      <   >\r\n"
				+ "       ) (\r\n"
				+ "      /`-.\\\r\n"
				+ "     /     \\\r\n"
				+ "    / _    _\\\r\n"
				+ "   :,' `-.' `:\r\n"
				+ "   |         |\r\n"
				+ "   :         ;\r\n"
				+ "    \\       /\r\n"
				+ "     `.___.' "
				+ "\n The healer will either increase your health by half or fully."
				+ "\nHalf recovery - 5 coins"
				+ "\tFull recovery - 10 coins"
				+"\nEnter half or full\t Enter exit to leave");
		while(true) {
			String option = scan.next();
			if(option.equals("half")) {
				if(p.coins - 5 < 0)
				{
					System.out.println("Cannot afford");
				}
				else {
					Swallow s = new Swallow();
					s.makePotion();
					System.out.println("Now consuming potion brewed!");
					p.health_level += (currMaxHP/2); 
					p.coins -= 5;
					System.out.println("Health: " + p.health_level);
					System.out.println("Coins left: " + p.coins + "\t Enter exit to leave");
				}
			}
			else if(option.equals("full")) {
				if(p.coins - 10 < 0)
				{
					System.out.println("Cannot afford");
				}
				else {
					EnhancedSwallow enS = new EnhancedSwallow();
					enS.makePotion();
					System.out.println("Now consuming potion brewed!");
					p.health_level += currMaxHP; 
					p.coins -= 10;
					System.out.println("Health: " + p.health_level);
					System.out.println("Coins left: " + p.coins + "\t Enter exit to leave");
				}
			}
			else if(option.equals("exit")) {
				break;
			}
			else {
				System.out.println("Enter from the given options");
			}
		}
		System.out.println("Now leaving the Healer \tStats"); p.pStats();
	}

	@Override
	public void lookAround() {
		// TODO Auto-generated method stub
		System.out.println("welcome to Skellige");
		System.out.println("To the right there's an Armourer, and to the left theres a Healer."
				+ " And to theres an odd force to the front" + "\n\t (You can go right, left, forth or back)");

	}
	public void map() {
		System.out.println("\n"
				+ "              Map of Skellige\n"
				+ " ┌──────────────────────────────────────────┐\n"
				+ " │                                          │\n"
				+ " │                                          │\n"
				+ " │                                          │\n"
				+ " │                                          │\n"
				+ " │                                          │\n"
				+ " │                                          │\n"
				+ " │                                          │\n"
				+ " │                                          │\n"
				+ " │                                          │\n"
				+ " │ Healer                              Armourer\n"
				+ " │                                          │\n"
				+ " │                                          │\n"
				+ " │                                          │\n"
				+ " │                                          │\n"
				+ " │                                          │\n"
				+ " │                                          │\n"
				+ " │                                          │\n"
				+ " │                                          │\n"
				+ " │                                          │\n"
				+ " │             To The Ice Mountain          │\n"
				+ " └───────────────────┬──────────────────────┘\n"
				+ "                     │\n"
				+ "                     ▼");
	}
	
	@Override
	public void goForth() {
		// TODO Auto-generated method stub
		int pHP = p.health_level;
		int eHP = er.health_level;
		if(er.isAlive == true){
			System.out.println("The final obstacle between the protection of countless human lives and "
					+"\n the safety of the princess lies before you...the commander himself, Eredin. His "
					+"\n ominous aura speaks for itself and an experienced Witcher such as yourself who "
					+"\n many consider the most reliable and skilled in all the lands seems to be cautious."
					+"\n His armor seemd sturdy yet agile, and his magical abilities dwarved all those you've"
					+"\n faced thus far. This was it! The final battle!");
			//p.dialogueIntro(The_Cave.curLoc);
			//er.dialogueIntro(The_Cave.curLoc);
			eD.dialogueIntro();
			uD.dialogueIntro();
			System.out.println("Type begin to fight!!");
			String fBegin="";
			while(!fBegin.equals("begin")) {
				fBegin = scan.next();
			}

			Watch wT = new Watch(p);
			UserFight uF = new UserFight(p,er,wT);
			EnemyFight eF = new EnemyFight(p,er);
			p.health_level = currMaxHP;
			try {
				uF.get_thread().join();
				eF.get_thread().join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(uF.done == true) {
				//lost to Eredin
				//er.dialogueVictory("skellige");
				//p.dialogueDefeat("skellige");
				eD.dialogueVictory();
				uD.dialogueDefeat();
				p.health_level = pHP;
				er.health_level = eHP;
			}
			else if(eF.done == true) {
				//won against Eredin
				//initiate AngryEredin
				System.out.println("\n "+ p.name+ ": (pant) Said you had something to tell me. (pant)");
				System.out.println("\n Eredin: (pant) Not yet! I said I'd say it as you die. "
						+ " Don't get too cocky. You haven't beat me! "
						+ "\n Eredin charges again!");
				EredinStates es = new EredinStates();
				es.nextState();
				es.printStatus();
				UserFight uF2 = new UserFight(p,ae,wT);
				EnemyFight aeF = new EnemyFight(p,ae);
				try {
					uF2.get_thread().join();
					aeF.get_thread().join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if(uF2.done == true) {
					//lost to AngryEredin
					//ae.dialogueVictory("skellige");
					//p.dialogueDefeat("skellige");
					eD.dialogueVictory();
					uD.dialogueDefeat();
					p.health_level = pHP;
					er.health_level = eHP;
				}
				else {
					p.health_level+= 15;
					p.attack_level+= 15;
					p.coins+= 100;
					Watch.tm=false;
					//p.dialogueVictory("skellige");
					//er.dialogueDefeat("skellige");
					aeD.dialogueDefeat();
					uD.dialogueVictory();
					
					//add ending story
					System.out.println("The winner of this battle seemed to have been decided! But Eredin refused"
							+"\n to lie down, pushing himself to his absolute limit to take one last stand! "
							+"\n But he ultimately succumbed to his wounds and falls on his back.");
					System.out.println("\n It would seem that our protagonist was sent on a mission simply to save time "
							+ "\n for the king and his daughter princess to make an escape. Our protagonist however, "
							+ "\n realised he had a duty to fulfill as humanity's strongest fighter. Whether the money was"
							+ "\n involved or not...he has protected his people. "
							+ "\n At this moment, he felt no particular animosity towards the king. All he had was the "
							+ "\n satisfaction of a job well done. While he thought about going after the king for his"
							+ "\n recompense, he felt that he would be content going back to slaying the neighborhood "
							+ "\n monsters for common folk for measly pay. Killing monsters and beasts, as he does best.");
					System.out.println("\n There would always be more to our hero's story, but we leave the interpretation"
							+ "\n of what happens next....up to the player, YOU.");
					System.out.println("\n _________          _______    _______  _        ______  \r\n"
							+ "\\__   __/|\\     /|(  ____ \\  (  ____ \\( (    /|(  __  \\ \r\n"
							+ "   ) (   | )   ( || (    \\/  | (    \\/|  \\  ( || (  \\  )\r\n"
							+ "   | |   | (___) || (__      | (__    |   \\ | || |   ) |\r\n"
							+ "   | |   |  ___  ||  __)     |  __)   | (\\ \\) || |   | |\r\n"
							+ "   | |   | (   ) || (        | (      | | \\   || |   ) |\r\n"
							+ "   | |   | )   ( || (____/\\  | (____/\\| )  \\  || (__/  )\r\n"
							+ "   )_(   |/     \\|(_______/  (_______/|/    )_)(______/ \r\n"
							+ "");
				}
			}
		}
		else {}

	}
	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		System.out.println("now entering The Ice Mountain");
		The_IceMountain iM = new The_IceMountain(p);
		The_Cave.The_IceMountainDraw();
		The_Cave.curLoc="The Ice Mountain";
		iM.lookAround();
	}


}
