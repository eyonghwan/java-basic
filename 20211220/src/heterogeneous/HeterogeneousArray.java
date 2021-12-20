package heterogeneous;

public class HeterogeneousArray {

	public static void main(String[] args) {
		// int[] 에는 정수만 넣을 수 있음.
		int[] iArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		// {"a", "b", 1, 2} 와 같이 넣을 수 없음. 
		
		// iArr를 향상된 for문으로 출력해보세요.
		for (int a : iArr) {
			System.out.println(a);
		}
		
		// 여러 자료형을 받을 수 있도록 모든 클래스의 부모인 Object로 배열 생성
		// Object는 다형성의 원리에 의해 모든 자료를 저장받을 수 있다.
		Object[] oArr = {"a", "b", 1, 2, 3.0, 5.1};
		
		for(Object value : oArr) {
			System.out.println(value);
		}
		

	}

}
