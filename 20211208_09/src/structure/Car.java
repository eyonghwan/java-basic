package structure;

public class Car { // 정의부
	// 멤버 변수
	// 멤버 변수는 어떤 특정한 사물이나 객체의 "상태"를 나타냅니다.
	public String model; // 모델명
	public int price; // 가격
	public String owner; // 주인
	
	// 맴버 메서드는 어떤 특정한 사물이나 객체의 "동작"을 나타냅니다.
	public void getInfo() {
		System.out.println(owner + "의 차 정보입니다.");
		System.out.println("모델명 : " + model + ", 가격 : " + price);
	}
}
