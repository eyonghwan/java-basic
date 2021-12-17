import java.util.Scanner;

public class MethodQ1204P {
	// 화씨온도를 입력하면 섭씨온도로 바꿔주는 메서드를 작성해보겠습니다.
	// 메서드 이름은 FToC이고, double을 리턴합니다.
	// 리터받은 결과값은 main메서드에서 System.out.println()으로 출력해주세요.
	// 화씨 = (섭씨 X 1.8) + 32
	public static double FToC(double f) {
		return (f-32)/1.8;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("오늘의 화씨 온도를 입력해주세요.");
		double F = s.nextDouble();
		double C = FToC(F);
		System.out.println("오늘의 섭씨온도는 : " + C+"도 입니다.");

	}

}
