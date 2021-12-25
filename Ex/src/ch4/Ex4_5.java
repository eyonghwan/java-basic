package ch4;

public class Ex4_5 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			System.out.print("*");
			for(int j=1; j <= 4; j++) {
				if (i%2 != 0) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
