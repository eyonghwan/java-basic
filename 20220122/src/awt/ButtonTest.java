package awt;
import java.awt.*;
public class ButtonTest extends Frame {
	
	Button b = new Button("OK");
	
	public ButtonTest() {
		super("ButtonTest");
		go();
	}
	public void go() {
		setLayout(new FlowLayout());
		add(b);
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonTest();

	}

}
