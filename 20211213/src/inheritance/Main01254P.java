package inheritance;

public class Main01254P {

	public static void main(String[] args) {
		// Student가 Person을 상속했기 때문에
		// Student는 Person의 자원을 사용할 수 있스비다.
		Student s1 = new Student();
		s1.name = "이용환";
		s1.age = 25;
		s1.stuNum = 12;
		
		s1.getInfo();
		s1.getStudentInfo();

	}

}
