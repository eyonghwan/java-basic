package thread;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		// 다른 클래스를 상속하지 않을 경우,
		// Thread 하위클래스를 만들어서 작업스레드를 정의한 후
		// 0.5초 주기로 비프음과 동시에 "띵"을 5번 프린트하는 코드
		Thread thread = new BeepThread();
		thread.start();
		
		// 익명 자식 객체를 사용하는 경우
		// Thread thread = new Thread() {
		//   @Override
		// 	 public void run() {
		//		스레드가 실행할 코드;
		//	 }
		//
		// };
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500); } 
				catch(Exception e) {}
		}

	}

}
