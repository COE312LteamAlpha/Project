package Project;

public class Eredin extends Characters {

	public Eredin() {
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
		System.out.println("Impossible...! I've been bested by your stupid feints and pirouettes...How pathetic..");
		
	}

	/*public State state = new OrderedState();
	
	public void setState(State state) {
		this.state = state;
	}
	
	@Override
	public void prev(Eredin context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void next(Eredin context) {
		// TODO Auto-generated method stub
		context.setState(new AngryEredin());
		//Start fight with Angry Eredin 
		
		
	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
		
	}*/
	

}
