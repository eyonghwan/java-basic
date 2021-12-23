package system1;

public class Timecheck02384P {

	public static void main(String[] args) {
		// Try~catch구문의 소요시간을 구해주세요.
		// 내부에는 여러분들이 원하는 속석의 예외를 발생시키세요.
		long start;
		long end;
		
		start = System.currentTimeMillis();
		
		try {
			throw new ArithmeticException();
		} catch (Exception e) {
			System.out.println("ArithmeticException 에러 발생!");
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("실행시간 : " + (end - start));

	}

}
