package other;


import java.text.DecimalFormat;

public class DecimalFormatSimpleDemo {
	
	static public void SimgleFormat(String pattern,double value){
		//ʵ����DecimalFormat����
		DecimalFormat myFormat = new DecimalFormat(pattern);
		String out = myFormat.format(value);
		System.out.println(value+" "+pattern+" "+out);
	}
	
	static public void UseApplePatternMethodFormat(String pattern,double value){
		DecimalFormat myFormat = new DecimalFormat(pattern);
		myFormat.applyPattern(pattern);
		System.out.println(value+" "+pattern+" "+myFormat.format(value));
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		SimgleFormat("###,###.###", 123456.789);
		UseApplePatternMethodFormat("#.###%", 0.789);
		UseApplePatternMethodFormat("###,###.###", 123456.789);
	}

}
