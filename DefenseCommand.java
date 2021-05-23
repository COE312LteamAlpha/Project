package proj1;

public class DefenseCommand implements Command{

	Action a;
	public DefenseCommand(Action a) {

		this.a = a;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		a.defense();
	}

}
