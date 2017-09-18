package Chapter17;


public class ArrayClass<T> {
	private T[] Array;
	public void setArray(T[] array) {
		Array = array;
	}
	public T[] getArray() {
		return Array;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayClass<String> a = new ArrayClass<>();
		String[] array = {"成员1","成员2","成员3","成员4","成员5"};
		a.setArray(array);
		for (int i = 0; i < a.getArray().length; i++) {
			System.out.println(a.getArray()[i]);
		}
	}

}
