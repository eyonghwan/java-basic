
public class EnhancedFor02162P {

	public static void main(String[] args) {
		// 다음은 학생들의 과목별 성적입니다.
		// math = 96, 23, 52, 82, 72, 31, 58
		// eng = 62, 42, 68, 31, 80, 77, 45
		// com = 10, 28, 39, 74, 65, 90, 98
		// 위 3개의 명칭으로 array를 만들어 담아주신 다음
		// 과목별 평균점수를 enhanced for문을 이용해 구한 다음
		// 콘솔창에 출력해주세요.
		
		int[] math = {96, 23, 52, 82, 72, 31, 58};
		int[] eng = {62, 42, 68, 31, 80, 77, 45};
		int[] com = {10, 28, 39, 74, 65, 90, 98};
		int sum = 0;

		for (int mathitem : math) {
			sum += mathitem;
		}
		System.out.println("수학평균 : "+sum/math.length);
		
		sum = 0;

		for (int engitem =0; engitem < eng.length; engitem++) {
			sum += eng[engitem];
		}
		System.out.println("영어평균 : "+sum/eng.length);
		
		sum = 0;

		for (int comitem : com) {
			sum += comitem;
		}
		System.out.println("컴퓨터평균 : "+sum/com.length);
	
	}

}
