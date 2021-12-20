package static2;

public class Main01 {

	public static void main(String[] args) {
		// Asean 조원 생성없이도 팀 점수는 public으로 처리된 경우 바로 조회 가능
		Asean a1 = new Asean(15, 15, 15);
		Asean a2 = new Asean(15, 25, 20);
		Asean a3 = new Asean(17, 17, 18);
		Asean a4 = new Asean(20, 26, 27);
		
		a1.showAseanInfo();
		a2.showAseanInfo();
		a3.showAseanInfo();
		a4.showAseanInfo();

	}

}
