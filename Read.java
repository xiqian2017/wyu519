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
		Writer out = null;// 声明一个字符流对象变量
		out = new FileWriter(f, true);
		String str = "wxq好帅！";
		out.write(str);// 通过字符串输出流数组将字符串数组写入到指定的文件当中
		out.close();// 关闭字符串输出流
		// 对指定文件当中的字符串数组进行读取操作
		Reader reader = new FileReader(f);// 创建指定文件的字符串读取流
		char ch[] = new char[1024];// 将从指定文件当中读取到的数据存放到字符数组当中
		int len = reader.read(ch);// 将文件当中的内容读取到字节数组当中并返回所读取的字节数组的长度
		reader.close();// 关闭字符串输出流
		System.out.println("文件内容为:" + new String(ch, 0, len));// 将字节数组当中的内容转换为字符串并进行输出操作
	}

}