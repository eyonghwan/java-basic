import java.util.Scanner;

public class ContinueQ1123P {

	public static void main(String[] args) {
		// 1에서 n까지 총 합을 구하되 홀수끼리만 더한 
		// 총합을 구하는 구문을 작성해주세요
		// continue문을 반드시 사용하는 로직으로 작성해주세요.
		// n은 스캐너로 입력받습니다.
		
		// 1.정수입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		int n = sc.nextInt();
		
		// 2.반복문 만들기
		
		int sum = 0;
		for (int count = 1; count <=n; count++) {
			if(count % 2 ==0) {
				continue;
			}
		sum +=count;
		System.out.println("현재 1부터 "+count+"까지 더했습니다.");
		System.out.println("총합은 "+sum+"입니다.");
		
		}	
		System.out.println("1부터 "+n+"까지 홀수의 총합은 : "+sum);

	}

}
