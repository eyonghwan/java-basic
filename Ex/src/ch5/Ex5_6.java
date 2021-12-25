package ch5;

public class Ex5_6 {
	public static void main(String[] args) {
		// 2차원 배열의 곱을 구하는 코드
		
		int[][] A = {{5, 7, 10, 4},{2, 5, 3, 6}};
		int[][] B = {{4, 1, 1},{-6, 7, 5},{9, 9, 4},{2, 5, 5}};
		int[][] RES = new int[2][3];
		
		
		for (int i = 0; i < A[0].length; i++) {
			for (int j = 0; j < B[0].length; j++) {
				for (int k = 0; k < RES.length; k++) {
					RES[k][j] += A[k][i] * B[i][j];
				}
			}
			 
			
		}
		for (int i = 0; i < RES.length; i++) {
			for (int j = 0; j < RES[0].length; j++) {
				System.out.print(RES[i][j] + " ");
			}
			System.out.println();
		}
	}

}
