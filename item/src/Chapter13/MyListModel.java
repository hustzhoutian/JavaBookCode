package Chapter13;

import javax.swing.AbstractListModel;

public class MyListModel extends AbstractListModel<String>{
	private String[] contents = {"列表1","列表2","列表3","列表4","列表5"};
	@Override
	public String getElementAt(int x) {
		// TODO 自动生成的方法存根
		if (x<contents.length) {
			return contents[x++];
		} else {
			return null;
		}
	}

	@Override
	public int getSize() {
		// TODO 自动生成的方法存根
		return contents.length;
	}
	

}
