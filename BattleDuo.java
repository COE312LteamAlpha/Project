package proj1;

public class BattleDuo implements Runnable{

	String p1,p2;
	boolean currMove;
	EnemyFight eF;
	Player p;
	BattleDuo(Player p1,EnemyFight p2){
		this.p=p1;
		this.eF=p2;
		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	
}
