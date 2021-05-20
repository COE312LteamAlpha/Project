package Project;

import java.util.Scanner;


public class Driver {

	static String curLoc=null;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String pname = sc.next();
		Player player = new Player(pname);
		The_Cave  tC = new The_Cave(player);
		The_IceMountain tIM = new The_IceMountain(player);
		Skellige sK = new Skellige(player);

		System.out.println("Welcome " + pname+ "!\n\t\tGame begins: " + "\nPlayer stats: "+ "\tCoins:"+player.coins
				+"\tAttack level: "+ player.attack_level + "\tHealth level: " + player.health_level);
		//System.out.println("Goto \nOptions:Kaer Morhen\tThe Cave\tThe Ice Mountain\tSkellige");
		//String enter = sc.nextLine();
		//enter = enter.toLowerCase();
		//System.out.println(enter);
		//if(enter.equals("the cave")) {			}
		/*else if(enter.equalsIgnoreCase("kaer morhen")) {
				System.out.println("Now traveling to Kaer Morhen");
				curLoc = "Kaer Morhen";
				kM.lookAround();
			}
			else if(enter.equalsIgnoreCase("the ice mountain") || enter.equalsIgnoreCase("Skellige")) {
				//if-else if location is unlocked
				System.out.println("Cannot travel there yet!");
			}*/
		System.out.println("Now traveling to The Cave");
		curLoc = "The Cave";
		tC.lookAround();
		String[] commands = {"right","left","forth","back","quit","stats","use"};
		while(true) {
			String entry1=sc.next();
			boolean checkCom = false;
			for(int i=0;i<commands.length;i++) {
				if(entry1.equals(commands[i])) {
					checkCom = true;break;
				}
			}

			if(checkCom){
				if(entry1.equals("quit")) {
					System.out.print("quitting game");
					System.exit(0);
				}
				else if(entry1.equals("stats")) {
					System.out.print("Name: " + player.name +"\tCoins:"+player.coins+"\nPlayer stats: "
					+"Attack level: "+ player.attack_level + "\tHealth level: " + player.health_level);
				}
				else if(entry1.equals("use")) {
					for (int i = 0; i < player.potionsAv.size(); i++) {
					      System.out.println(player.potionsAv.get(i));
					    }
				}
				else {
				switch(curLoc) {
				case "The Cave":
					tC.goTo(entry1);break;
				case "The Ice Mountain":
					tIM.goTo(entry1);break;
				case "Skellige":
					sK.goTo(entry1);break;
				}
				}
			}
			else {
				System.out.print("Enter valid command");
			}
		}

	}
}
