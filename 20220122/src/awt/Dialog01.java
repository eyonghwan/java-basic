package awt;
import java.awt.*;

public class Dialog01 extends Frame {
	public Dialog01(String title) {
		super(title);
		Dialog d = new Dialog(this, true);
		Label lb = new Label("This is a Dialog");
		Button bt = new Button("OK");
		d.add("Center",lb);
		d.add("South", bt);
		d.pack();
		d.setVisible(true);
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Dialog01("DialogTest");

	}

}
