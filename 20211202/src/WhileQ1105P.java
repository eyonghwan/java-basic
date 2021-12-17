import java.util.Scanner;

public class WhileQ1105P {

	public static void main(String[] args) {
		// 스캐너를 이용해서 String num변수에
		// "문자열 형태인 숫자"를 입력받게 해 주세요.(scan.nextLine()으로 입력받기)
		// 이 문자자료 num을 int loop 변수에 Integer.parseInt()로 정수변환해 저장하세요.
		// loop변수에 입력된 정수 횟수만큼
		// "반복문을 실행합니다." 라는 문장이 콘솔에 출력되도록
		// while문을 작성해주세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반복할 횟수를 입력하세요 : ");
		String num = sc.nextLine();
		int loop = Integer.parseInt(num);
		int i = 0;
		
		while (i < loop) {
		System.out.println(i+1 + "번째 반복문을 실행합니다.");
		i++;
		}
		sc.close();

	}
	
}
