package api.io.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("불러올 파일명 입력하세여 : ");
		String fileName = sc.nextLine();
		
		//문자열 입력 
		File target = new File("temp",fileName);
		FileReader fr = new FileReader(target);
		BufferedReader br = new BufferedReader(fr);
//		StringBuffer buffer = new StringBuffer();
//		
		
		while(true) {
			String line = br.readLine();
			if(line == null) break;
		
//			buffer.append(fileName);
//			buffer.append("\n");
			
			System.out.println("작성 내용 : " + line);
		}
		sc.close();
		br.close();
		   
//		System.out.println(buffer.toString()); //이렇게도 된다 알아둬 
	}

	
}
//'note.kh'에 작성된 모든 내용을 읽어서 화면에 출력 