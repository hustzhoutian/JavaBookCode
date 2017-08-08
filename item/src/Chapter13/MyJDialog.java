package Chapter13;

import java.awt.Container;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class MyJDialog extends JDialog{
	public MyJDialog(MyFrame frame) {
		// TODO 自动生成的构造函数存根
		super(frame, "这是第一个窗体", true);
		Container container = getContentPane();
		container.add(new JLabel("这是一个对话框"));
		setBounds(120, 120, 100, 100);
		
	}
}
