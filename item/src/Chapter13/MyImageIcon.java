package Chapter13;

import java.awt.*;
import java.net.URL;

import javax.swing.*;

public class MyImageIcon extends JFrame{
	public MyImageIcon() {
		// TODO �Զ����ɵĹ��캯�����
		Container c = getContentPane();
		JLabel jl = new JLabel("JFrame����", JLabel.CENTER);
		URL url = MyImageIcon.class.getResource("imageButton.jpg");
		Icon icon = new ImageIcon(url);
		jl.setIcon(icon);
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		//jl.setOpaque(true);
		c.add(jl);
		setSize(200, 100);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MyImageIcon();
	}
}
