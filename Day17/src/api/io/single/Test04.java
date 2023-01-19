package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test04 {
	public static void main(String[] args) throws IOException {
		//한 번에 여러 개의 바이트를 입력 받는 예제(Test02번 개선)
		
		File target = new File("temp", "single.kh");
		FileInputStream stream = new FileInputStream(target);
		//여러 개의 바이트를 한 번에 입력받기 위해 바이트 배열을 준비
		byte[] cart = new byte[5];
		
		//옮겨야 하는 파일은 21byte이며, 카트는 5byte이므로 
		//1회차 - (5/21)~~~ 5회차(22/21)
		
		int size = stream.read(cart);
		
		stream.read(cart); //읽어서 카트에 담아라 
		System.out.println(size+", "+Arrays.toString(cart));
		stream.read(cart); 
		System.out.println(size+", "+Arrays.toString(cart));
		stream.read(cart); 
		System.out.println(size+", "+Arrays.toString(cart));
		stream.read(cart); 
		System.out.println(size+", "+Arrays.toString(cart));
		stream.read(cart); 
		System.out.println(size+", "+Arrays.toString(cart));
		stream.read(cart); 
		System.out.println(size+", "+Arrays.toString(cart));
		
		stream.close();

	}

}
