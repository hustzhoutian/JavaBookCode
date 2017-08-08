package Chapter10;

public class ObjectInstance {
	public String toString() {
		return getClass().getName();
	}
	public static void main(String[] args) {
		System.out.println(new ObjectInstance());
	}
}
