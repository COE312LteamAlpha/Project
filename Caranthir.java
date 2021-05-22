package proj1;

public class Caranthir extends Characters{

	public Caranthir() {
		this.health_level = 450;
		this.attack_level = 65;
		this.bonus_attack = 15;
		this.isAlive=true;
	}
	
	@Override
	public void dialogueIntro(String currLoc) {
		// TODO Auto-generated method stub
		System.out.println("Caranthir: You must be the Witcher that's been going around "
				+ "\n thinning our forces. Do you humans love picking fights you "
				+ "\n can't win? Then, so be it. Let us end this. You must know, "
				+ "\n you cannot win, even if you kill me.");
		System.out.println("\n It's all meaningless!! You won't win this war!! Not as long as "
				+ "Eredin is with us...There's no way you can beat him. Not in a million years!");
		
	}

	@Override
	public void dialogueVictory(String currLoc) {
		// TODO Auto-generated method stub
		System.out.println("Caranthir: Your fate was sealed from the beginning. Big talk "
				+ "\n and no result...This seems to be normal behavior for you humans.");
		
	}

	@Override
	public void dialogueDefeat(String currLoc) {
		// TODO Auto-generated method stub
		System.out.println("Caranthir: ARGHHHH!!!!");
		
		
	}

}
