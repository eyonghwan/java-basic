import java.util.Scanner;

public class If0293P {

	public static void main(String[] args) {
		// 교재 93페이지 프로그램 4-1 코드입니다.
		Scanner scan = new Scanner(System.in);
		
		int su;
		
		System.out.println("정수입력 : ");
		su = scan.nextInt();
		
		// 만약에 if문의 실행문이 한 줄이라면, {}를 생략해도 됩니다.
		if (su > 0) { // { 생략가능
			System.out.println("양수");
		} // } 생략가능
		
		scan.close();
		
	}
	
}
