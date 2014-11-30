package subject;

import observers.Observer;

public interface Subject {
	void registarObserver(Observer observer);

	void unregisterObserver(int index);

	void notifyObservers();
}
