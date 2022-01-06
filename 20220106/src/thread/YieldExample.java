package thread;

public class YieldExample {

	public static void main(String[] args) {
		// 처음 3초 동안 ThreadAA와 ThreadBB가 번갈아 실행되다가
		// 다음 3초간 ThreadA의 yield메서드를 호출해 ThreadB를 더 많이 실행하고
		// 마지막 3초간은 다시 모두 실행한 후 모두 종료한다.
		ThreadAA  threadAA = new ThreadAA();
		ThreadBB  threadBB = new ThreadBB();
		
		threadAA.start();
		threadBB.start();
		
		try {Thread.sleep(3000); } catch(InterruptedException e) {}
		threadAA.work = false;
		
		try {Thread.sleep(3000); } catch(InterruptedException e) {}
		threadAA.work = true;
		
		try {Thread.sleep(3000); } catch(InterruptedException e) {}
		threadAA.stop = true;
		threadBB.stop = true;

	}

}
