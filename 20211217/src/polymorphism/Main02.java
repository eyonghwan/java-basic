package polymorphism;

public class Main02 {

	public static void main(String[] args) {
		Person m1 = new Mailman("우체부", 15, 10);
		Person t1 = new Teacher("선생님", 12, "영어");
		
		m1.showPerson();
		t1.showPerson();

	}

}
