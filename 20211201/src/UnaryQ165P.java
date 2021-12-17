
public class UnaryQ165P {

	public static void main(String[] args) {
		// Int a에 15를 담은 다음 전위 -> 후위 -> 순으로 --를 Unary01처럼 사용해서
		// 1씩 차감하고, 콘솔에 찍는 것을 반보개주세요.
		// 단, 실행 로직은 Unary01에서 그랬듯 주석으로 하단에 풀어서 작성해주세요.
		
		int a = 15;
		System.out.println(a--); 
		/* 1. a (15) 출력 
		 * 2. a = a - 1 -> a = 14
		 */
		System.out.println(--a);
		/* 1. a = a - 1 -> a = 13
		 * 2. a (13) 출력
		 */
	}

}
