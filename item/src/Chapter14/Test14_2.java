package Chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test14_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[] str = {"A","a","c","C","a"};
		List<String> list = new ArrayList<>();
		Set<String> set = new TreeSet<>();
		try {
			for (int i = 0; i < str.length; i++) {
				list.add(str[i]);
			}
			System.out.println(list);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		try {
			for (int i = 0; i < str.length; i++) {
				set.add(str[i]);
			}
			System.out.println(set);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
