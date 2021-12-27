package math1;

public class Math05 {
	public static void main(String[] args) {
		// 주사위 게임을 만들어주세요.
		// 내 값은 myvalue변수에,
		// 컴퓨터값은 comvalue 변수에 값을 난수발생으로 1~6번으로 부여한 뒤
		// 값이 같다면 무승부, 아니면 나, 혹은 컴퓨터 중 승자가 누구인지 알려주는 방식입니다.
		
		int myValue = (int)(Math.random() * 6) +1;
		int comValue = (int)(Math.random() * 6) +1;
		
		System.out.println("당신의 주사위 값은 " + myValue + "입니다.");
		System.out.println("컴퓨터의 주사위 값은 " + comValue + "입니다.");
		if (myValue > comValue) {
			System.out.println("당신이 이겼습니다.");
		} else if (myValue < comValue) {
			System.out.println("컴퓨터가 이겼습니다.");
		} else {
			System.out.println("비겼습니다.");
		}
		
	}

}
