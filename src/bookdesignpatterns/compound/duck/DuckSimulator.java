package bookdesignpatterns.compound.duck;

public class DuckSimulator {

	public static void main(String[] args) {
		
		DuckSimulator simulator = new DuckSimulator();
		
		// new for Factory:
		// 1) First we create the factory that we are going to pass into the simulate() method
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		
		simulator.simulate(duckFactory);
		//simulator.simulate();
	}

	void simulate(AbstractDuckFactory duckFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		//Quackable gooseDuck = duckFactory.createGoose();
		//Quackable gooseDuck = gooseFactory.createGoose(); // ?????????????????????
		
		/* ======>   ! ! ! ! !
			You could add a createGooseDuck() method to the existing Duck Factories. Or, you could
			create a completely separate Factory for creating families of Geese.
		 <<<======== ! ! ! ! !     */
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simulator: With Abstract Factory");
		
		
	/*
	void simulate() {
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simulator: With Decorator");
		*/

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);

		System.out.println("The ducks quacked " + 
		                   QuackCounter.getQuacks() + " times !");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}

}

// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!   <<<========

//Why this did not work: DuckSimulator3.java --> I had to change the DuckSimulator.java instead...
//--->>> only DuckSimulator.java worked... ==> WHY ???






/*
package bookdesignpatterns.compound.duck;

public class DuckSimulator {

	public static void main(String[] args) {
		
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}
  
	void simulate() {
		Quackable mallardDuck = new MallardDuck();
		Quackable redheadDuck = new RedheadDuck();
		Quackable duckCall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());
		 
		System.out.println("\nDuck Simulator: With Goose Adapter");
		//System.out.println("\nDuck Simulator");
 
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
	}
   
	void simulate(Quackable duck) {
		duck.quack();
	}

}
*/