
public class OperandQ1 {

	public static void main(String[] args) {
		// 다음 조건을 만족하는 코드를 작성해주세요
		// kor, math, eng, com 변수를 한 줄로 선언해주신다음 각각
		// 80,   55,  65,   85 를 대입해주시오
		// total 변수에 총점을 저장해주신다음
		// 콘솔창에 평균 점수를 출력해주세요
		int kor, math, eng, com;
		float total;
		kor = 80;
		math = 55;
		eng = 65;
		com = 85;
		total = kor + math + eng + com;
		System.out.println("평균 점수는 " + total/4.0 + "점 입니다.");
	}

}
