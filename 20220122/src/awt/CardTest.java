package awt;
import java.awt.*;
import java.awt.event.*;

public class CardTest extends Frame {
	Panel p1, p2;
	Label l1, l2;
	CardLayout card;
	public CardTest() {
		super("MyCard");
		setLayout(card = new CardLayout());
		p1 = new Panel();
		p2 = new Panel();
		
		l1 = new Label("First Panel");
		p1.setBackground(Color.yellow);
		l2 = new Label("First Panel");
		p2.setBackground(Color.green);
		
		MouseHandler handler = new MouseHandler();
		// 클릭하게 되면 화면이 바뀌는 이벤트를 가진 클래스를 생성한다.
		p1.add(l1);
		p1.addMouseListener(handler); // 첫 번째 패널에 이벤드 지정
		p2.add(l2);
		p2.addMouseListener(handler); // 두 번째 패널에 이벤드 지정
		
		add("First", p1);
		add("Second", p2);
		
		card.show(this, "First");
		setSize(300,200);
		setVisible(true);
	}
	
	public class MouseHandler extends MouseAdapter {
		
		public void mouseClicked(MouseEvent e) {
			// 마우스를 클릭하게 되면 다음 카드 레이아웃을 가진
			// 패널로 이동하게 구현한다.
			card.next(CardTest.this);
		}
	}

	public static void main(String[] args) {
		new CardTest();

	}

}
