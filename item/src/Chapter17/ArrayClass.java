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
		// TODO �Զ����ɵķ������
		ArrayClass<String> a = new ArrayClass<>();
		String[] array = {"��Ա1","��Ա2","��Ա3","��Ա4","��Ա5"};
		a.setArray(array);
		for (int i = 0; i < a.getArray().length; i++) {
			System.out.println(a.getArray()[i]);
		}
	}

}
