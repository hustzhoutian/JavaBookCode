package Chapter13;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class MyComboBox extends AbstractListModel<String> implements ComboBoxModel<String>{
	String selecteditem = null;
	String[] test = {"���֤","����֤","ѧ��֤","����֤"};
	@Override
	public String getElementAt(int index) {
		// TODO �Զ����ɵķ������
		return test[index];
	}

	@Override
	public int getSize() {
		// TODO �Զ����ɵķ������
		return test.length;
	}


	@Override
	public Object getSelectedItem() {
		// TODO �Զ����ɵķ������
		return selecteditem;
	}

	@Override
	public void setSelectedItem(Object item) {
		// TODO �Զ����ɵķ������
		selecteditem = (String) item;
	}
	
}
