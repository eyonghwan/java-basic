package inheritance;

// Person을 상속해서 Salaryman을 만들어 보세요.
// 샐러리맨은 연봉(salary)을 가집니다.
// getSalaryInfo()로 상태를 조회할 수 있습니다.
public class Salaryman extends Person{
	
	public int salary;
	
	public void getSalaryInfo() {
		System.out.println(age + "세 " + name + "씨의 연봉은 " + salary + "(만원) 입니다.");
	}
	

}
