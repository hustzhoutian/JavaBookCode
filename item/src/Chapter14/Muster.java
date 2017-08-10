package Chapter14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Muster {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Collection<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}
	}

}
