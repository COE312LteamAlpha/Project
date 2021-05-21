package proj1;

import java.util.Scanner;

public class The_Cave implements Locations{

	Player p;
	int currMaxHP;
	Nithral n = new Nithral();
	static String curLoc="";
	Scanner scan = new Scanner(System.in);
	The_Cave(Player p){
		this.p=p;
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
		+ "\n1. Griffin Gear Set - 15 coins" + "\t Attack: +20 \tHealth: +50"
		+ "\n2. Manticore Gear Set - 25 coins \t Spell bonus: +15 \tHealth: +75"
		+ "\n3. Ursine Gear Set - 35 coins \t Attack: +10 \tHealth: +100"
		+ "\nEnter option number to select \tType 4 to leave");
		
		//Scanner scan = new Scanner(System.in);
		while(true) {
			int option = scan.nextInt();
			if( option == 1) {
				if(p.coins - 15 < 0)
				{
					System.out.println("Cannot afford");
				}
				else {
				p.attack_level += 20;
				p.health_level += 50;
				p.coins -= 15;
				System.out.println("Coins left: " + p.coins + "\t Enter 4 to leave");
				}
			}
			else if(option == 2) {
				if(p.coins - 25 < 0)
				{
					System.out.println("Cannot afford");
				}
				else {
				p.bonus_attack += 15;
				p.health_level += 70;
				p.coins -= 25;
				System.out.println("Coins left: " + p.coins + "\t Enter 4 to leave");
				}
			}
			else if(option == 3) {
				if(p.coins - 35 < 0)
				{
					System.out.println("Cannot afford");
				}
				else {
				p.attack_level += 10;
				p.health_level += 100;
				p.coins -= 35;
				System.out.println("Coins left: " + p.coins + "\t Enter 4 to leave");
				}
			}
			else if(option == 4) {
				break;
			}
			else {
				System.out.println("Enter from the given options" + "\t Enter 4 to leave");
			}
		}
		System.out.println("Now leaving the Armourer\tStats"); p.pStats();
		this.currMaxHP = p.health_level;
		//create a variable in the UI which keeps the player's location
		
	} 

	@Override
	public void L_left() {
		// TODO Auto-generated method stub
		System.out.println("The Healer" + 
		"   _____\r\n"
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
		+		"\n The healer will either increase your health by half or fully."
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
				p.health_level += (currMaxHP/2); 
				p.coins -= 5;
				System.out.println("Coins left: " + p.coins + "\t Enter exit to leave");
				}
			}
			else if(option.equals("full")) {
				if(p.coins - 10 < 0)
				{
					System.out.println("Cannot afford");
				}
				else {
				p.health_level += currMaxHP; 
				p.coins -= 10;
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
		this.currMaxHP = p.health_level;
		System.out.println("Now leaving the Healer\tStats"); p.pStats();
		//create a variable in the UI which keeps the player's location
	}

	@Override
	public boolean battles() {
		// TODO Auto-generated method stub
		p.dialogueIntro(curLoc);
		n.dialogueIntro(curLoc);
		//initiate fight 
		
		return false;
	}

	@Override
	public void lookAround() {
		// TODO Auto-generated method stub
		System.out.println("To the right there's an Armourer, and to the left theres a Healer."
				+ " And to theres an odd force to the front" + "\n\t (You can go right, left, forth or back)");
	}

	@Override
	public void goForth() {
		// TODO Auto-generated method stub
		int pHP = p.health_level;
		int eHP = n.health_level;
		if(n.isAlive == true){
			System.out.println("Deep into the cave, you see the first general you must defeat on your"
					+"\n journey. You must eliminate everyone who leads the elven army. With your final"
					+ "\n target being the commander of the army himself, Eredin. The First General, Nithral "
					+"\nstands before you. He holds a long axe and seems well protected in his elven armor."
					);
			System.out.println("Nithral: You must be the witcher who seems to be culling our forces.."
					+"\n how very interesting.");
			System.out.println("He mutters something that sounds like elven speech. Both of you get ready "
					+"\n and assume your battle stances.");
			p.dialogueIntro(curLoc);
			n.dialogueIntro(curLoc);
			System.out.println("Type begin to fight!!");
			String fBegin="";
			while(!fBegin.equals("begin")) {
				fBegin = scan.next();
			}
			Watch wT = new Watch(p);
		UserFight uF = new UserFight(p,n,wT);
		EnemyFight eF = new EnemyFight(p,n);
		p.health_level = this.currMaxHP;
		try {
			uF.get_thread().join();
			eF.get_thread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(uF.done == true) {
			//lost to Nithral
			p.health_level = this.currMaxHP;
			n.health_level = eHP;
			
			n.dialogueVictory("cave");
			p.dialogueDefeat("cave");
		}
		else if(eF.done == true) {
			//won against Nithral
			p.health_level = this.currMaxHP;
			p.health_level+= 10;
			p.attack_level+= 10;
			p.coins+= 75;
			p.dialogueVictory("cave");
			n.dialogueDefeat("cave");
			System.out.println("now entering The Ice Mountain");
			The_IceMountainDraw();
			curLoc = "The Ice Mountain";
			The_IceMountain iM = new The_IceMountain(p);
			iM.lookAround();
		}
		//else {System.out.println("check2");}
			}
		else {
			//goto location 2
			System.out.println("now entering The Ice Mountain");
			The_IceMountainDraw();
			curLoc = "The Ice Mountain";
			The_IceMountain iM = new The_IceMountain(p);
			iM.lookAround();
		}
	}
	static void The_IceMountainDraw() {
		System.out.println(" .                  .-.    .  _   *     _   .\r\n"
				+ "           *          /   \\     ((       _/ \\       *    .\r\n"
				+ "         _    .   .--'\\/\\_ \\     `      /    \\  *    ___\r\n"
				+ "     *  / \\_    _/ ^      \\/\\'__        /\\/\\  /\\  __/   \\ *\r\n"
				+ "       /    \\  /    .'   _/  /  \\  *' /    \\/  \\/ .`'\\_/\\   .\r\n"
				+ "  .   /\\/\\  /\\/ :' __  ^/  ^/    `--./.'  ^  `-.\\ _    _:\\ _\r\n"
				+ "     /    \\/  \\  _/  \\-' __/.' ^ _   \\_   .'\\   _/ \\ .  __/ \\\r\n"
				+ "   /\\  .-   `. \\/     \\ / -.   _/ \\ -. `_/   \\ /    `._/  ^  \\\r\n"
				+ "  /  `-.__ ^   / .-'.--'    . /    `--./ .-'  `-.  `-. `.  -  `.\r\n"
				+ "@/        `.  / /      `-.   /  .-'   / .   .'   \\    \\  \\  .-  \\%\r\n"
				+ "@&8jgs@@%% @)&@&(88&@.-_=_-=_-=_-=_-=_.8@% &@&&8(8%@%8)(8@%8 8%@)%\r\n"
				+ "@88:::&(&8&&8:::::%&`.~-_~~-~~_~-~_~-~~=.'@(&%::::%@8&8)::&#@8::::\r\n"
				+ "`::::::8%@@%:::::@%&8:`.=~~-.~~-.~~=..~'8::::::::&@8:::::&8:::::'\r\n"
				+ " `::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::.'");
	}
	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		System.out.println("nowhere to go");
	}

}
