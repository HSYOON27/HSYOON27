package api.io.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test03 {
	public static void main(String[] args) throws IOException {
		//문자열 출력.은 스트림을 따로 쓴다
		//- Writer와 Reader를 상속받은 클래스들을 조합하여 사용한다.
		//- 버퍼 성능 조절을 위해 BufferedWriter 조합
		//- 다양한 출력 형태를 위해 PrintWriter를 조합함.(분해도구가 아님) ex) 숫자도 넣고싶은데 안돼
		
		File target = new File("temp", "string2.kh");
		FileWriter fw = new FileWriter(target);
		BufferedWriter bw = new BufferedWriter(fw); //이러면 성능상으로 업구레이드 된거당.
		PrintWriter pw = new PrintWriter(bw); //얘는 reader가 없음. 
		
		pw.println("hello 안녕하세요");
		pw.println("hello!");
		pw.println(100);
		
//		bw.write("hello 안녕하세요");
//		bw.write("hello!");
//		bw.write(100);

		pw.close();
		
		
	}

}
