package Chapter15;

import java.io.*;

public class FileTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File file = new File("word.txt");
		if (file.exists()) {
			file.delete();
			System.out.println("文件已删除");
		} else {
			try {
				file.createNewFile();
				System.out.println("文件已创建"+file.getAbsolutePath());
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
