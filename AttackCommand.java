package proj1;

public class AttackCommand implements Command{

	Action a;
	public AttackCommand(Action a) {

		this.a = a;
	}

	@Override

	public void execute() {
		// TODO Auto-generated method stub
		a.attack();
	}

}
