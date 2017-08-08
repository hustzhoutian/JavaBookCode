package other;


public class Test {
	public Test(){
		//....
	}
	protected void dosomething(){
		//......
	}
	protected Test dolt(){
		return new Test();
	}
}

class Test2 extends Test{
	public Test2(){
		super();
		super.dosomething();
	}
	public void dosomethingnew() {
		//.....
		
	}
	public void dosomething() {
		//....
	}
	protected Test2 dolt() {
		return new Test2();
	}
}
