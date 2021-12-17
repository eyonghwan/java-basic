package polymorphism;

public class Teacher extends Person{
	private String major;
	
	public Teacher(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("전공과목 : " + major);
	}

}
