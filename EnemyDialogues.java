package proj1;

public class EnemyDialogues extends Dialogues{

	String locatioN;
	EnemyDialogues(	String locatioN){
		this.locatioN = locatioN;
	}
	@Override
	void dialogueIntro() {
		// TODO Auto-generated method stub
		if(locatioN.equals("The Cave")) {
			System.out.println("Nithral: You are stubborn, Witcher.");
			System.out.println("Nithral: I wonder how long you'll last...");
		}
		else if(locatioN.equals("The Ice Mountain")) {
			System.out.println("Caranthir: You must be the Witcher that's been going around "
					+ "\n thinning our forces. Do you humans love picking fights you "
					+ "\n can't win? Then, so be it. Let us end this. You must know, "
					+ "\n you cannot win, even if you kill me.");
			System.out.println("\n It's all meaningless!! You won't win this war!! Not as long as "
					+ "Eredin is with us...There's no way you can beat him. Not in a million years!");
		}
		else if(locatioN.equals("Skellige")) {
			System.out.println("Eredin: Witcher....I was hoping you'd come...");
			System.out.println("I have something to tell you....But I'll do so afterwards..As you expire.");
		}
	}
	@Override
	void dialogueVictory() {
		// TODO Auto-generated method stub
		if(locatioN.equals("The Cave")) {
			System.out.println("Nithral: Didn't last so long after all....Pitiful.");
		}
		else if(locatioN.equals("The Ice Mountain")) {
			System.out.println("Caranthir: Your fate was sealed from the beginning. Big talk "
					+ "\n and no result...This seems to be normal behavior for you humans.");
		}
		else if(locatioN.equals("Skellige")) {
			System.out.println("You've been sent on a suicide mission this whole time....\n" + 
					"I guess in that sense you've completed your duty...(laughs)");
		}
		else if(locatioN.equals("Skellige2")) {
			System.out.println("Eredin: You've been sent on a suicide mission this whole time....\n" + 
					"I guess in that sense you've completed your duty...You're as strong as "
					+ "\n they and more Witcher.(laughs) That was a splendid battle.");
		}
	}
	@Override
	void dialogueDefeat() {
		// TODO Auto-generated method stub
		if(locatioN.equals("The Cave")) {
			System.out.println("Nithral yells out in pain for the last time as his body falls to the ground.\n" + 
					"He says nothing as his body succumbs to the excessive loss of blood.");
		}
		else if(locatioN.equals("The Ice Mountain")) {
			System.out.println("Caranthir: ARGHHHH!!!!");
			System.out.println("Caranthir is dead. Now you must face Eredin.");
		}
		else if(locatioN.equals("Skellige")) {
			System.out.println("Eredin: (laughs) You're skilled Witcher! More so than I'd hoped! I can't lie "
					+ "I'm quite enjoying this! But all of this will be for nothing!!");
			System.out.println("\n Eredin's face covered in blood seemed to grow even more demonic as he seemed "
					+ "to have emptied his mind except for one single thought, and that was to kill the witcher.");
		}
		else if(locatioN.equals("Skellige2")) {
			System.out.println("Eredin: Impossible...! I've been bested by your worthless feints and pirouettes...How pathetic..");
			System.out.println("The King sent you on a suicide mission and ran away with the "
					+ "darling princess all on his own...My soldiers saw it and reported it to me..");
			System.out.println("\n The last of the light in Eredin's eyes faded as he passed with a "
					+ "expressionless face");
		}
	}
}
