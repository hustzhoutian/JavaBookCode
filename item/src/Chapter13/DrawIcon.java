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
		// TODO 自动生成的方法存根
		DrawIcon icon = new DrawIcon(15,15);
		JLabel jl = new JLabel("测试", icon, SwingConstants.CENTER);
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
		// TODO 自动生成的方法存根
		return this.height;
	}


	@Override
	public int getIconWidth() {
		// TODO 自动生成的方法存根
		return this.width;
	}
	
	public DrawIcon(int width,int height) {
		// TODO 自动生成的构造函数存根
		this.width = width;
		this.height = height;
	}

	@Override
	public void paintIcon(Component arg0, Graphics arg1, int x, int y) {
		// TODO 自动生成的方法存根
		arg1.fillOval(x, y, width, height);
	}

}
