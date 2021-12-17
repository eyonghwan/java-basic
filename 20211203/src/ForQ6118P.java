import java.util.Scanner;

public class ForQ6118P {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을 수 있도록 코드를 작성해주세요.
		// *
		// **
		// ***
		// ****
		// 중첩 반복문의 어느곳이 세로, 가로를 담당하는지 생각해보세요.
		// 힌트 : 별 개수가 점점 늘어나는데, 점점 숫자가 커지는 변수가 뭐가 있을지 생각해보세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("별의 개수를 정해주세요.");
		int count = sc.nextInt();
		
		for (int i = 1; i <= count; i++) {
			for (int j = 0; j < i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

}
