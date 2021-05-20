package Project;

import java.util.Random;

public class UserFight extends ConcreteObserver implements Runnable {

	Player p;
	Characters boss;
	BattleDuo battle;
	int pHP;
	Random rand = new Random();
	Thread t1;
	boolean done=false;
	
	public UserFight(Player p,Nithral n,Subject subject) {
		super(subject);
		this.p=p;this.boss = n;
		//pHP = p.health_level;
		BattleDuo battle1 = new BattleDuo(p, n);
		this.battle = battle1;
		t1 = new Thread(this);
		t1.start();
	}
	public UserFight(Player p,Caranthir n,Subject subject) {
		super(subject);
		this.p=p;this.boss = n;
		//pHP = p.health_level;
		BattleDuo battle1 = new BattleDuo(p, n);
		this.battle = battle1;
		t1 = new Thread(this);
		t1.start();
	}
	public UserFight(Player p,Eredin n,Subject subject) {
		super(subject);
		this.p=p;this.boss = n;
		//pHP = p.health_level;
		BattleDuo battle1 = new BattleDuo(p, n);
		this.battle = battle1;
		t1 = new Thread(this);
		t1.start();
	}
	
	public Thread get_thread() {
		return t1;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Prepare for battle!!");
		System.out.println("           /\\                                                 /\\\r\n"
				+ " _         )( ______________________   ______________________ )(         _\r\n"
				+ "(_)///////(**)______________________> <______________________(**)\\\\\\\\\\\\\\(_)\r\n"
				+ "           )(                                                 )(\r\n"
				+ "           \\/                                                 \\/");
		
		while(!done) {
			if(p.health_level <= 0) {
				System.out.println("Player lost!");
				//p.health_level = pHP;
				done = true;
			}
			else if(boss.health_level <= 0)
			{
				//System.out.println("Enemy lose!");//gotta improve this
				boss.isAlive=false;
				done = true;
			}
			else if(Watch.timer == 0) {
				done=true;
			}
			else
			{
				battle.AttackEnemy();
			}
			try {
				Thread.sleep(rand.nextInt(3000));
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
		
	}

}