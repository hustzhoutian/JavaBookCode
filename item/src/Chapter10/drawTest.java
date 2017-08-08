package Chapter10;

public interface drawTest {
	public void draw();
	public static void main(String[] args) {
		drawTest[] d = {new SquareUseInterface(),new ParallelogramgleUseInterface()};
		for (int i = 0; i < d.length; i++) {
			d[i].draw();
		}
	}
}

class ParallelogramgleUseInterface extends QuadrangleUseInterface implements drawTest{
	public void draw(){
		System.out.println("pxsbx.draw()");
	}
	
	public void doAnyThing(){
		//
	}
}

class SquareUseInterface extends QuadrangleUseInterface implements drawTest{
	public void draw(){
		System.out.println("zfx.draw()");
	}
	
	public void doAnyThing() {
		//		
	}
}

