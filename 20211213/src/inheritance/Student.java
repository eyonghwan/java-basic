package inheritance;

// 상속 문법
// 클래스 오른쪽에 <extends 부모클래스이름>을 찍습니다.
// 이렇게 상속한 클래스는 부모, 자식 클래스가 하나의 객체 내부에
// 공존하는 형대로 메모리에 생성됩니다.
public class Student extends Person {
	// name, age
	// 공통속성(이름, 나이)이 아닌 학생만의 개별적 특성 정의
	public int stuNum;
	
	// getInfo()는 자동으로 작성됩니다.
	public void getStudentInfo() {
		System.out.println("이름은 " + name + ", 나이는 " + age + "이고, 학번은 " + stuNum + "입니다.");
	}

}
