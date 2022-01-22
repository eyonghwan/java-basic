package awt;
import java.awt.*;
public class TextTest extends Frame {
	
	public TextTest() {
		super("TextTest");
		setLayout(new FlowLayout());
		Label label = new Label("Label 와우!");
		TextArea text01 = new TextArea("TextArea : 주말은 항상 즐겁당", 5, 30);
		TextField text02 = new TextField("TextField : 언제나 행복하다", 30);
		add(label);
		add(text01);
		add(text02);
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextTest();

	}

}
