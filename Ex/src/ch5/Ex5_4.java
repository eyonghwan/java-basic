package ch5;

public class Ex5_4 {
	 public static void main(String[] args) {
		// 8개의 정수를 가진 두 배열의 크로스합을 구하는 코드
		// 예) a[0] + b[7]
		 
		 int[] a = {2, 4, 6, 8, 10, 12, 14, 16};
		 int[] b = {1, 1, 2, 3, 5, 8, 13, 21};
		 for(int i = 0; i < a.length; i++) {
			 a[i] += b[7-i];
			 System.out.println(a[i]);
		 }
	}

}
