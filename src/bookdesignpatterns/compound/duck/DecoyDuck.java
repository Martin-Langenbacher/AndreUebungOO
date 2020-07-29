package bookdesignpatterns.compound.duck;

public class DecoyDuck implements Quackable {
	
	public void quack() {
		System.out.println("<< Silence >>");
	}
	
}
