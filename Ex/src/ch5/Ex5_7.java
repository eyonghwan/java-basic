package ch5;

public class Ex5_7 {

	public static void main(String[] args) {
		// 2(3X3)차원 배열에 행과열의 위치를 바꾸어 출력하는 코드
		
		int[][] before = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		int[][] after = new int[3][3];
		
		System.out.println("변경 전");
		
		for(int i = 0; i < before.length; i++) {
			for(int j = 0; j < before[0].length; j++) {
				System.out.print(before[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < before.length; i++) {
			for(int j = 0; j < before[0].length; j++) {
				after[i][j] = before[j][i];
			}
		}
		System.out.println("변경 후");
		
		for(int i = 0; i < before.length; i++) {
			for(int j = 0; j < before[0].length; j++) {
				System.out.print(after[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
