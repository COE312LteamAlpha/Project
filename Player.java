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
			System.out.println(this.name + ": Step aside. You can't beat me.");
		}
		if(s.equals("mountain")) {
			System.out.println(this.name + ": I see you've been expecting me. I won't disappoint");
			System.out.println("\n All you must know is that I won't stop until I kill your leader."
					+ "\n You won't be alive to tell him that yourself though. ");
			
		}
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
		if(s.equals("mountain")) {
			System.out.println(this.name + ": DIE!!");
			System.out.println("You slash Caranthir across his chest and leave a gaping fatal wound "
					+ "\n and finally thurst your blade right through his chest to end the battle!");
		}
		if(s.equals("skellige")) {
			System.out.println(name + ": What did you have to tell me?..");
		}
		
		
	}

	@Override
	public void dialogueDefeat(String s) {
		// TODO Auto-generated method stub
		if(s.equals("cave"))
		{
			System.out.println("You lose, but you managed to get away. Get stronger and \"\r\n"
					+ "					+ \"challenge your opponent again!");
		}
		if(s.equals("mountain")) {
			System.out.println("You lose, but you managed to get away. Get stronger and \"\r\n"
					+ "					+ \"challenge your opponent again!");
		}
		if(s.equals("skellige")) {
			System.out.println("You lose, but you managed to get away. Get stronger and \"\r\n"
					+ "					+ \"challenge your opponent again!");
		}
		
	}
	
	public synchronized int getHealth() {
		return this.health_level;
	}
	
}
