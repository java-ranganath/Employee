package exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileFind {
	public static void main(String[] args) throws IOException {
		try {
			File f=new File("C://RANGANATHAN//Documents//hi.txt");
		
		FileReader fr=new FileReader(f);
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.println((char)(temp));
		}
		
	}
	
	catch (IOException i) {
		System.out.println("not found");
	}
	System.out.println("rest of the code");

}
}
