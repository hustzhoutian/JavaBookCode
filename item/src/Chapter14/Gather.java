package Chapter14;

import java.util.ArrayList;
import java.util.List;

public class Gather {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		int i = (int) (Math.random()*list.size());
		System.out.println("随机输出："+list.get(i));
		list.remove(2);	
		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j));
		}
	}
}
