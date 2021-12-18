package ch4;

import java.util.Scanner;

public class ex4_2 {

	public static void main(String[] args) {

		while(true) {
			Scanner sc = new Scanner(System.in);
			
			int a,b;
			System.out.print("두 수를 입력하세요.");
			a = sc.nextInt();
			b = sc.nextInt();
			if (a % 3 == 0 && b % 6 == 0) {
				System.out.println(a + "*" + b + "=" + (a*b));
				break;
			} else {
				System.out.println(a + "&" + b + "는 3과 6의 배수가 아닙니다.");
			}
		}

	}

}
