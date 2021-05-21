package proj1;

import java.util.ArrayList;

public class Player extends Characters{

	String name;
	int health_level;
	int attack_level;
	int bonus_attack;
	int coins;
	ArrayList<String> potionsAv = new ArrayList<String>();
	public Player(String name) {
		this.name = name;
		this.health_level = 250;
		this.attack_level = 50;
		this.bonus_attack = 15;
		this.coins=50;
	}


	public void pStats() {
		System.out.print("Name: " + this.name +"\tCoins:"+this.coins+"\nPlayer stats: "
				+"Attack level: "+ this.attack_level + "\tHealth level: " + this.health_level + "\tSpell Attack: " + this.bonus_attack);
	}
	@Override
	public void dialogueIntro(String s) {
		// TODO Auto-generated method stub 
		if(s.equals("cave"))
		{
			//System.out.println(this.name + ": Step aside. You can't beat me.");
		}
		if(s.equals("mountain")) {}
		if(s.equals("skellige")) {
			System.out.println(name + ": .....");
		}
		
		System.out.println(this.name + ": Step aside. You can't beat me.");
	}

	@Override
	public void dialogueVictory(String s) {
		// TODO Auto-generated method stub
		if(s.equals("cave"))
		{
			System.out.println(name + ": Seemed like I lasted long enough.");
		}
		if(s.equals("mountain")) {
			System.out.println("You slash Caranthir across his chest and leave a gaping fatal wound "
					+ "and finally thurst your blade right through his chest to end the battle!");
		}
		if(s.equals("skellige")) {
			//System.out.println(name + ": What?...I should've expected this.");
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
