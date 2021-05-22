package proj1;

public class AngryEredin extends Characters implements States{

	public AngryEredin() {
		this.health_level = 1000;
		this.attack_level = 100;
		this.bonus_attack = 20;
		this.isAlive=true;
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
