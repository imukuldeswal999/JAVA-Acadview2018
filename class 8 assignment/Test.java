
import java.io.*;
import java.util.*;
class Test{
	public static void main(String[] args) throws IOException{
		int x;
		
		File f1 = new File("C:\\Users\\Mukul\\Desktop\\Java classes\\class 8 assignment\\abc.txt");
		File f2 = new File("C:\\Users\\Mukul\\Desktop\\Java classes\\class 8 assignment\\efg.txt");
		
		FileInputStream I1 =new FileInputStream(f1);
		FileOutputStream O2 =new FileOutputStream(f2);
		
		BufferedInputStream fis = new BufferedInputStream(I1);
		BufferedOutputStream fos = new BufferedOutputStream(O2);
		
	while((x=fis.read())!= -1)
	{
		fos.write((char)x);
		System.out.print((char)x);
		
		
	}
	fis.close();
fos.close();
}
}

