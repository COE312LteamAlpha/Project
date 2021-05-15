package Project;

public class ConcreteObserver implements Observer{

	ConcreteSubject [] subject = null;
	public ConcreteObserver(ConcreteSubject [] subject)
	{
		this.subject = subject;
		for(int i = 0; i<subject.length; i++)
			subject[i].registerObserver(this);
	}
	public void update(Message m)
	{
		System.out.println("received a "+ m.payload+" message from "+m.origin);
	}

}
