package Project;

public abstract class Potion {
	
	void makePotion() {
		ingredient1();
		ingredient2();
		ingredient3();
	}
	
	abstract void ingredient1();
	abstract void ingredient2();
	abstract void ingredient3();

}
