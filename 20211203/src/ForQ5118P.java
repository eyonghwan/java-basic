import java.util.Scanner;

public class ForQ5118P {

	public static void main(String[] args) {
		// Scanner로 정수를 입력받게 해 주세요
		// 입력받은 정수의 제곱 형태의 직사각형이 찍히도록
		// 중첩 반복문을 작성해주세요.
		// ex) 3입력시
		// ***
		// ***
		// *** 과 같이 출력
		// 가로줄 출력시 System.out.print("*);을
		// 다음줄로 내릴때만 System.out.pirntln(); 을 씁니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("만들 정사각형 한 변의 길이를 입력해주세요.");
		int length = sc.nextInt();
		
		// i for문 내부에서 println을 실행하므로 세로길이를 담당
		for (int i = 0; i < length; i++) {
			// print를 이용해 별을 일렬로 나열시키므로 가로길이를 담당
			for (int j =0; j < length; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

}
