package proj1;

public abstract class Characters {
	String name;
	boolean isAlive;
	int health_level;
	int attack_level;
	int bonus_attack;
	Attack []a_player=new Attack [3];
	Attack a;
	public Characters() {	}
	public abstract void dialogueIntro(String currLoc);
	public abstract void dialogueVictory(String currLoc);
	public abstract void dialogueDefeat(String currLoc);
	
	
	public void EnemyAttacks() {
		a.attack();
	}
	
	public void PlayerAttacks() {
		for(int i=0;i<a_player.length;i++) {
			a_player[i].attack();	
		}
	}
}