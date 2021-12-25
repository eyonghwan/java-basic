package ch5;

public class Ex5_3 {

	public static void main(String[] args) {
		// 영문자 A~Z를 char일차원 배열에 대입한 후 출력은 소문자로 출력하는 코드
		
		char[] ch = new char[26];
		
		for (int i = 0, b = 65; i < ch.length; i++, b++) {
			ch[i] = (char) b;
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print((char)(ch[i]+32) + " ");
		}

	}

}
