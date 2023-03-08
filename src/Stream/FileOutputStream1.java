package Stream;

import java.io.FileOutputStream;
import java.nio.file.Files;

public class FileOutputStream1 {
	public static void main(String[] args)  
	{
		String text
        = "Welcome to geekforgeeks\nHappy Learning!";
	
	
	try {
		
	FileOutputStream fout= new FileOutputStream("D:\\a.txt");
	byte[] dataBytes= text.getBytes();
	fout.write(dataBytes);
	 
	 fout.close();
	 System.out.print("Success");
	
}catch(Exception e) {System.out.print(e);}
	 
			
	

}
}

