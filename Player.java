package proj1;

import java.util.ArrayList;

public class Player extends Characters{

	static String name;
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
	
	public synchronized int getHealth() {
		return this.health_level;
	}
	
}
