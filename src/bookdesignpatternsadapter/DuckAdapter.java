package bookdesignpatternsadapter;

import java.util.Random;

// 2nd-Adapter: Now we are adapting Turkeys to Ducks, so we implement the Turkey interface.
public class DuckAdapter implements Turkey {
	
	// We stash a reference to the Duck we are adapting
	Duck duck;
	Random random;
	public DuckAdapter(Duck duck) {
		this.duck = duck;
		// we also recreate a random object; see the fly() method and see, how it is used...
		random = new Random();
	}

	// a gobble just becomes a quack
	public void gobble() {
		duck.quack();
	}

	// Since Ducks fly a lot longer than Turkeys, we decided to only fly the Duck on average one of five times.
	public void fly() {
		if (random.nextInt(5) == 0) {
			duck.fly();
		}
	}
}
