package Chapter13;

import java.awt.Container;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class MyJDialog extends JDialog{
	public MyJDialog(MyFrame frame) {
		// TODO �Զ����ɵĹ��캯�����
		super(frame, "���ǵ�һ������", true);
		Container container = getContentPane();
		container.add(new JLabel("����һ���Ի���"));
		setBounds(120, 120, 100, 100);
		
	}
}
