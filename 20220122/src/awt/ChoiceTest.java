package awt;
import java.awt.*;
public class ChoiceTest extends Frame {
	
	public ChoiceTest() {
		super("ChoiceTest");
	}
	public void go() {
		setLayout(new GridLayout(1,2));
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Choice choice = new Choice();
		choice.add("One");
		choice.add("Two");
		choice.add("Three");
		choice.add("Four");
		choice.add("Five");
		choice.add("Six");
		p1.add(choice);
		List list = new List(5, false); // 목록중 5개만 보이고 다중 선택 안됨
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		list.add("Six");
		p2.add(list);
		
		add(p1);
		add(p2);
		setSize(300,200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ChoiceTest().go();

	}

}
