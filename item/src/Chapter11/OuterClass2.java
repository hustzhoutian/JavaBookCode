package Chapter11;

public class OuterClass2 {
	private class InnerClass implements OutInterface{
		public InnerClass(String s) {
			// TODO 自动生成的构造函数存根
			System.out.println(s);
		}
		@Override
		public void f() {
			// TODO 自动生成的方法存根
			System.out.println("访问内部类中的f（）方法");
		}
		
	}
	
	
	public OutInterface doit() {
		return new InnerClass("访问内部类的构造方法");
	}
}
