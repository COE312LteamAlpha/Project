package proj1;

public class UserFight implements Runnable {

	Player p;
	int extraHealth;
	int extraAttack;
	
	public UserFight(Player p, int extraHealth, int extraAttack) {
		this.p=p;
		this.extraAttack = extraAttack;
		this.extraHealth=extraHealth;
		Thread t1 = new Thread(this);
		t1.start();
	}

	public synchronized void Ufight(boolean currMove) {
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
