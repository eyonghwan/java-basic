package awt;
import java.awt.*;
public class BorderTest {
	private Frame f;
	private Button b1, b2, b3, b4, b5;
	public void display() {
		f = new Frame("Border Layout");
		
		b1 = new Button("NORTH");
		b2 = new Button("SOUTH");
		b3 = new Button("EAST");
		b4 = new Button("WEST");
		b5 = new Button("CENTER");
		
		f.add(b1, BorderLayout.NORTH);
		f.add(b2, BorderLayout.SOUTH);
		f.add(b3, BorderLayout.EAST);
		f.add(b4, BorderLayout.WEST);
		f.add(b5, BorderLayout.CENTER);
		
		f.setSize(200,200);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		BorderTest mborder = new BorderTest();
		mborder.display();

	}

}
