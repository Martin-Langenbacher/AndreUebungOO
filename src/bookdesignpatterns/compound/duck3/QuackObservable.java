package bookdesignpatterns.compound.duck3;

public interface QuackObservable {
	
	public void registerObserver(Observer observer);
	public void notifyObservers();

}
