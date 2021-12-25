package ch5;

public class Ex5_8 {

	public static void main(String[] args) {
		// 일차원 배열에 있는 점수를 표현하는 막대그래프
		int[] A = {90, 80, 50, 70, 65, 90, 100, 43, 55, 87};
		
		for (int i = 0; i < A.length; i++) {
			System.out.printf("%3d 점 : ", A[i]);
			for (int j = 0; j < A[i]/10; j++) {
				System.out.print("■ ");
			}
			System.out.println();
		}

	}

}
