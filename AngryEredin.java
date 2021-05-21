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
		System.out.println("You've been sent on a suicide mission this whole time....\n" + 
		"I guess in that sense you've completed your duty...(laughs)");
		
	}

	@Override
	public void dialogueDefeat(String s) {
		// TODO Auto-generated method stub
		System.out.println("Impossible...! I've been bested by your worthless feints and pirouettes...How pathetic..");
		
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

