package ch4;

public class Ex4_1 {

	public static void main(String[] args) {
		int Res = 1; // 곱의 결과를 구하는 변수
		for ( int i = 1; i <= 10; i++) {
			System.out.print(i + "*");
			Res *= i;
			
		}
		System.out.println("=" + Res);

	}

}
