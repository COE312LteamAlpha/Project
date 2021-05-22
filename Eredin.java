package proj1;

public class Eredin extends Characters implements States{

	public Eredin() {
		this.health_level = 1000;
		this.attack_level = 100;
		this.bonus_attack = 20;
		this.isAlive=true;
		a=new AttackEnemy();
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
		System.out.println("Eredin: (laughs) You're skilled Witcher! More so than I'd hoped! I can't lie "
				+ "I'm quite enjoying this! But all of this will be for nothing!!");
		System.out.println("\n Eredin's face covered in blood seemed to grow even more demonic as he seemed "
				+ "to have emptied his mind except for one single thought, and that was to kill the witcher.");
		
	}

	@Override
	public void prev(EredinStates context) {
		// TODO Auto-generated method stub
	}

	@Override
	public void next(EredinStates context) {
		// TODO Auto-generated method stub
		context.setState(new AngryEredin());
	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
		
	}
	

}