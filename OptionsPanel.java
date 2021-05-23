package proj1;

public class OptionsPanel {

	Command []slots;

	public OptionsPanel(Command[] s) {

		this.slots=s;
	}

	public void optionSelected(int Index) {

		slots[Index].execute();

	}
}
