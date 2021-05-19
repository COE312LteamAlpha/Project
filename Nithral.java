package Project;

public class Nithral extends Characters{
	
	public Nithral() {
		this.health_level = 200;
		this.attack_level = 40;
		this.bonus_attack = 10;
		this.isAlive=true;
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
