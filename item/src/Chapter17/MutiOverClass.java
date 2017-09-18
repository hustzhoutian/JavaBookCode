package Chapter17;

import java.util.HashMap;
import java.util.Map;

public class MutiOverClass<K,V> {
	public Map<K, V> m = new HashMap<>();
	public void put(K k,V v){
		m.put(k, v);
	}
	public V get(K k) {
		return m.get(k);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MutiOverClass<Integer, String> mu = new MutiOverClass<>();
		for (int i = 0; i < 5; i++) {
			mu.put(i, "我是集合成员"+i);
			
		}
		for (int i = 0; i < mu.m.size(); i++) {
			System.out.println(mu.get(i));
		}
	}

}
