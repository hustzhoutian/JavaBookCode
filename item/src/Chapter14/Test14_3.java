package Chapter14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test14_3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Map<String, String> map = new HashMap<>();
		Emp emp1 = new Emp("001","史蒂夫");
		Emp emp2 = new Emp("005","大");
		Emp emp3 = new Emp("004","啥地方");
		Emp emp4 = new Emp("009","给点日官方");
		Emp emp5 = new Emp("012","我当时算法的");
		Emp emp6 = new Emp("015","地方还收复");
		
		map.put(emp1.getId(), emp1.getName());
		map.put(emp2.getId(), emp2.getName());
		map.put(emp3.getId(), emp3.getName());
		map.put(emp4.getId(), emp4.getName());
		map.put(emp5.getId(), emp5.getName());
		map.put(emp6.getId(), emp6.getName());
		
		map.remove("016");
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String id = (String) it.next();
			String name = map.get(id);
			System.out.println(id+" "+name);
		}
		System.out.println("........");
		
		TreeMap<String,String> tmap= new TreeMap<>(); 
		tmap.putAll(map);
		Set<String> tset = tmap.keySet();
		Iterator<String> tit = set.iterator();
		while (tit.hasNext()) {
			String id = (String) tit.next();
			String name = map.get(id);
			System.out.println(id+" "+name);
		}
	}

}
