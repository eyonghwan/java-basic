package awt;
import java.awt.Frame;
import java.awt.Color;

public class Frame02 extends Frame {
	public Frame02(String title) {
		super(title);
	}

	public static void main(String[] args) {
			Frame02 f = new Frame02("Hello Out there");
			f.setSize(300,200);
			f.setBackground(Color.blue);
			f.setVisible(true);

	}

}
