package proj1;

import java.util.Random;

public class EnemyFight implements Runnable{

	BattleDuo battle;
	Player p;
	Characters boss;
	int health;
	Thread t1;
	Random rand = new Random();
	boolean done = false;
	
	public EnemyFight(Player p,Nithral n) {
		this.p=p;
		this.boss = n;
		BattleDuo battle1 = new BattleDuo(p, n);
		this.battle = battle1;
		t1 = new Thread(this);
		t1.start();
	}
	public EnemyFight(Player p,Caranthir n) {
		this.p=p;
		this.boss=n;
		BattleDuo battle1 = new BattleDuo(p, n);
		this.battle = battle1;
		t1 = new Thread(this);
		t1.start();
	}
	public EnemyFight(Player p,Eredin n) {
		this.p=p;
		this.boss=n;
		BattleDuo battle1 = new BattleDuo(p, n);
		this.battle = battle1;
		t1 = new Thread(this);
		t1.start();
	}
	public EnemyFight(Player p,AngryEredin n) {
		this.p=p;
		this.boss=n;
		BattleDuo battle1 = new BattleDuo(p, n);
		this.battle = battle1;
		t1 = new Thread(this);
		t1.start();
	}
	
	public Thread get_thread() {
		return t1;
	}
	
	public void run() {
		while(!done) {
			if(boss.health_level <= 0)
			{
				System.out.println("You have defeated your opponent!");//gotta improve this
				boss.isAlive=false;
				Watch.tm=false;
				done = true;
			}
			else if(p.health_level <= 0) {
				//System.out.println("Player lost!");
				//done = true;
				Watch.tm=false;
				break;
			}
			else
			{
				battle.AttackPlayer();
			}
			try {
				Thread.sleep(rand.nextInt(3000));
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
}
