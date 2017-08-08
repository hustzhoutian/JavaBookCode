package Chapter13;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class MyComboBox extends AbstractListModel<String> implements ComboBoxModel<String>{
	String selecteditem = null;
	String[] test = {"身份证","军人证","学生证","工作证"};
	@Override
	public String getElementAt(int index) {
		// TODO 自动生成的方法存根
		return test[index];
	}

	@Override
	public int getSize() {
		// TODO 自动生成的方法存根
		return test.length;
	}


	@Override
	public Object getSelectedItem() {
		// TODO 自动生成的方法存根
		return selecteditem;
	}

	@Override
	public void setSelectedItem(Object item) {
		// TODO 自动生成的方法存根
		selecteditem = (String) item;
	}
	
}
