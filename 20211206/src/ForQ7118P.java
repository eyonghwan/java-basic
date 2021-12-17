
public class ForQ7118P {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을 수 있도록 코드를 작성해주세요.
		// ****
		// ***
		// **
		// *
		// 중첩 반복문의 어느곳이 세로, 가로를 담당하는지 생각해보세요.
		// 힌트 : 별의 개수가 점점 줄어드는데, i--와 j--와 같이 이번에는
		// 변수 크기를 줄여가면서 진행하셔야 합니다.
		
		for (int i = 0; i < 4; i++) {
			for ( int j = 4; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
