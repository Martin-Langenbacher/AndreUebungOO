package bookdesignpatterns.compound.duck2;

public class DuckFactory extends AbstractDuckFactory {

	public Quackable createMallardDuck() {
		return new MallardDuck();
	}
  
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}
  
	public Quackable createDuckCall() {
		return new DuckCall();
	}
   
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}
	
	/*
	public Quackable createGoose() {
		return (Quackable) new GooseAdapter(null);
	}
	*/

}
