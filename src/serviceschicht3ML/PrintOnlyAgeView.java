package serviceschicht3ML;

import java.util.List;

public class PrintOnlyAgeView implements ViewInterface {

	@Override
	public void printEntityObjects(List<Entity> entityObjects) {
		
		for (Entity entity : entityObjects) {
			System.out.println("==> Age only: " +entity.getFirstname() +"'s Alter ist " + entity.getAge() +".");
		}

	}

}


