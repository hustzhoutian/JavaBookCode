package HomeWork;

public class Test3_8_2 {
	static String name = "周天今年";			//静态成员变量，在整个解决方案有效
	//private String a = "岁";						//实例变量，在类中有效
	public static void main(String[] args) {
		int age = 18;				//局部变量，在main中有效
		System.out.println(name+age);
	}

}
