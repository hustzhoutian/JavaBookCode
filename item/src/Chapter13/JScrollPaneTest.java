package Chapter13;
import java.awt.*;
import javax.swing.*;

public class JScrollPaneTest extends JFrame{
	public JScrollPaneTest() {
		// TODO �Զ����ɵĹ��캯�����
		Container c = getContentPane();
		JTextArea ta = new JTextArea(20, 50);
		JScrollPane sp = new JScrollPane(ta);
		c.add(sp);
		setTitle("�����������ı�������");
		setSize(200, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new JScrollPaneTest();
	}

}
