package casting;

public class Cat extends Animal{
	
	public Cat(String name, int age) {
		super(name, age);
	}
	
	public void sit() {
		System.out.println("고양이가 앉습니다.");
	}
	
	public void jump() {
		System.out.println("고양이가 점프합니다.");
	}

}
