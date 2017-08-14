package Chapter14;

import java.util.*;

public class Test14_1 {	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < 101; i++) {
			list.add(i);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		list.remove(10);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
