package Chapter13;

import javax.swing.AbstractListModel;

public class MyListModel extends AbstractListModel<String>{
	private String[] contents = {"�б�1","�б�2","�б�3","�б�4","�б�5"};
	@Override
	public String getElementAt(int x) {
		// TODO �Զ����ɵķ������
		if (x<contents.length) {
			return contents[x++];
		} else {
			return null;
		}
	}

	@Override
	public int getSize() {
		// TODO �Զ����ɵķ������
		return contents.length;
	}
	

}
