package proj1;

public class EredinStates {
	private States state = new Eredin();

	public void previousState() {
		state.prev(this);
		}
		public void nextState() {
		state.next(this);
		}
		public void printStatus() {
		state.printStatus();
		}
		public void setState(States state) {
		this.state = state;
		}
}
