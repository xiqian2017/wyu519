package wxq;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy2 {

	public static void main(String[] args) throws IOException {
		/**
		 * 使用文件输入流读取原文件，使用文件输出流往文件里写。 使用块读写形式
		 * 
		 */
		FileInputStream fis = new FileInputStream("G:\\IBM培训\\myfile.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("G:\\IBM培训\\myfile_cp2.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// byte[] data=new byte[1024*10];
		int len = -1;
		long start = System.currentTimeMillis();// 获取开始时间
		/**
		 * 使用了缓冲流读写时，我们就不在需要关注必须用块读写加快效率了 因为缓冲流内部维护了一个字节数组，最终会将我们的读写操作转换为 块读写加快读写效率的
		 */
		while ((len = bis.read()) != -1) {
			bos.write(len);
		}
		System.out.println("复制完毕");
		long end = System.currentTimeMillis();// 获取结束时间
		System.out.println("复制完成,耗时:" + (end - start) + "ms");
		bis.close();
		bos.close();

	}

}
