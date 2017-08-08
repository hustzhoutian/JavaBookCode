package Chapter13;
import java.awt.*;
import javax.swing.*;

public class JScrollPaneTest extends JFrame{
	public JScrollPaneTest() {
		// TODO 自动生成的构造函数存根
		Container c = getContentPane();
		JTextArea ta = new JTextArea(20, 50);
		JScrollPane sp = new JScrollPane(ta);
		c.add(sp);
		setTitle("带滚动条的文本编译器");
		setSize(200, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new JScrollPaneTest();
	}

}
