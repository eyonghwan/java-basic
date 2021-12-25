package ch5;

public class Ex5_5 {

	public static void main(String[] args) {
		// 1~10까지의 난수를 9개에 대입받은 일차원 배열을 정렬한 후 총합을 마지막 요소에
		// 대입한 후 출력하는 코드
		
		int[] num = new int[10];
		int sum = 0;
		
		System.out.println("[정렬전]");
		
		for (int i = 0; i < num.length-1; i++) {
			num[i] = (int)(Math.random()*9) + 1; // 난수대입
			System.out.print(num[i] + " ");
			sum += num[i];
		}
		
		num[9] = sum; // 합을 대입
		
		System.out.println();
		
		for (int i = 0; i < num.length - 2; i++ ) {
			for (int k = 0; k < num.length - 2; k++) {
				int temp = num[k];
				int temp_ = num[k+1];
				if (num[k] > num[k+1]) {
					num[k] = temp_;
					num[k+1] = temp;
				}
			}
		}
		System.out.println("[정렬후]");
		
		for (int i = 0; i < num.length - 1; i++) {
			System.out.print(num[i] + " ");
			if (i == 8) {
				System.out.println("= " + num[i+1]);
			} else {
				System.out.print("+ ");
			}
			sum += num[i];
		}

	}

}
