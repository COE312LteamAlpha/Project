package proj1;

public abstract class Characters {
	String name;
	boolean isAlive;
	int health_level;
	int attack_level;
	int bonus_attack;
	
	public Characters() {	}
	public abstract void dialogueIntro(String currLoc);
	public abstract void dialogueVictory(String currLoc);
	public abstract void dialogueDefeat(String currLoc);
	
	
}
