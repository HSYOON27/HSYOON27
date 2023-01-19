package api.io.multi;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {
	public static void main(String[] args) throws IOException{
		
		//파일 입력 
		
		File target = new File("temp", "lotto.kh");
		FileInputStream stream = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(stream); 
		DataInputStream combine = new DataInputStream(buffer);
		
		int a = combine.readInt();
		int b = combine.readInt();
		int c = combine.readInt();
		int d = combine.readInt();
		int e = combine.readInt();
		int f = combine.readInt();

		combine.close();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

		
		
	}
	

}
