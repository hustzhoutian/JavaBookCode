package Chapter13;
import java.awt.*;
import javax.swing.*;

public class Example1 extends JFrame {
	public void CreatFrame(){
		JFrame jf = new JFrame();
		Container container = jf.getContentPane();
		JLabel jl = new JLabel("这是一个Jfame窗体");
		//标签文字居中
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		container.setBackground(Color.white);
		jf.setSize(200, 150);		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Example1().CreatFrame();
	}
}
