import java.util.Scanner;

public class Scanner0193P {

	public static void main(String[] args) {
		// 코드 실행중 사용자의 이벽을 받게 하고 싶은 경우 스캐너 기능을 사용합니다.
		// 아래 Scanner 라고 적은 부부에 마우스를 갖다 대로 import를 해주세요.
		Scanner scan = new Scanner(System.in);
		
		// 정수 한 글자를 입력받음
		int a = scan.nextInt();
		
		// 입력받은 정수 출력
		System.out.println(a);
		scan.close();
	}

}
