package interface1;

public class Main03 {

	public static void main(String[] args) {

		Vehicle a1 = new Airplane("이용환");
		
		a1.accel();
		a1.accel();
		a1.accel();
		a1.accel();
		a1.showStatus();
		a1.breakSpeed();
		a1.showStatus();

	}

}
