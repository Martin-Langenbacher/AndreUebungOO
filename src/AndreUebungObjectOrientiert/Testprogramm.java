package AndreUebungObjectOrientiert;

public class Testprogramm {

	public static void main(String[] args) {
		
		Testprogramm t = new Testprogramm();
		//System.out.println(t);
		
		Bootcamp bonn = new Bootcamp(new String[] {"Martin", "Frank", "Michael"}, "Markus");
		Bootcamp darmstadt = new Bootcamp(new String[] {"Alexander", "Monika", "Bert"}, "David", 2, true);
		
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
