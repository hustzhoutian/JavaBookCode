package Chapter13;

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class DrawIcon implements Icon{
	
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		DrawIcon icon = new DrawIcon(15,15);
		JLabel jl = new JLabel("����", icon, SwingConstants.CENTER);
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setSize(200, 200);
		Container c = jf.getContentPane();
		c.add(jl);
		
	}

	private int width;
	private int height;
	@Override
	public int getIconHeight() {
		// TODO �Զ����ɵķ������
		return this.height;
	}


	@Override
	public int getIconWidth() {
		// TODO �Զ����ɵķ������
		return this.width;
	}
	
	public DrawIcon(int width,int height) {
		// TODO �Զ����ɵĹ��캯�����
		this.width = width;
		this.height = height;
	}

	@Override
	public void paintIcon(Component arg0, Graphics arg1, int x, int y) {
		// TODO �Զ����ɵķ������
		arg1.fillOval(x, y, width, height);
	}

}
