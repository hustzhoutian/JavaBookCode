package Chapter13;
import java.awt.*;
import javax.swing.*;;
public class GridLayoutPosition extends JFrame{
	public GridLayoutPosition() {
		// TODO 自动生成的构造函数存根
		setTitle("网格布局");
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
