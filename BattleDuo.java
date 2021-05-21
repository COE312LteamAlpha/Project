package proj1;

public class BattleDuo{

	//String p1,p2;
	Player p;
	Characters boss;
	TCP_C tcp;
	public BattleDuo(Player p1, Nithral n){
		this.p=p1;
		this.boss = n;
		tcp = new TCP_C("192.168.1.102", 50807,this);
	}
	public BattleDuo(Player p1, Eredin e){
		this.p=p1;
		this.boss = e;
		tcp = new TCP_C("192.168.1.102", 50807,this);
	}
	public BattleDuo(Player p1, AngryEredin ae){
		this.p=p1;
		//this.boss = ae;
	}
	public BattleDuo(Player p1, Caranthir c){
		this.p=p1;
		this.boss = c;
		tcp = new TCP_C("192.168.1.102", 50807,this);
	}
	public void spellAttack() {
		boss.health_level -= p.bonus_attack;
		System.out.println("You used the damage spell Igni!! \tBoss HP:"+ boss.health_level);
	}
	public void comboAttack() {
		boss.health_level -= (p.bonus_attack + p.attack_level);
		System.out.println("Combo Attack! \tBoss HP:"+ boss.health_level);
	}
	public synchronized void AttackEnemy() {
		boss.health_level -= p.attack_level;
		System.out.println("Player attacked! \tBoss HP:" + boss.health_level);
		// add phone swipe stuff
	}
	
	public synchronized void AttackPlayer() {
		p.health_level -= boss.attack_level;
		System.out.println("Boss attacked! \tPlayer HP:" + p.health_level);

	}
	
	
}