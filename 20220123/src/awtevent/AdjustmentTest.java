package awtevent;
import java.awt.*;
import java.awt.event.*;
public class AdjustmentTest extends Frame implements AdjustmentListener {

	public static void main(String[] args) {
		AdjustmentTest win = new AdjustmentTest();
		win.setBounds(10, 10, 400, 300);
		win.setVisible(true);

	}
	private Scrollbar bar1 = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 5, 30);
	private Label label = new Label("슬라이더를 이동하십시오");
	
	public AdjustmentTest() {
		bar1.addAdjustmentListener(this);
		add(bar1, BorderLayout.EAST);
		add(label);
	}
	@Override
	public void adjustmentValueChanged(AdjustmentEvent arg0) {
		label.setFont(new Font("휴먼매직체", Font.BOLD, bar1.getValue()));
	}

}
