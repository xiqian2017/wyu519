package xiqian;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Read {

	public static void main(String[] args) throws Exception {
		File f = new File("D:\\wxq" + File.separator + "wxq.txt");
		f.createNewFile();
		Writer out = null;// ����һ���ַ����������
		out = new FileWriter(f, true);
		String str = "wxq��˧��";
		out.write(str);// ͨ���ַ�����������齫�ַ�������д�뵽ָ�����ļ�����
		out.close();// �ر��ַ��������
		// ��ָ���ļ����е��ַ���������ж�ȡ����
		Reader reader = new FileReader(f);// ����ָ���ļ����ַ�����ȡ��
		char ch[] = new char[1024];// ����ָ���ļ����ж�ȡ�������ݴ�ŵ��ַ����鵱��
		int len = reader.read(ch);// ���ļ����е����ݶ�ȡ���ֽ����鵱�в���������ȡ���ֽ�����ĳ���
		reader.close();// �ر��ַ��������
		System.out.println("�ļ�����Ϊ:" + new String(ch, 0, len));// ���ֽ����鵱�е�����ת��Ϊ�ַ����������������
	}

}