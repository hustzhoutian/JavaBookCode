package Chapter15;

import java.io.*;

public class FileTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		File file = new File("word.txt");
		if (file.exists()) {
			file.delete();
			System.out.println("�ļ���ɾ��");
		} else {
			try {
				file.createNewFile();
				System.out.println("�ļ��Ѵ���"+file.getAbsolutePath());
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
