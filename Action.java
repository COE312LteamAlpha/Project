package proj1;

public class Action {

	Player p;
	BattleDuo b;
	public void attack() {
		b.AttackPlayer();
	}
	
	public void defense() {
		System.out.println("You are defending now!");
		System.out.println(p.getHealth());
	}
}
