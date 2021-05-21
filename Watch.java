package proj1;

public class Watch extends ConcreteSubject implements Runnable{

	Player p;
	static int timer;
	Thread t;
	static boolean tm;
	Watch(Player p){
		this.p=p;
		this.timer=120;
		tm=true;
		this.t = new Thread(this);
		t.start();
	}
	public void stopW() {
		tm=false;
	}
	public void run() {
		try {
			System.out.println("Battle Timer begins now!" + "\nSeconds left: " + timer);
			while(true) {
				
				if(tm==true) {
				if(timer==0) {
					System.out.println("Time's up! Battle is over and you lose!");
					t.stop();
				}
				timer--;
				Thread.sleep(1000);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
