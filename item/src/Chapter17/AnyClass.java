package Chapter17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class AnyClass {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		for (int i = 0; i < a.size(); i++) {
			System.out.println("a中的值为"+a.get(i));
		}
		Map<Integer, String> m = new HashMap<>();
		for (int i = 0; i < 5; i++) {
			m.put(i, "成员"+i);
		}
		for (int i = 0; i < m.size(); i++) {
			System.out.println("value"+m.get(i));
		}
		Vector<String> v = new Vector<>();
		for (int i = 0; i < 5; i++) {
			v.addElement("成员"+i);
		}
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
	}

}
