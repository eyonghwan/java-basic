package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto03 {

	public static void main(String[] args) {
		// 로또복권 당첨 시뮬레이터를 만들어주세요.
		// 1. 당첨번호 6개를 뽑습니다.
		// 2. 추천번호 6개를 뽑습니다.
		// 3. 당첨번호와 추첨번호를 비교해서 일치하면 반복 중지
		// 4. 3에서 일치하지 않으면 반복횟수를 1 더하고 다시 추첨번호 6개를 뽑고
		// 이어서 비교해서 일치여부 검사
		List<Integer> lotto = new ArrayList<>();
		List<Integer> myLotto = new ArrayList<>();
		int getNum = 0;
		int count = 1;
		
		while(lotto.size() != 6) {
		getNum = (int)(Math.random() * 45) + 1;
			if(!lotto.contains(getNum)) {
				lotto.add(getNum);
			}
		}
		
		Collections.sort(lotto);
		System.out.println("로또 번호 : " + lotto);
		
		while(myLotto.size()!=6) {
			getNum = (int)(Math.random() * 45) +1;
				if(!myLotto.contains(getNum)) {
					myLotto.add(getNum);
				}
			}
			
		Collections.sort(myLotto);
		
		while (!lotto.equals(myLotto)) {
			System.out.println("내 번호 : " + myLotto);
			myLotto.clear();
			while(myLotto.size()!=6) {
				getNum = (int)(Math.random() * 45) + 1;
					if(!myLotto.contains(getNum)) {
						myLotto.add(getNum);
					}
				}
			Collections.sort(myLotto);
			count++;
		}
		System.out.println("로또 번호 " + lotto);
		System.out.println("내 번호 " + myLotto);
		System.out.println("당첨되었습니다.");
		System.out.println("반복횟수 : " + count);

	}

}
