package Project;

public class ConcreteObserver implements Observer{

	Subject subject = null;
	public ConcreteObserver(Subject subject){
		this.subject = subject;
		subject.registerObserver(this);
		}
	public void update(Message m)
	{
		System.out.println("received a "+ m.payload+" message from "+m.origin);
	}

}
