package thread;

public class MainThreadExamle {

	public static void main(String[] args) {
		// User1에 100, User2에 50을 같은 객체에 저장할 때에 문제점
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		
		// 동기화 메서드나 동기화 블록을 사용해 잠금을 걸어야 한다.
		// Calculator클래스에 setMemory를 아래처럼 바꿔주어야한다.
		// public synchronized void setMemory(int memory)

	}

}
