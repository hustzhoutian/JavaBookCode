package Chapter13;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class JComboBoxModelTest extends JFrame{
	JComboBox<String> jc = new JComboBox<>(new MyComboBox());
	JLabel jl = new JLabel("��ѡ��֤����");
	public JComboBoxModelTest() {
		// TODO �Զ����ɵĹ��캯�����
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(jl);
		cp.add(jc);
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JComboBoxModelTest();
	}
}
