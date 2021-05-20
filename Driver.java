package Project;

import java.util.Scanner;


public class Driver {

	static String curLoc=null;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		Player player = new Player(sc.next());
		Nithral nT = new Nithral();
		The_Cave  tC = new The_Cave(player,nT);
		Kaer_Morhen kM = new Kaer_Morhen();
		The_IceMountain tIM = new The_IceMountain(player);
		Skellige sK = new Skellige(player);
		new TCP_C("192.168.100.40", 49395);
			
			System.out.println("Game begins: " + "\nPlayer stats: "
			+"Attack level: "+ player.attack_level + "\tHealth level: " + player.health_level);
			System.out.println("Goto \nOptions:Kaer Morhen\tThe Cave\tThe Ice Mountain\tSkellige");
			String enter = sc.nextLine().toLowerCase();
			if(enter.equals("the cave")) {
				System.out.println("The Cave");
				curLoc = "The Cave";
				tC.lookAround();
			}
			else if(enter.equalsIgnoreCase("kaer morhen")) {
				System.out.println("Kaer Morhen");
				curLoc = "Kaer Morhen";
				kM.lookAround();
			}
			else if(enter.equalsIgnoreCase("the ice mountain") || enter.equalsIgnoreCase("Skellige")) {
				//if-else if location is unlocked
			}
			new TCP_C("192.168.100.40", 49395);
			String entry1=sc.next();
			while(!entry1.equalsIgnoreCase("exit")) {
				
				switch(The_Cave.curLoc) {
				case "The Cave":
					tC.goTo(TCP_C.movement);break;
				case "Kaer Morhen":
					kM.goTo(TCP_C.movement);break;
				case "The Ice Mountain":
					tIM.goTo(TCP_C.movement);break;
				case "Skellige":
					sK.goTo(TCP_C.movement);break;
						
				}
			}
		
	}
}
