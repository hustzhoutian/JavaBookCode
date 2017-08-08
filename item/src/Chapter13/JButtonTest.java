package Chapter13;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.*;

public class JButtonTest extends JFrame{
	public JButtonTest() {
		// TODO 自动生成的构造函数存根
		URL url = MyImageIcon.class.getResource("imageButtoo.jpg");
		Icon icon = new ImageIcon(url);
		setLayout(new GridLayout(3, 2, 5, 5));
		Container c = getContentPane();
		for (int i = 0; i < 5; i++) {
			JButton j = new JButton("buttun"+i,icon);
			c.add(j);
			if(i%2==0){
				j.setEnabled(false);
			}
		}
		JButton jb = new JButton();
		jb.setMaximumSize(new Dimension(50, 30));
		jb.setIcon(icon);
		jb.setHideActionText(true);
		jb.setToolTipText("图片按钮");
		jb.setBorderPainted(false);
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				JOptionPane.showMessageDialog(null, "弹出对话框");
			}
		});
		c.add(jb);
		setTitle("创建带文字与图片的按钮");
		setSize(300, 200);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new JButtonTest();
	}

}
