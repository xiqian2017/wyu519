package wxq;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy2 {

	public static void main(String[] args) throws IOException {
		/**
		 * ʹ���ļ���������ȡԭ�ļ���ʹ���ļ���������ļ���д�� ʹ�ÿ��д��ʽ
		 * 
		 */
		FileInputStream fis = new FileInputStream("G:\\IBM��ѵ\\myfile.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("G:\\IBM��ѵ\\myfile_cp2.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// byte[] data=new byte[1024*10];
		int len = -1;
		long start = System.currentTimeMillis();// ��ȡ��ʼʱ��
		/**
		 * ʹ���˻�������дʱ�����ǾͲ�����Ҫ��ע�����ÿ��д�ӿ�Ч���� ��Ϊ�������ڲ�ά����һ���ֽ����飬���ջὫ���ǵĶ�д����ת��Ϊ ���д�ӿ��дЧ�ʵ�
		 */
		while ((len = bis.read()) != -1) {
			bos.write(len);
		}
		System.out.println("�������");
		long end = System.currentTimeMillis();// ��ȡ����ʱ��
		System.out.println("�������,��ʱ:" + (end - start) + "ms");
		bis.close();
		bos.close();

	}

}
