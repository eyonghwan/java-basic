package polymorphism;

public class Mailman extends Person{
	private int mails;
	
	public Mailman(String name, int age, int mails) {
		super(name, age);
		this.mails = mails;
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("남은 메일 : " + this.mails);
	}

}
