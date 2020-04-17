package AndreUebungObjectOrientiert;

public class Testprogramm {

	public static void main(String[] args) {
		
		Testprogramm t = new Testprogramm();
		//System.out.println(t);
		
		String trainer = "Markus";
		String[] members = {"Frank", "Michael"};
		
		Bootcamp bonn = new Bootcamp(members, trainer);
		//Bootcamp bonn = new Bootcamp(new String[] {"Martin", "Frank", "Michael"}, "Markus");
		Bootcamp darmstadt = new Bootcamp(new String[] {"Alexander", "Monika", "Bert"}, "David", 2, true);
		
		//   Sicherheitsalarm !!! ==> Weil ich bei members nur die Referenz übergeben habe! Sicherheitslücke wird über xxxxx geschlossen !!!
		//   Alarmglocken, bei ReferenzTyp Array: wenn dies übergeben wird... dann hat derjenige, der die Methode aufruft auch noch die gleiche Referenz, auf
		//   die gleiche Stelle im Speicher und kann die manipulieren.
		// ==> Wir brauchen eine unabhängige Kopie im Speicher: "this.members = members.clone();" 
		//     (unabhängige Kopie von dem Feld machen, sonst arbeitet das Testprogramm mit dem gleichen Feld wie mein Objekt...
		members[1] = "Corona";
		// Hier klappt es nicht: Nicht infiziert!!!
		trainer = "Corona";
		
		System.out.println(bonn);
		System.out.println(darmstadt);
		
		System.out.println(java.util.Arrays.toString(bonn.getMembers()));
		System.out.println(bonn.getTrainer());
		System.out.println(bonn.getWeek());
		System.out.println(bonn.isRemote());
		
		System.out.println();
		
		System.out.println(java.util.Arrays.toString(darmstadt.getMembers()));
		System.out.println(darmstadt.getTrainer());
		System.out.println(darmstadt.getWeek());
		System.out.println(darmstadt.isRemote());
		darmstadt.setRemote(false);
		System.out.println(darmstadt.isRemote());
		
		
		
		
	}

}
