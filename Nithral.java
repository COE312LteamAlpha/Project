package Project;

public class Nithral extends Characters {
	
	public Nithral(String name) {
		this.name = name;
		this.health_level = 200;
		this.attack_level = 15;
		this.bonus_attack = 10;
	}
	
	public void dialogueIntro() {
		
	}
	public void dialogueVictory() {
		
	}
	public void dialogueDefeat() {
		
	}
	
	public synchronized int getHealth() {
		return this.health_level;
	}

}
