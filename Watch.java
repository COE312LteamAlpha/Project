package Project;

public class Watch implements Runnable{

	Player p;
	static int timer;
	Thread t;
	Watch(Player p){
		this.p=p;
		this.timer=120;
		this.t = new Thread(this);
		t.start();
	}
	
	public void run() {
		try {
			System.out.println("Battle Timer begins now!" + "\nSeconds left: " + timer);
			while(true) {
				
				//System.out.println("Battle Timer begins now!" + "\nSeconds left: " + x);
				if(timer==0) {
					System.out.println("Time's up! Battle is over and you lose!");
					t.stop();
					
				}
				timer--;
				Thread.sleep(1000);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
