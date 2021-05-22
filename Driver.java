package proj1;

import java.util.Scanner;



public class Driver {


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
		System.out.println("You are a Witcher. A human weapon who has gone through immense mutations and training to be strong"
				+ "\n enough to take on deadly monsters single handely. You've been tasked with eliminating three other worldly "
				+ "\n elves who threaten to" +
				" wipe out humanity unless they submit into sacrificing their royal elder-blooded princess "
				+ "\n for the selfish motives of the elven race." + 
				"Having known the princess personally and actually being her swordsmanship mentor, you've come to know and care"
				+ "\n for her quite well. Concerned for her safety, "
				+ "\n you agree to the mission handed out to you by the king.");
		System.out.println("\n An ordinary Witcher might've chosen to stay out of this if the "
				+ "\n pay was not high enough, but not our hero. A compassionate, stoic but "
				+ "\n resilient warrior who feels like he has a duty protecting other people due to his strength"
				+ "\n is just what the people need in this time of turmoil. Our hero is onwards to his journey towards a nearby"
				+ "\n cave where there have been reports of sighting a elven battalion. Humnity's counter attack begins now!");
		System.out.println("*                               \r\n"
				+ "       .(/        */%#**                \r\n"
				+ "   *&     %       ,/(/*,                \r\n"
				+ "     #.    %(   / ,,/((,#               \r\n"
				+ "       &     %,(  **,#((/               \r\n"
				+ "        ## #&%(/*&(#%%(((*%/            \r\n"
				+ "       #/%/&&&%&(/#&@@@&(%@%&#(/        \r\n"
				+ "      #%%%%&(%&&&,*(@%&(&&&@&&&%##//    \r\n"
				+ "      ##&#&#%##((##/*,(#(%%@@##%(&&/    \r\n"
				+ "     *%@&@@(%%#%@#(#@@@(##%%%(@@@@&&    \r\n"
				+ "     #&&@@@#%@(&&@(%@&%%%&&%(#@&@#@%#   \r\n"
				+ "    *&@&&&@&##&&@@@@@#&@@@&&#&@@&&(&&/  \r\n"
				+ "    ,(#&@@&&@%#%&&&&%&&@@&%&%@@@@&&#*,  \r\n"
				+ "  ,.%%&#    &#*%@@&@@@@@@&%#(.   /&%**, \r\n"
				+ "  ,/%&&#    *(##&&&&&@@&@&(#(    .#%%#/.\r\n"
				+ " *##&&&/    &#(#%&&&&@@&&&(#(&/  /&@@%#%\r\n"
				+ " (%&&&%    #(#/%&%%&&&&&&&(/(%,% .&@@&%%\r\n"
				+ " %%&&%      &&&&&&&&&&(%#&%(/## @*&@@@&#\r\n"
				+ " #%#%*    %##&&&&&&%%%&&&&&&#(%/  ,@@@& \r\n"
				+ " ((###*    &&%.%&%%%&&&&&&&%(#&  ((%&&% \r\n"
				+ " ((%..%%  /%#%%%%%%%%%%%%%%%(((. *#&&&# \r\n"
				+ "  (#%#%/ ,%%%%%/#%%% /%########% &&%*%  \r\n"
				+ "          #%#//####*  #######((% (%%%(  \r\n"
				+ "          #######%#    ######,#% #%#((");
		
		System.out.println("\n Now traveling to The Cave");
		The_Cave.curLoc = "The Cave";
		tC.lookAround();
		String[] commands = {"right","left","forth","back","quit","stats","use","map"};
		while(true) {
			String entry1=sc.next();
			boolean checkCom = false;
			for(int i=0;i<commands.length;i++) {
				if(entry1.equals(commands[i])) {
					checkCom = true;
					break;
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
				else if(entry1.equals("map")) {
					switch(The_Cave.curLoc) {
					case "The Cave":
						tC.map();break;
					case "The Ice Mountain":
						tIM.map();break;
					case "Skellige":
						sK.map();break;
					}
				}
				else {
				switch(The_Cave.curLoc) {
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
				//System.out.print("Enter valid command");
			}
		}

	}
}
