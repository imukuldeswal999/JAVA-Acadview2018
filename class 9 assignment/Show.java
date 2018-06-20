import java.util.*;
import java.io.*;

class Show{
public static void main(String args[])throws IOException{
	
	
	int sh;

File f1=new File("C:\\Users\\Mukul\\Desktop\\Java classes\\class 9 assignment\\def.txt");

FileInputStream d= new FileInputStream(f1);

while((sh=d.read()) != -1)
{
	
	System.out.print((char)sh);
	
}
}
}

