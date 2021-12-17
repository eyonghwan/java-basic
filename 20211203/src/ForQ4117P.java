import java.util.Scanner;

public class ForQ4117P {

	public static void main(String[] args) {
		//
		//
		// 바깥쪽 반복문(int i)는 2~9까지 반복하게 해 주시고
		// 안쪽 반복문(int j)은 1~9까지 반복하게 해서
		// i * j 를 출력하게 하면 됩니다.
				
		// 2단부터 9단, 시작은 몇부터 ?
		for (int i = 2; i < 10; i++) {
			// 1~9까지 곱하기
			for (int j = 1; j < 10; j++) {
				// i * j = 결과값
				System.out.println(i + " * " + j + " = " + i*j );
			}
			// 1~9까지 다 돌고 나서 아래쪽에 구분선 깔기
			System.out.println("====================");
		}
		
	}

}
