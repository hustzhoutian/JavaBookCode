package Chapter11;

public class TheSameName {
	private int x;
	private class Inner{
		private int x = 9;
		public void doit(int x){
			x++;
			this.x++;
			TheSameName.this.x++;
		}
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TheSameName tsn = new TheSameName();
		Inner inner = tsn.new Inner();
		inner.doit(0);
		System.out.println(tsn.x);
	}

}
