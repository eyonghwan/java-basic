package thread;

public class ThreadAA extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadAA 작업 내용");
			} else {
				Thread.yield();
			}
		}
		
		System.out.println("ThreadAA 종료");
	}

}
