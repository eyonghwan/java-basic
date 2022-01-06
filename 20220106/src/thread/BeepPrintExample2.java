package thread;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		// 0.5초 주기로 비프음과 동시에 "띵"을 5번 프린트하는 코드
		// 다른 클래스를 상속하여 Thread클래스를 상속받지 못할 때
		// Runnable 인터페이스를 구현하는 방법.
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		// 7-8코드와 같은 결과를 내는 다른 코드
		// 익명 객체 사용
		// Thread thread = new Thread(new Runnable() {
		// 스레드 실행 내용
		// }
		
		// 람다식 사용
		// Thread thread = new Thread(() -> {
		// 스레드 실행 내용
		// }
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}

	}

}
