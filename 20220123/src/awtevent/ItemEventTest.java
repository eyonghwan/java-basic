package awtevent;
import java.awt.*;
import java.awt.event.*;
public class ItemEventTest extends Frame implements ItemListener {
	private List lst;
	private TextArea ta;
	
	public ItemEventTest() {
		lst = new List(4,false);
		ta = new TextArea();
		
		lst.add("처음");
		lst.add("자바");
		lst.add("six");
		lst.add("lonet");
		lst.add("다섯");
		lst.add("여섯");
		lst.addItemListener(this);
		add(lst,"North");
		add(ta);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new ItemEventTest();

	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		ta.append(e.getSource().toString());
		ta.append("\n");
	}

}
