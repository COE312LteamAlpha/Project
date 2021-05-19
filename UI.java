package Project;

import java.util.Scanner;

public class UI implements Runnable{

	Scanner sc = new Scanner(System.in);
	static String curLoc=null;
	Nithral nT = new Nithral();
	
	public void begin() {
		System.out.println("Enter name: ");
		
		Player player = new Player(sc.next());
		System.out.println("Game begins: " + "\nPlayer stats: "
		+"Attack level: "+ player.attack_level + "\tHealth level: " + player.health_level);
		System.out.println("Goto \nOptions:Kaer Morhen\tThe Cave\tThe Ice Mountain\tSkellige");
		if(sc.nextLine().equalsIgnoreCase("the cave")) {
			The_Cave tC = new The_Cave(player,nT);
			curLoc = "The Cave";
		}
		else if(sc.nextLine().equalsIgnoreCase("kaer morhen")) {
			Kaer_Morhen kM = new Kaer_Morhen();
			curLoc = "Kaer Morhen";
		}
		else if(sc.nextLine().equalsIgnoreCase("the ice mountain")) {
			//if-else if location is unlocked
		}
		else if(sc.nextLine().equalsIgnoreCase("Skellige")) {
			//if-else if location is unlocked
		}
		
	}
	
	
	public void run() {}
}
