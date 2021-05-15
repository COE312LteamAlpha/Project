package Project;

public class EnemyFight implements Runnable{

	Nithral n;
	Caranthir c;
	Eredin e;
	Characters boss;
	Player p;
	
	int health;
	
	boolean done = false;
	
	EnemyFight(Nithral n, Player p){
		this.boss=n;
		this.health = n.health_level;
		this.p = p;
	}
	EnemyFight(Caranthir c){
		this.boss = c;
		this.health = c.health_level;
		this.p = p;
	}
	EnemyFight(Eredin e){
		this.boss=e;
		this.health = e.health_level;
		this.p = p;
	}
	
	BattleDuo battle = new BattleDuo(p, boss);
	
	
	
	public void run() {
		while(!done) {
			if(boss.health_level == 0)
			{
				done = true;
			}
			else
			{
				battle.AttackPlayer();
			}
			try {
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
}
