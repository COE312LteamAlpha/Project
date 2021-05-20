package Project;

public class Nithral extends Characters{
	
	public Nithral() {
		this.health_level = 200;
		this.attack_level = 40;
		this.bonus_attack = 10;
		this.isAlive=true;
	}
	
	public void dialogueIntro(String s) {
		System.out.println("Nithral: You are stubborn, Witcher.");
		System.out.println("Nithral: I wonder how long you'll last...");
		
		
	}
	public void dialogueVictory(String s) {
		System.out.println("Nithral: Didn't last so long after all....Pitiful.");
		
	}
	public void dialogueDefeat(String s) {
		System.out.println("Nithral yells out in pain for the last time as his body falls to the ground.\n" + 
	"He says nothing as his body succumbs to the excessive loss of blood.");
		
	}
	
	public synchronized int getHealth() {
		return this.health_level;
	}

}
