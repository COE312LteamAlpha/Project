package Project;

public abstract class Characters {
	String name;
	boolean isAlive;
	int health_level;
	int attack_level;
	int bonus_attack;
	
	public Characters() {	}
	public abstract void dialogueIntro();
	public abstract void dialogueVictory();
	public abstract void dialogueDefeat();
	
	
}
