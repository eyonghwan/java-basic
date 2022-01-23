package awtevent;
import java.awt.*;
import java.awt.event.*;
public class KeyListenerTest extends Frame implements KeyListener {
	TextArea ta;
	
	public KeyListenerTest() {
		super("My Key Event");
		go();
	}
	public void go() {
		ta = new TextArea();
		ta.addKeyListener(this);
		add(ta);
		setSize(300,200);
		setVisible(true);
	}
	public void keyTyped(KeyEvent e) {
		ta.append("Key Typed : " + e.getKeyChar() + "\n");
	}
	public void keyPressed(KeyEvent e) {
		ta.append("Key Pressed : " + e.getKeyChar() + "\n");
	}
	public void keyReleased(KeyEvent e) {
		ta.append("Key Released : " + e.getKeyChar() + "\n");
	}

	public static void main(String[] args) {
		new KeyListenerTest();
	}

}
