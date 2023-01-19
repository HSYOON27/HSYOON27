package api.io.multi;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class Test04_1 {
	public static void main(String[] args) throws IOException{
		
		Set<Integer> numbers = new TreeSet<>();
		
		File target = new File("temp", "lotto.kh");
		FileInputStream stream = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(stream); 
		DataInputStream combine = new DataInputStream(buffer);
		
		//1. 개수를 알때.
		for(int i = 0; i<6; i++) {
		int number = combine.readInt();
		numbers.add(number);
		}
		
		//2. 개수를 모를때.

		try {
		while(true) {
			int number = combine.readInt();
			numbers.add(number);
		}
		}
		catch(Exception e) {
			//아무것도 할 일이 없음. 
		}
		combine.close();
		
		System.out.println(numbers);
 
		
		
		
	}
	

}
