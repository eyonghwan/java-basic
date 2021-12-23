package string1;

import java.util.Scanner;

public class String03399P {

	public static void main(String[] args) {
		// Scanner를 통해서 전체 문장을 입력받으세요.
		// 다음으로 문장내에서 찾고 싶은 단어를 추가로 입력받으세요.
		// 문장 내에 있는 단어들의 인덱스 번호와, 몇개가 검출되었는지 
		// 출력해주는 코드를 작성해보세요.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("전체 문장을 입력해주세요.");
		String sentence = scan.nextLine();
		
		System.out.println("문장 내에서 카운팅할 단어를 입력해주세요.");
		String searchVoca = scan.nextLine();
		
		int indexNum = -1;
		int count = 0;
		
		indexNum = sentence.indexOf(searchVoca);
		do {
			if (indexNum != -1) {
				count += 1;
				System.out.println(indexNum + "에서 " + count + "번째 " + searchVoca + "이(가) 검출되었습니다.");
			} 
		indexNum = sentence.indexOf(searchVoca, indexNum+1);
		} while (indexNum != -1);
		if (count == 0) {
			System.out.println("문장 내 " + searchVoca + "는 없습니다.");
		}
		System.out.println("문장 내 " + searchVoca + "는 " + count + "개가 검출되었습니다.");

	}

}
