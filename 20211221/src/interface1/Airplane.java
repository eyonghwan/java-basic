package interface1;

public class Airplane implements Vehicle{
	
	private int speed;
	private int gas;
	private String name;
	
	public Airplane(String name) {
		speed = MIN_SPD;
		gas = AIRPLANE_MAX_GAS;
		this.name = name;
	}

	@Override
	public void accel() {
		if ( this.speed  + AIRPLANE_INCREASE_SPD > AIRPLANE_MAX_SPD) {
			this.speed = AIRPLANE_MAX_SPD;
		} else {
		this.speed += AIRPLANE_INCREASE_SPD;
		}
		this.gas -= AIRPLANE_USE_GAS;
	}

	@Override
	public void breakSpeed() {
		if (speed - AIRPLANE_DECREASE_SPD < MIN_SPD) {
			speed = MIN_SPD;
		} else {
			speed -= AIRPLANE_DECREASE_SPD;
		}
	}

	@Override
	public void reFuel() {
		if (gas + AIRPLANE_REFUEL > AIRPLANE_MAX_GAS) {
			gas = AIRPLANE_MAX_GAS;
		} else {
			gas += AIRPLANE_REFUEL;
		}
	}

	@Override
	public void showStatus() {
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 연료 : " + gas);
		System.out.println("현재 조종사 : " + name);
		System.out.println("-------------------------");
	}
	

}
