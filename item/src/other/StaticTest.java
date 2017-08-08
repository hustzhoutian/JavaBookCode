package other;


public class StaticTest {
	static double PI = 3.1415;
	static int id;
	public static void  method1() {
		System.out.println("¾²Ì¬·½·¨");
	}
	public void method2(){
		System.out.println(StaticTest.PI);
		System.out.println(StaticTest.id);
		StaticTest.method1();
	}
	public static void method3(){
		method1();
//		return StaticTest;
	}
	public StaticTest(){
		System.out.println(1);
	}

}
