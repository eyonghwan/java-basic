package casting;

public class Main01 {

	public static void main(String[] args) {
		// Animal 타입은 어떤 자료형이건 받을 수 있다.
		// Cat, Dog, Animal을 하나씩 만들어주세요.
		// Animal c1, d1, a1으로 받아주세요.
		
		Animal a1 = new Animal("동물", 3);
		Animal c1 = new Cat("고양이", 3);
		Animal d1 = new Dog("개", 3);
		
		a1.sit();
		c1.sit();
		d1.sit();
		
		// 각 자료형에 맞는 변수로 바꿔서 대입하겠습니다.
		Cat cat = (Cat)c1; // c1은 Animal타입이지만 힙에 저장된 데이터가 Cat이므로 Cat으로 변환가능.
		cat.jump();
		// Dog에 대해서도 똑같이 해주세요.
		Dog dog = (Dog)d1;
		dog.bark();

	}

}
