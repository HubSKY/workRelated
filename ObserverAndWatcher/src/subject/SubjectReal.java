package subject;

import java.util.ArrayList;
import java.util.List;

import oberver.Observer;

public class SubjectReal implements Subject {
	private List<Observer> observers = new ArrayList<Observer>();

	@Override
	public void attach(Observer ob) {
		// TODO Auto-generated method stub
		observers.add(ob);

	}

	@Override
	public void delTache(Observer ob) {
		observers.remove(ob);
	}

	@Override
	public void notify(String message) {
		// TODO Auto-generated method stub
		for (Observer ob : observers) {
			ob.updateM(message);;
		}

	}

}
