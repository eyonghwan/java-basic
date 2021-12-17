package constructor;

public class Main01204P {

	public static void main(String[] args) {
		// 자동차 한 대 만들어 주세요.
		// 연료량은 100
		// 속도는 0
		// 주인은 본인이름으로 만들어주세요.
		
		Car c = new Car();
		c.gas = 100;
		c.speed = 0;
		c.owner = "이용환";
		
		// 차를 뽑자마자 먼저 상태 확인
		c.getInfo();
		// 엑셀을 두 번 밟아주세요
		c.accelSpeed();
		c.accelSpeed();
		// 상태 다시 확인
		c.getInfo();
		
		// 브레이크를 밟아주세요
		c.breakSpeed();
		// 상태 다시 확인
		c.getInfo();

	}

}
