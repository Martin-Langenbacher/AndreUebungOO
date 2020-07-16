package bookdesignpatternsstarbuzz;

import bookdesignpatternsstarbuzz.Beverage.Size;

public class Mocha extends CondimentDecorator{
	//Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	
		
	public double cost() {
		//System.out.println(beverage.getSize() + "=====================================================");
		double cost = beverage.cost();
		if (beverage.getSize() == Size.TALL) {
			cost += .20;
		} else if (beverage.getSize() == Size.GRANDE) {
			cost += .25;
		} else if (beverage.getSize() == Size.VENTI) {
			cost += .30;
		}
		return cost;
	}
}
