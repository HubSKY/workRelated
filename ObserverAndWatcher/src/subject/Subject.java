package subject;

import oberver.Observer;

public interface Subject {

	public void attach(Observer ob);
	public void delTache(Observer ob);
	public void notify(String message);
	
}
