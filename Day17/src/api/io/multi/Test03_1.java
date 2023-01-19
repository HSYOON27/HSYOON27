package api.io.multi;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test03_1 {
	public static void main(String[] args) throws IOException{

		//로또번호 6개를 lotto.kh에 출력 
		
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i<=45; i++) {
			list.add(i);
		}
		
		Collections.shuffle(list);
		
		List<Integer> numbers = list.subList(0, 6); //0부터 6개
		
		//파일 출력
		File dir = new File("temp");
		dir.mkdirs();//디렉터리 생성 
		File target = new File("temp", "lotto.kh");
		FileOutputStream stream = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(stream); 
		DataOutputStream mixer = new DataOutputStream(buffer);
		
		for(int number : numbers) {
			mixer.writeInt(number);
		}
		
		mixer.close();
		
		System.out.println(numbers);
		
	}
	

}
