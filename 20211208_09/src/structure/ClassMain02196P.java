package structure;

public class ClassMain02196P {

	public static void main(String[] args) {
		Car ram = new Car();
		ram.model = "bike";
		ram.owner = "욜로";
		ram.price = 5000000;
		
		Car fe = new Car();
		fe.model = "hike";
		fe.owner = "절로";
		fe.price = 7500000;
		
		ram.getInfo();
		fe.getInfo();
		
	}

}
