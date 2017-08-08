package Chapter13;

import java.awt.Container;

import javax.swing.*;

public class JListTest extends JFrame{
	final String[] flavors= {"列表1","列表2","列表3","列表4","列表5"}; 
	public JListTest() {
		// TODO 自动生成的构造函数存根
		Container cp = getContentPane();
		cp.setLayout(null);
//		JList<String> jl = new JList<>(new MyListModel());
//		JScrollPane js = new JScrollPane(jl);
//		js.setBounds(10, 10, 100, 100);
//		cp.add(js);
		final DefaultListModel items= new DefaultListModel();
		final JList list = new JList(items);
		for (int i = 0; i < flavors.length; i++) {
			items.addElement(flavors[i]);			
		}
		list.setBounds(10, 10, 100, 100);
		cp.add(list);
		setTitle("列表框");
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JListTest();
	}
}
