package string1;

public class String07399P {

	public static void main(String[] args) {
		// toUpperCase()는 문자열 전체를 대문자로 바꿉니다.
		// 대문자였던것은 재문자 유지, 소문자였던것은 대문자로 바꿉니다.
		String hello = "Hello Java";
		System.out.println(hello.toUpperCase());
		System.out.println(hello);
		
		// toLowerCase()는 문자열 전체를 소문자로 바꿉니다.
		// 소문자였던것은 소문자유지, 대문자였던것은 소문자로 바꿉니다.
		System.out.println(hello.toLowerCase());
		System.out.println(hello);
		

	}

}
