package ch5;

public class Ex5_2 {

	public static void main(String[] args) {
		// 정수 9개를 일차원 배열에 대입하여 최대값과 최소값을 구하는 코드
		
		int[] su = {12, 26, 68, 98, 76, 54, 8, 6, 4};
		int max = su[0];
		int min = su[0];
		for (int i = 0; i < su.length; i++) {
			if (su[i] > max) {
				max = su[i];
			}
			if (su[i] < min) {
				min = su[i];
			}
		}
		System.out.println("최대값 : " + max + ", 최솟값 : " + min);

	}

}
