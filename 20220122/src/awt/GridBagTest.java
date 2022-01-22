package awt;
import java.awt.*;
public class GridBagTest extends Frame {
	
	public GridBagTest() {
		super("MyGridBag");
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints constraint = new GridBagConstraints();
		setLayout(gridbag);
		
		constraint.fill = GridBagConstraints.BOTH; // 격자 크기에 컴포넌트를 맞추게 지정한다.
		constraint.weightx = 1.0; // 좌측 상단 닶을 1.0으로 지정한다.
		Button b1 = new Button("Button1"); // 버튼 1을 생성한다.
		gridbag.setConstraints(b1, constraint); // 위에서 지정한 배치값에 맞추어 버튼을 지정한다.
		add(b1);
		
		Button b2 = new Button("Button2");
		gridbag.setConstraints(b2,constraint); // 버튼 1과 같은 배치 값에 맞추어 버튼2를 지정한다.
		add(b2);
		
		constraint.gridwidth = GridBagConstraints.REMAINDER; // 행의 마지막 위치에 지정한다.
		Button b3 = new Button("Button3");
		gridbag.setConstraints(b3,constraint); 
		add(b3);
		
		constraint.gridwidth = 1; // 격자의 폭과 넓이 지정
		constraint.gridheight = 2;
		Button b4 = new Button("Button4");
		gridbag.setConstraints(b4,constraint);
		add(b4);
		
		constraint.gridwidth = GridBagConstraints.REMAINDER;
		constraint.gridheight = 1;
		constraint.weighty = 0.0;
		Button b5 = new Button("Button5");
		gridbag.setConstraints(b5,constraint);
		add(b5);
		
		Button b6 = new Button("Butt0n6");
		gridbag.setConstraints(b6,constraint);
		add(b6);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridBagTest();

	}

}
