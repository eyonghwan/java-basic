package ch4;

import java.util.Scanner;
// 윤년 계산기
public class Ex4_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력 : " );
		int year = sc.nextInt();
		if (year % 4 == 0) {
			if(year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("윤년");
				} else  {
					System.out.println("평년");
				} 
			} else
			System.out.println("윤년");
		} else
		System.out.println("평년");
	}

}
