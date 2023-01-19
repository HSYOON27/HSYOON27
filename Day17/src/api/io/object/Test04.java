package api.io.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Test04 {
	public static void main(String[] args) throws IOException, ClassNotFoundException{

		File target = new File("temp", "input.kh");
		FileInputStream stream = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(stream);
		ObjectInputStream combine = new ObjectInputStream(buffer);
		
		//Generic Type은 다운캐스팅에서 고려 대상이 아니다. 
		List<String> word = (List<String>) combine.readObject();
		
		System.out.println(word);
		
		combine.close();

	}

}
