package ch4;

import java.util.Scanner;

public class Ex4_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요(중간고사, 기말고사, 레포트, 출석점수) : ");
		int mid = sc.nextInt();
		int fin = sc.nextInt();
		int ex = sc.nextInt();
		int att = sc.nextInt();
		String g;
		
		System.out.println("--결과입니다--");
		System.out.println("중간고사 : " + mid);
		System.out.println("기말고사 : " + fin);
		System.out.println("과제점수 : " + ex);
		System.out.println("출석점수 : " + att);
		double sum = ((mid+fin)/2.0 * 0.6) + (ex*0.2) + att*0.2;
		
		System.out.println("성적 : " + sum);
		System.out.print("학점 : ");
		if (sum >= 90) {
			g="A";
			System.out.println("A");
		} else if (sum >=80) {
			g="B";
			System.out.println("B");
		} else if (sum >=70) {
			g="C";
			System.out.println("C");
		} else if (sum >=60) {
			g="D";
			System.out.println("D");
		} else {
			g="F";
			System.out.println("F");
		}
		
		System.out.print("평가 : ");
		switch (g) {
		
		case "A": 
		case "B": System.out.println("excellent");
		break;
		case "C":
		case "D": System.out.println("good");
		break;
		case "F": System.out.println("poor");	
		
		}

	}

}
