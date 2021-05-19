package Project;

public class BattleDuo{

	String p1,p2;
	Player p;
	Characters boss;
	public BattleDuo(Player p1, Nithral n){
		this.p=p1;
		this.boss = n;
	}
	public BattleDuo(Player p1, Eredin e){
		this.p=p1;
		this.boss = e;
	}
	public BattleDuo(Player p1, Caranthir c){
		this.p=p1;
		this.boss = c;
	}
	
	public synchronized void AttackEnemy() {
		boss.health_level -= p.attack_level;
		// add phone swipe stuff
	}
	
	public synchronized void AttackPlayer() {
		p.health_level -= boss.attack_level;
	}
	
	
}
