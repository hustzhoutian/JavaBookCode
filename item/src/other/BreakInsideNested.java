package other;


public class BreakInsideNested {
	public static void main(String[] args) {
		for(int i=0;i<3;i++){
			for(int j=0;j<100;j++){
				if(j==4)
					break;
				System.out.println(i+" "+j);
			}
		}
		LOOP:for(int i=0;i<3;i++){
			for(int j=0;j<100;j++){
				if(j==4)
					break LOOP;
				System.out.println(i+" "+j);
			}
		}
	}
}
