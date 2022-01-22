package awt;
import java.awt.*;
public class ScrollbarTest {

	public static void main(String[] args) {
		Frame f = new Frame("ScrollbarTest");
		f.setLayout(new FlowLayout());
		Scrollbar Vscroll = new Scrollbar(Scrollbar.VERTICAL);
		Scrollbar Hscroll = new Scrollbar(Scrollbar.HORIZONTAL);
		f.add(Vscroll);
		f.add(Hscroll);
		f.setSize(300,200);
		f.setVisible(true);

	}

}
