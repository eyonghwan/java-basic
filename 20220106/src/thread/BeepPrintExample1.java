package thread;

import java.awt.*;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		// 0.5초 주기로 띵 소리를 5번 낸 후 "띵"을 5번 프린트하는 코드
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {Thread.sleep(500);} catch(Exception e) {}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}

	}

}
