package awt;
import java.awt.*;
public class RadioTest extends Frame {
	
	public RadioTest() {
		super("RadioDemo");
		setLayout(new GridLayout(2, 1));
		
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		
		CheckboxGroup chg = new CheckboxGroup();
		// 전부 true로 선언되어 있다면 마지막 라디오 버튼만이 체크 표시된다
		// 전부 false로 선언되어 있다면 어떠한 것도 체코 표시되지 않는다.
		p1.add(new Checkbox("Yes",chg,true));
		p1.add(new Checkbox("No",chg,false));
		
		Checkbox one = new Checkbox("아메리카노");
		Checkbox two = new Checkbox("카페라떼");
		Checkbox three = new Checkbox("프라푸치노",true);
		
		p2.add(one);
		p2.add(two);
		p2.add(three);
		add(p1); add(p2);
		setSize(200,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new RadioTest();

	}

}
