package proj1;

public class EnemyFight implements Runnable{

	Nithral n;
	Caranthir c;
	Eredin e;
	
	EnemyFight(Nithral n){
		this.n=n;
	}
	EnemyFight(Caranthir c){
		this.c = c;
	}
	EnemyFight(Eredin e){
		this.e=e;
	}
	
	public void run() {}
}
