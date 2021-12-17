package structure;

public class Structure03190P {
	
	public static void getInfo(Cat a) {
		System.out.println(a.name + "의 정보입니다.");
		System.out.println("이름 : " + a.name + ", 체중 : " + a.weight + "kg, 키 : " + a.height + "cm");
	}

	public static void main(String[] args) {
		
		Cat a = new Cat();
		a.name = "나비";
		a.weight = 10;
		a.height = 60;
		
		Cat b = new Cat();
		b.name = "나방";
		b.weight = 6;
		b.height = 30;
		
		getInfo(a);
		getInfo(b);
		

	}

}
