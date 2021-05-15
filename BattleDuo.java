package Project;

public class BattleDuo{

	String p1,p2;
	boolean currMove;
	Player p;
	Characters boss;
	public BattleDuo(Player p1, Characters boss){
		this.p=p1;
		this.boss = boss;
	}
	
	
	public synchronized void AttackEnemy() {
		boss.health_level -= p.attack_level;
		// add phone swipe stuff
	}
	
	public synchronized void AttackPlayer() {
		p.health_level -= boss.attack_level;
	}
	
	
}
