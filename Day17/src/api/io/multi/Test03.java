package api.io.multi;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test03 {
	public static void main(String[] args) throws IOException{

		//파일 출력 
		File target = new File("temp", "lotto.kh");
		FileOutputStream stream = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(stream); 
		DataOutputStream mixer = new DataOutputStream(buffer);
		
		Random r = new Random();
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < 6; i++) {
			int lotto = r.nextInt(45) + 1;
			if (!numbers.contains(lotto)) {
				numbers.add(lotto);
			}
			else {
				i--;
			}
		}
		for(int lotto : numbers) {
			System.out.println(lotto);
			mixer.writeInt(lotto); 
		}
		
		mixer.close();
	}

}
