package Project;

public class UserFight implements Runnable {

	Player p;
	int extraHealth;
	int extraAttack;
	Characters boss;
	boolean done;
	
	public UserFight(Player p, int extraHealth, int extraAttack, Characters boss) {
		this.p=p;
		this.extraAttack = extraAttack;
		this.extraHealth=extraHealth;
		this.boss = boss;
		Thread t1 = new Thread(this);
		t1.start();
	}
	
	BattleDuo battle = new BattleDuo(p, boss);

	public synchronized void Ufight(boolean currMove) {
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!done) {
			if(p.health_level == 0) {
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
