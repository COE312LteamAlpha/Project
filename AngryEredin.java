package proj1;

public class AngryEredin extends Characters implements States{

	public AngryEredin() {
		this.health_level = 1000;
		this.attack_level = 100;
		this.bonus_attack = 20;
		this.isAlive=true;
	}
	
	@Override
	public void dialogueIntro(String s) {
		// TODO Auto-generated method stub
		System.out.println("Eredin: Witcher....I was hoping you'd come...");
		System.out.println("I have something to tell you....But I'll do so afterwards..As you expire.");
		
		
	}

	@Override
	public void dialogueVictory(String s ) {
		// TODO Auto-generated method stub
		System.out.println("Eredin: You've been sent on a suicide mission this whole time....\n" + 
		"I guess in that sense you've completed your duty...You're as strong as "
		+ "\n they and more Witcher.(laughs) That was a splendid battle.");
		
	}

	@Override
	public void dialogueDefeat(String s) {
		// TODO Auto-generated method stub
		System.out.println("Eredin: Impossible...! I've been bested by your worthless feints and pirouettes...How pathetic..");
		System.out.println("The King sent you on a suicide mission and ran away with the "
				+ "\n darling princess all on his own...My soldiers saw it and reported it to me..");
		System.out.println("\n The last of the light in Eredin's eyes faded as he passed with a "
				+ "\n expressionless face \n");
		
		
	}

	@Override
	public void prev(EredinStates context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void next(EredinStates context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
		System.out.println("Eredin lvl2!!");
	}
	

}

