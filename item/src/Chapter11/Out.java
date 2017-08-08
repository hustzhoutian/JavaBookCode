package Chapter11;

public class Out {
	In in = new In();
	public void ouf(){
		in.inf();
	}
	private class In{
		public In() {
			// TODO 自动生成的构造函数存根
			y = 5;
		}

		public void inf() {
			// TODO 自动生成的方法存根			
		}		
		int y = 0;
	}
	public In diot(){
		in.y = 4;
		return new In();
	}

	public static void main(String[] args) {
		Out out = new Out();
		Out.In in1 = out.diot();
		Out.In in2 = out.new In();
		System.out.println(in1.y);
	}
}

