package ch4;

public class ex4_3 {

	public static void main(String[] args) {
		
		double sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += 1.0/i;
			System.out.print("1/" + i);
			if (i ==10) {
				System.out.print("=");
			} else {
				System.out.print("+");
			}
		}
		System.out.print(sum);

	}

}
