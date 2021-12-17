
public class ForQ9118P {

	public static void main(String[] args) {
		// 중첩 반복문을 이용해서
		// 다음 방정식의 양의 정수
		// 해를 모두 구하세요.
		
		for (int x = 1; x < 15; x++) {
			for (int y =1; y < 12; y++) {
				if (4*x +5*y == 60) {
					System.out.println(x+" "+y);

				}
				}
			}
		}

	}
