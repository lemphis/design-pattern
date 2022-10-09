package observer.ex1.push;

public interface Subject {

	void registerObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObserver();

}
