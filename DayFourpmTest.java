package ibm.com.testdemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class DayFourpmTest {

	public static final String filepath1 = "C:/java1/1.txt";// 源文件的地址
	public static final String filepath2 = "C:/java1/1.txt";// 源文件的地址

	public static void main(String[] args) {
		File file = new File(filepath1);
		Reader read = null;
		try {
			read = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader breader = new BufferedReader(read);
		String content = null;

		try {
			while ((content = breader.readLine()) != null) {
				System.out.println("这是我文件的内容：" + content);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				breader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				read.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		File file2 = new File(filepath2);
		Writer write = null;
		try {
			write = new FileWriter(file2, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		BufferedWriter bwriter = new BufferedWriter(write);

		try {
			bwriter.write("这是新写入的内容");
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				bwriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				write.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
