package wxq;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy1 {

	public static void main(String[] args) throws IOException {
		/**
		 * ʹ���ļ���������ȡԭ�ļ���ʹ���ļ�����������ļ���д ʹ�ÿ��д��ʽ��ԭ�ļ�����д�뵽���ļ���ɸ��Ʋ���
		 */
		FileInputStream fis = new FileInputStream("G:\\IBM��ѵ\\myfile.txt");
		FileOutputStream fos = new FileOutputStream("G:\\IBM��ѵ\\myfile_cp.txt");
		byte[] data = new byte[1024 * 10];
		int len = -1;
		long start = System.currentTimeMillis();// ��ȡ��ʼʱ��
		while ((len = fis.read(data)) != -1) {
			fos.write(data, 0, len);
		}
		System.out.println("�������");
		long end = System.currentTimeMillis();// ��ȡ����ʱ��
		System.out.println("�������,��ʱ:" + (end - start) + "ms");
		fis.close();
		fos.close();

	}

}
