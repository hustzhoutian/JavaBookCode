package other;


import java.text.DecimalFormat;

public class DecimalFormatSimpleDemo {
	
	static public void SimgleFormat(String pattern,double value){
		//实例化DecimalFormat对象
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
		// TODO 自动生成的方法存根
		SimgleFormat("###,###.###", 123456.789);
		UseApplePatternMethodFormat("#.###%", 0.789);
		UseApplePatternMethodFormat("###,###.###", 123456.789);
	}

}
