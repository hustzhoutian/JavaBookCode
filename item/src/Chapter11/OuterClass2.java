package Chapter11;

public class OuterClass2 {
	private class InnerClass implements OutInterface{
		public InnerClass(String s) {
			// TODO �Զ����ɵĹ��캯�����
			System.out.println(s);
		}
		@Override
		public void f() {
			// TODO �Զ����ɵķ������
			System.out.println("�����ڲ����е�f��������");
		}
		
	}
	
	
	public OutInterface doit() {
		return new InnerClass("�����ڲ���Ĺ��췽��");
	}
}
