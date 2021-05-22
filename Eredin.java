package proj1;

public class Eredin extends Characters implements States{

	public Eredin() {
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
		context.setState(new AngryEredin());
	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
		
	}
	

}
