package bookdesignpatternsstarbuzz;

import bookdesignpatternsstarbuzz.Beverage.Size;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + String.format("%.2f",  beverage.cost()));
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + String.format("%.2f",  beverage2.cost()));
		
		Beverage beverage3 = new HouseBlend();
		beverage3.setSize(Size.VENTI);
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + String.format("%.2f",  beverage3.cost()));
		
		
		Beverage beverage4 = new Espresso();
		beverage4.setSize(Size.GRANDE);
		beverage4 = new SteamedMilk(beverage4);
		beverage4 = new Milk(beverage4);
		beverage4 = new Soy(beverage4);
		beverage4 = new Mocha(beverage4);
		beverage4 = new Mocha(beverage4);
		beverage4 = new Mocha(beverage4);
		beverage4 = new Whip(beverage4);
		beverage4 = new Whip(beverage4);
		beverage4 = new Whip(beverage4);
		System.out.println(beverage4.getDescription() + " $" + String.format("%.2f",  beverage4.cost()));
		
		
		Beverage beverage5 = new Decaf();
		beverage5.setSize(Size.GRANDE);
		beverage5 = new Whip(beverage5);
		System.out.println(beverage5.getDescription() + " $" + String.format("%.2f",  beverage5.cost()));
		

	}

}
