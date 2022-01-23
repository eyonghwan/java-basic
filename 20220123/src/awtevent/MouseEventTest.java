package awtevent;
import java.awt.*;
import java.awt.event.*;
public class MouseEventTest extends Frame implements MouseMotionListener {
	TextArea ta;
	void go() {
		ta = new TextArea();
		addMouseMotionListener(this);
		add(ta,"South");
		setSize(200,300);
		setVisible(true);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		ta.append("mouseDragged : x = " + e.getX() + ", y = " + e.getY() + "\n");
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		ta.append("mouserMoved : x = " + e.getX() + ", y = " + e.getY() + "\n");
	}

	public static void main(String[] args) {
		new MouseEventTest().go();
	}

}
