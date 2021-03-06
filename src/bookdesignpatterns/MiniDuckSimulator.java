package bookdesignpatterns;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.display();
		model.performQuack();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		model.setFlyBehavior(new FlyNoWay());
		model.performFly();
		model.swim();
	}
}
