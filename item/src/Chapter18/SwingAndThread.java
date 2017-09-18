package Chapter18;

import java.awt.Container;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class SwingAndThread extends JFrame{
	private JLabel jl = new JLabel();
	private static Thread t;
	private int count = 0;
	private Container c = getContentPane();
	
	public SwingAndThread() {
		// TODO 自动生成的构造函数存根
		setBounds(300, 200, 250, 100);
		c.setLayout(null);
		URL url = SwingAndThread.class.getResource("1.png");
		Icon icon = new ImageIcon(url);
		jl.setIcon(icon);
		jl.setHorizontalAlignment(SwingConstants.LEFT);
		jl.setBounds(10, 10, 200, 50);
		jl.setOpaque(true);
		t = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO 自动生成的方法存根
				while (count <= 200) {
					jl.setBounds(count, 10, 200, 50);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					count += 10;
					if (count == 200) {
						count = 10;
					}
				}
			}
		});
		t.start();
		c.add(jl);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new SwingAndThread();
	}

}
