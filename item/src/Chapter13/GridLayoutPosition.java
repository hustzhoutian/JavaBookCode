package Chapter13;
import java.awt.*;
import javax.swing.*;;
public class GridLayoutPosition extends JFrame{
	public GridLayoutPosition() {
		// TODO �Զ����ɵĹ��캯�����
		setTitle("���񲼾�");
		Container c = getContentPane();
		setLayout(new GridLayout(7, 3));
		for (int i = 0; i < 20; i++) {
			c.add(new JButton("button"+i));
		}
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridLayoutPosition();
	}
}
