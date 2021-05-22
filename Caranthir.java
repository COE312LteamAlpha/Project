package proj1;

public class Caranthir extends Characters{

	
	public Caranthir() {
		this.health_level = 450;
		this.attack_level = 65;
		this.bonus_attack = 15;
		this.isAlive=true;
		a=new AttackEnemy();
	}
	
	
	
	@Override
	public void dialogueIntro(String currLoc) {
		// TODO Auto-generated method stub
		System.out.println("Caranthir: Witcher? So be it. Let us end this. You must know, "
				+ "you cannot win, even if you kill me.");
		
	}

	@Override
	public void dialogueVictory(String currLoc) {
		// TODO Auto-generated method stub
		System.out.println("Caranthir: Your fate was sealed from the beginning");
		
	}

	@Override
	public void dialogueDefeat(String currLoc) {
		// TODO Auto-generated method stub
		System.out.println("Caranthir: ARGHHHH!!!!");
		System.out.println("Caranthir is dead. Now you must face Eredin.");
		
	}

	

}