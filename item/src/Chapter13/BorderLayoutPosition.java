package Chapter13;

import java.awt.*;

import javax.swing.*;

public class BorderLayoutPosition extends JFrame{
	String[] border = {BorderLayout.CENTER,BorderLayout.NORTH,
			BorderLayout.SOUTH,BorderLayout.WEST,BorderLayout.EAST};
	String[] buttonName = {"��","��","��","��","��"};
	public BorderLayoutPosition() {
		// TODO �Զ����ɵĹ��캯�����
		setTitle("�߽粼��");
		Container c = getContentPane();
		setLayout(new BorderLayout());
		for (int i = 0; i < border.length; i++) {
			c.add(border[i], new JButton(buttonName[i]));
		}
		setVisible(true);
		setSize(350, 200);
	}
	
	public static void main(String[] args) {
		new BorderLayoutPosition();
	}
}
