package ch4;

public class ex4_4 {

	public static void main(String[] args) {
		int Res = 1;
		
		for (int i = 1; i<10; i++) {
			Res *= i+(i+1);
			System.out.print("(" + i + "+" + (i+1) + ")");
			if (i < 9) {
				System.out.print("*");
			} else {
				System.out.print("=");
			}
		}
		System.out.print(Res);

	}

}
