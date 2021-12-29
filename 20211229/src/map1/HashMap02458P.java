package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap02458P {

	public static void main(String[] args) {
		// 식당 메뉴판을 만들어보세요.
		// key는 음식이름, value는 가격(정수)로 저장해주세요.
		// 메뉴는 5개 이상 집어넣어주세요.
		// 메뉴를 3개 조회해서 화면에 출력해주세요.
		
		Map<String, Integer> menu = new HashMap<>();
		menu.put("김치찌개", 7000);
		menu.put("제육볶음", 7000);
		menu.put("된장찌개", 7000);
		menu.put("청국장", 8000);
		menu.put("삼겹살", 10000);
		
		System.out.println(menu);
		System.out.println(menu.get("김치찌개"));
		System.out.println(menu.get("제육볶음"));
		System.out.println(menu.get("삼겹살"));
		

	}

}
