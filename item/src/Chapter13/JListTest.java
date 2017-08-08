package Chapter13;

import java.awt.Container;

import javax.swing.*;

public class JListTest extends JFrame{
	final String[] flavors= {"�б�1","�б�2","�б�3","�б�4","�б�5"}; 
	public JListTest() {
		// TODO �Զ����ɵĹ��캯�����
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
		setTitle("�б��");
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JListTest();
	}
}
