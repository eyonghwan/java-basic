package awt;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Color;


public class Panel01 extends Frame {
	Panel panel = new Panel();
	Panel01() {
		go();
	}
	public void go() {
		panel.setSize(100,100);
		panel.setBackground(Color.pink);
		add(panel);
		setLayout(null);
		setSize(300,200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Panel01();

	}

}
