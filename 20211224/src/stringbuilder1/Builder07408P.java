package stringbuilder1;

public class Builder07408P {

	public static void main(String[] args) {
		// toString()은 내부 자료를 String으로 바꿔줍니다.
		// StringBuilder자료형은 String처럼 보이지만
		// 엄밀히 말하면 String이 아니기 때문에
		// 다시 형 변환을 해줘야 합니다.
		StringBuilder str = new StringBuilder("가나다라마바사");
		// 자료형 불일치
		// String hangul = (String)str;
		
		// String으로 교환할때는 str.toString();을 붙여서 자료변환을 합니다.
		String hangul = str.toString();
		
		System.out.println(str);
		
		// String자료형인 hangul을 다시 StringBuilder형으로 바꿔서
		// StringBuilder str2라는 변수에 저장해주세요.
		
		StringBuilder str2 = new StringBuilder(hangul);
		System.out.println(str2);

	}

}
