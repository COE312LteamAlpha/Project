package proj1;

public class UserDialogues extends Dialogues{

	String locatioN;
	UserDialogues(String locatioN){
		this.locatioN = locatioN;
	}
	@Override
	public void dialogueIntro() {
		// TODO Auto-generated method stub 
		if(locatioN.equals("The Cave"))
		{
			System.out.println(Player.name + ": Step aside. You can't beat me.");
		}
		else if(locatioN.equals("The Ice Mountain")) {
			System.out.println(Player.name + ": I see you've been expecting me. I won't disappoint");
			System.out.println("\n All you must know is that I won't stop until I kill your leader."
					+ "\n You won't be alive to tell him that yourself though. ");
		}
		else if(locatioN.equals("Skellige")) {
			System.out.println(": .....");
		}
		
		System.out.println(": Step aside. You can't beat me.");
	}

	@Override
	public void dialogueVictory() {
		// TODO Auto-generated method stub
		if(locatioN.equals("The Cave"))
		{
			System.out.println(Player.name +": Seemed like I lasted long enough.");
		}
		else if(locatioN.equals("The Ice Mountain")) {
			System.out.println(Player.name + ": DIE!!");
			System.out.println("You slash Caranthir across his chest and leave a gaping fatal wound "
					+ "\n and finally thurst your blade right through his chest to end the battle!");
		}
		else if(locatioN.equals("Skellige")) {
			System.out.println(Player.name + ": What?...I should've expected this.");
		}
		
		
	}

	@Override
	public void dialogueDefeat() {
		// TODO Auto-generated method stub
		System.out.println("You lose, but you managed to get away. Get stronger and \"\r\n"
				+ "					+ \"challenge your opponent again!");
		
	}
}
