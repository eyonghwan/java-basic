package awtevent;
import java.awt.*;
import java.awt.event.*;
public class WindowAdapterTest extends Frame {
	
	public void go() {
		addWindowListener(new WindowAdapter() {
			public void windowCosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(300,100);
		setTitle("어댑터 테스트");
		setVisible(true);
	}

	public static void main(String[] args) {
		new WindowAdapterTest().go();
	}

}
