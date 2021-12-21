package interface1;

public class Train implements Vehicle{
	private int speed;
	private int gas;
	private String name;
	
	public Train(String name) {
		this.speed = MIN_SPD;
		this.gas = MAX_GAS;
		this.name = name;
	}

	@Override
	public void accel() {
		if (speed + TRAIN_INCREASE_SPD > TRAIN_MAX_SPD) {
			speed = TRAIN_MAX_SPD;
		} else {
			speed += TRAIN_INCREASE_SPD;
		}
		gas -= TRAIN_USE_GAS;
		
	}

	@Override
	public void breakSpeed() {
		if (speed - TRAIN_DECREASE_SPD < 0) {
			speed = 0;
		} else {
			speed -= TRAIN_DECREASE_SPD;
		}
		
	}

	@Override
	public void reFuel() {
		if (gas + TRAIN_REFUEL > MAX_GAS) {
			gas = MAX_GAS;
		} else {
			gas += TRAIN_REFUEL;
		}
		
	}

	@Override
	public void showStatus() {
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 연료 : " + gas);
		System.out.println("현재 기관사 : " + name);
		System.out.println("-------------------------");
		
	}

}
