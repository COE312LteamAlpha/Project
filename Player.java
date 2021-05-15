package Project;

public class Player extends Characters{

	String name;
	int health_level;
	int attack_level;
	int bonus_attack;
	int coins;
	public Player(String name) {
		this.name = name;
		this.health_level = 250;
		this.attack_level = 75;
		this.bonus_attack = 15;
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
	
	public synchronized int getHealth() {
		return this.health_level;
	}
	
}
