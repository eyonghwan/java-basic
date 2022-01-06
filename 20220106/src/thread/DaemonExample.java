package thread;

public class DaemonExample {

	public static void main(String[] args) {
		// 1초 주기로 save() 메소드를 자동 호출하는 AutoSaveThread를 3초 실행하고
		// 메인 스레드가 종료되면 같이 종료되는 코드
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
		}
		
		System.out.println("메인 스레드 종료");

	}

}
