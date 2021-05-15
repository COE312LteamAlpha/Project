package proj1;

public class Player extends Characters{

	String name;
	int health_level;
	int attack_level;
	int bonus_attack;
	int coins;
	public Player(String name) {
		this.name = name;
		this.health_level = 100;
		this.attack_level = 10;
		this.bonus_attack = 25;
		this.coins=50;
	}


	@Override
	public void dialogueIntro() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dialogueVictory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dialogueDefeat() {
		// TODO Auto-generated method stub
		
	}
	
}
