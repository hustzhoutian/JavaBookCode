package GetOffer;

public class Solution2 {
	//�滻�ո�
	public String replaceSpace(StringBuffer str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				str.setCharAt(i, '%');
				str.insert(i+1, "20");
			}
		}
		return str.toString();
    }
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		StringBuffer sb = new StringBuffer("We Are Happy");
		String r = new Solution2().replaceSpace(sb);
		System.out.println(r);
	}

}
