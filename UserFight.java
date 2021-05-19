package Project;

public class UserFight implements Runnable {

	Player p;
	Characters boss;
	BattleDuo battle;
	boolean done;
	
	public UserFight(Player p,Nithral n) {
		this.p=p;
		BattleDuo battle1 = new BattleDuo(p, n);
		this.battle = battle1;
		Thread t1 = new Thread(this);
		t1.start();
	}
	public UserFight(Player p,Caranthir n) {
		this.p=p;
		BattleDuo battle1 = new BattleDuo(p, n);
		this.battle = battle1;
		Thread t1 = new Thread(this);
		t1.start();
	}
	public UserFight(Player p,Eredin n) {
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