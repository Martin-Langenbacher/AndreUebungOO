package Lambda;

import java.util.ArrayList;

public class Greetings {

	public static void main(String[] args) {
		
		// Lambda-Ausdruck mit Parameter
		Greetable1 g1 = (s, i) -> s.repeat(i);
		System.out.println("Beispiel 1: ");
		System.out.println(g1.greet("Alaaf ",  4));
		
		
		// alles in einem Ausdruck
		System.out.println("Beispiel 2: ");
		System.out.println( ( (Greetable1) ( (s, i) -> s.repeat(i))).greet("Alaff ", 2));  // hier muss ich noch parsen (s, i)
		
		
		// Lambda-Ausdruck ohne Parameter
		System.out.println("Beispiel 3: ");
		Greetable2 g2 = () -> System.out.println("Alaaf");
		g2.greet();
		
		
		// Lambda-Ausdruck mit genau einem Parameter
		System.out.println("Beispiel 4: ");
		Greetable3 g3 = s -> System.out.println(s);
		g3.greet("Alaaf ");
		
		
		// Lambda-Ausdruck bei forEach-Schleife
		System.out.println("Beispiel 5: ");
		ArrayList<String> list = new ArrayList<String>();
		list.add("Alaaf ");
		list.add("Alaaf ");
		list.add("Alaaf ");
		list.forEach( s -> System.out.print(s + " "));

	}

}
