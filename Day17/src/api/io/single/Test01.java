package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException
	{
		File target = new File("single.kh");
		File newFile = new File("copy.kh");
		
		FileInputStream input = new FileInputStream(target);
		FileOutputStream output = new FileOutputStream (newFile);
		
		while(true) {
			
					}
        
	}

}
