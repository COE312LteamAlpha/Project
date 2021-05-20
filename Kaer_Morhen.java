package Project;

public class Kaer_Morhen implements Locations{

	Kaer_Morhen(){
	}
	public void goTo(String loc) {
		if(loc=="right") {
			L_right();
		}
		else if(loc=="left") {
			L_left();
		}
		else if(loc=="front") {
			goForth();
		}
		else if(loc=="back") {
			goBack();
		}
	}
	@Override
	public void L_right() {
		// TODO Auto-generated method stub
		System.out.println("A place to sleep");
	}

	@Override
	public void L_left() {
		// TODO Auto-generated method stub
		System.out.println("Wardrobe fun!");		
	}

	@Override
	public boolean battles() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void lookAround() {
		// TODO Auto-generated method stub
		System.out.println("welcome to Kaer Morhen");

	}

	@Override
	public void goForth() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		
	}

}
