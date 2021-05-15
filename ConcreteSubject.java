package proj1;

import java.util.ArrayList;

public class ConcreteSubject implements Subject{

	private ArrayList observers;
	public ConcreteSubject()
	{
		observers = new ArrayList();
	}
	public void publishMessage(Message m)
	{
		for (int i = 0; i < observers.size(); i++)
		{
			Observer observer = (Observer) observers.get(i);
			observer.update(m);
		}
	}
	public void registerObserver(Observer o)
	{
		observers.add(o);
	}

	public void removeObserver(Observer O) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(O);
		if (i>=0) observers.remove(i);
	}

}
