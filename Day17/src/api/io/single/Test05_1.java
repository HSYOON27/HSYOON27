package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test05_1 {
	public static void main(String[] args) throws IOException{

		//Test01_2 프로그램의 성능 개선  
		//- 버퍼(buffer)를 사용한 대량 복사 
		//- 컴터는 2진수를 쓰므로 2진수로 만들 수 있는 숫자가 최적의 성능을 발휘함. 
		//- 일반적으로 1024, 2048, 4096, 8192 중 하나를 씀 
		//- 자바 표준은 8192 
		
		File origin = new File("temp", "single.kh");
		File target = new File("temp", "copy.kh");
		
		FileInputStream in = new FileInputStream(origin);
		FileOutputStream out = new FileOutputStream(target);
		
		byte[] buffer = new byte[8192];
		
		long total = origin.length();
		long count = 0L;
		
		while(true) {
		int size = in.read(buffer); //5개씩 뭉탱이로 읽어라 
		if(size == -1) break;
		out.write(buffer, 0, size); //0부터 size 개수만큼 내보내라. 
		count += size;
		double percent = count * 100.0 / total;
		System.out.println("("+count+"/"+total+", "+ percent);
		}
		long start = System.currentTimeMillis();
		long finish = System.currentTimeMillis();

		System.out.println("시간 : "+ (finish-start));
		
		in.close();
		out.close();
		
		
	}

}
