package bookdesignpatterns.compound4.dj;

public class DJTestDrive {

	public static void main(String[] args) {
		
		BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);

	}

}
