import java.util.Scanner;

public class ScannerQ193P {

	public static void main(String[] args) {
		// 환율계산기를 만들어보겠습니다.
		// 네이버에 검색해서 원하는 국가의 화폐의 환율을 rate 변수에 저장해주세요.
		// 스캐너를 이용해서 won변수에 원화금액을 입력해주세요.
		// 원화와 환율을 이용해서
		// 원화 XXXXX원을 환전시 XXXX(화폐)입니다. 로 결과물을 출력해주세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("터키 리라화 환율계산기");
		
		double rate = 87.34;
		
		System.out.println("터키 리라화의 환율은 " + rate +" 입니다.");
		System.out.printf("환전의 원하는 금액을 입력해주세요 : ");
		
		double Won = sc.nextDouble();
		// won/rate 를  Math.round()로 감싼다음, 10^n승을 곱하고 10.0^n승으로 나눠주면
		// n승에 해당하는 자리수만큼 소수점자리까지만 나옵니다.
		System.out.printf("원화 %.2f원을 환전시 %.2f(tl)입니다.", Won , Won/rate );
		// 다 사용한 scan변수는 .close()로 닫아줘야 메모리가 회수됩니다.
		sc.close();
	}

}
