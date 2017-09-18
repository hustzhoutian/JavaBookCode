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
		// TODO �Զ����ɵķ������
		MutiOverClass<Integer, String> mu = new MutiOverClass<>();
		for (int i = 0; i < 5; i++) {
			mu.put(i, "���Ǽ��ϳ�Ա"+i);
			
		}
		for (int i = 0; i < mu.m.size(); i++) {
			System.out.println(mu.get(i));
		}
	}

}
