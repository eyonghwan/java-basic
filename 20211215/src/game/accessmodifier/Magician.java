package game.accessmodifier;

public class Magician extends Commoner {
	
	public Magician(String name) {
		super(name);
	}
	
	public void hunt() {
		System.out.println("마법사가 사냥을 시작합니다.");
		// hp -= 2; 를 직접 실행할 수 없으므로
		// public인 setter의 일종인 (setHp)를 이용합니다.
		// setHp(5)인 경우, 기존의 값 대신 hp변수에 5로 교체해달라는 요청임.
		// 현재 원하는 것은, 현 hp값에서 사냥할 때 마다 2씩 체력이 깎이는 것입니다.
		setHp(getHp() - 2);
		// 경험치도 마찬가지로 
		// exp += 10; 을 직접 실행할 수 없으므로
		// setExp()를 활용합니다.
		// 현재 원하는 것은, 현 exp값에서 사냥할 때마다 10씩 형험치가 증가하는 것입니다.
		setExp(getExp() + 10);
	}
	
	// fireball 메서드를 생성해주세요.
	// 마나가 3 줄고, 경험치는 20증가합니다.
	public void fireball() {
		System.out.println("FIREBALL을 사용했습니다.");
		if (getMp() -3 >= 0) {
		setMp(getMp()-3);
		setExp(getExp()+20);
		} else {
			System.out.println("FIREBALL을 사용할 마나가 부족합니다.");
		}
	}
	
	// heal 메서드를 생성해주세요.
	// 마나가 2 줄고, 체력이 10 회복됩니다.
	public void heal() {
		if (getMp() - 2 >= 2) {
			System.out.println("HEAL을 사용합니다.");
			setMp(getMp()-2);
			if (getHp() + 10 > 20) {
				setHp(20);
			} else {
				setHp(getHp() +10);
			}
		} else {
		System.out.println("HEAL을 사용할 마나가 부족합니다.");
		}
	}
	
	public void getInfo() {
		// 심지어 private요소는 수정이 아닌 조회도 불가능합니다.
		System.out.println("현재 체력 : " + getHp());
		// 체력뿐만 아니라 나머지 요소들도 조회할 수 있도록 코드를 추가해주세요.
		System.out.println("이름 : " + getName() + ", 마나 : " + getMp() + ", 레벨 : " + getLv() + ", 현재 경험치 : " + getExp());
	}

}
