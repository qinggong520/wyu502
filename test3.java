 package ibm.com.test;

import java.io.*;
import java.util.UUID;

/**
 * 使用缓冲流，实现文件的拷贝
 */
public class test3 {
    public static void main(String[] args) throws Exception {
        //1.文本文件的拷贝
        File txtFile = new File("D:/myfile.txt");
        File destFile = new File("D:/myfile_cp2.txt");
        Reader in = new FileReader(txtFile);
        char[] chars = new char[(int) txtFile.length()];
        in.read(chars);
        Writer out = new FileWriter(destFile);
        out.write(chars);
        in.close();
        out.close();
        //2.图片文件的拷贝
        File srcFile = new File("D:/1.jpg");
        String srcFileName = srcFile.getName();
        //新的文件名
        String newName = UUID.randomUUID().toString();
        //指定目标文件
        File muFile = new File("D:/" + newName + "." + srcFileName);
        //创建一个字节数组，大小为源文件长度，长度转成int
        byte[] a = new byte[(int) srcFile.length()];
        //创建字节输入流
        InputStream fis = new FileInputStream(srcFile);
        //将源文件读入字节数组
        fis.read(a);
        //创建字节输出流
        OutputStream fos = new FileOutputStream(muFile);
        //将字节数组写入目标文件
        fos.write(a);
        fis.close();
        fos.close();
    }
}