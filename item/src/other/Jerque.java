package other;


public class Jerque {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String str = "";
		long starTime = System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			str = str+i;
		}
		long endTime = System.currentTimeMillis();
		long time = endTime-starTime;
		System.out.println(time);
		starTime = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder();
		for(int j=0;j<10000;j++){
			builder.append(j);
		}
		endTime = System.currentTimeMillis();
		time = endTime-starTime;
		System.out.println(time);
		String str1 = builder.toString();
		System.out.println(str1);
	}
}
