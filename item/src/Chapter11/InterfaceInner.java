package Chapter11;

public class InterfaceInner {
	public static void main(String[] args) {
		OuterClass2 out = new OuterClass2();
		OutInterface outinter = out.doit();
		outinter.f();
	}
}
