package wxq;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy1 {

	public static void main(String[] args) throws IOException {
		/**
		 * 使用文件输入流读取原文件，使用文件输出流往新文件里写 使用块读写形式将原文件数据写入到新文件完成复制操作
		 */
		FileInputStream fis = new FileInputStream("G:\\IBM培训\\myfile.txt");
		FileOutputStream fos = new FileOutputStream("G:\\IBM培训\\myfile_cp.txt");
		byte[] data = new byte[1024 * 10];
		int len = -1;
		long start = System.currentTimeMillis();// 获取开始时间
		while ((len = fis.read(data)) != -1) {
			fos.write(data, 0, len);
		}
		System.out.println("复制完毕");
		long end = System.currentTimeMillis();// 获取结束时间
		System.out.println("复制完成,耗时:" + (end - start) + "ms");
		fis.close();
		fos.close();

	}

}
