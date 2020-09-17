
package ibm.com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileCopy {
public static void main(String[] args) {

FileInputStream fis;
try {



//数据源文件
fis = new FileInputStream("myfile.txt");


//数据目的文件
FileOutputStream fos = new FileOutputStream("myfile_cp.txt");

byte[] buf = new byte[1024];
int len = 0;

while((len = fis.read(buf))!=-1) {
fos.write(buf,0,len);
}

// int b = 0;
// while((b = fis.read())!=0) {
// fos.write(b);
// }
if(fos!=null) {
fos.close();
}
if (fis!=null) {
fis.close();
}


} catch (FileNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}





}

}
