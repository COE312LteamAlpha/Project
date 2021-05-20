package Project;


public class UserFight extends ConcreteObserver implements Runnable {

	Player p;
	Characters boss;
	BattleDuo battle;
	boolean done=false;
	
	public UserFight(Player p,Nithral n,Subject subject) {
		super(subject);
		this.p=p;
		BattleDuo battle1 = new BattleDuo(p, n);
		this.battle = battle1;
		Thread t1 = new Thread(this);
		t1.start();
	}
	public UserFight(Player p,Caranthir n,Subject subject) {
		super(subject);
		this.p=p;
		BattleDuo battle1 = new BattleDuo(p, n);
		this.battle = battle1;
		Thread t1 = new Thread(this);
		t1.start();
	}
	public UserFight(Player p,Eredin n,Subject subject) {
		super(subject);
		this.p=p;
		BattleDuo battle1 = new BattleDuo(p, n);
		this.battle = battle1;
		Thread t1 = new Thread(this);
		t1.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!done) {
			if(p.health_level == 0) {
				System.out.println("Player lost!");
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
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
	}

}