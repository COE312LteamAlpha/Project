package Project;

public class Player extends Characters{

	String name;
	int health_level;
	int attack_level;
	int bonus_attack;
	int coins;
	int armor;
	public Player(String name) {
		this.name = name;
		this.health_level = 250;
		this.attack_level = 75;
		this.bonus_attack = 15;
		this.coins=50;
		this.armor = 0;
	}
	


	@Override
	public void dialogueIntro(String s) {
		// TODO Auto-generated method stub 
		if(s.equals("cave"))
		{
			System.out.println(name + ": Step aside. You can't beat me.");
		}
		if(s.equals("mountain")) {}
		if(s.equals("skellige")) {
			System.out.println(name + ": .....");
		}
		
		
	}

	@Override
	public void dialogueVictory(String s) {
		// TODO Auto-generated method stub
		if(s.equals("cave"))
		{
			System.out.println(name + ": Seemed like I lasted long enough.");
		}
		if(s.equals("mountain")) {}
		if(s.equals("skellige")) {
			System.out.println(name + ": What?...I should've expected this.");
		}
		
		
	}

	@Override
	public void dialogueDefeat(String s) {
		// TODO Auto-generated method stub
		if(s.equals("cave"))
		{
			System.out.println("YOU HAVE DIED.");
		}
		if(s.equals("mountain")) {
			System.out.println("YOU HAVE DIED");
		}
		if(s.equals("skellige")) {
			System.out.println("YOU HAVE DIED.");
		}
		
	}
	
	public synchronized int getHealth() {
		return this.health_level;
	}
	
}
