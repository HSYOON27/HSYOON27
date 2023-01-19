package api.io.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		List<String> database = new ArrayList<>();
		
		System.out.println("생성할 파일명을 입력하세요.");
		String fileName = sc.nextLine();
		
		//문자열 출력 
		while(true) {
			System.out.println("문자열을 입력하세여.");
			String word = sc.nextLine();
			if(word.equals("종료")) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			database.add(word);
		}
		
		File target = new File("temp",fileName); 
		FileWriter fw = new FileWriter(target); //자동으로 byte로 변환해서 쏴주는 역할 stream 역할
		BufferedWriter bw = new BufferedWriter(fw); // 버퍼역할. 안써도 되긴함. 근데 내장 버퍼써야댐
		PrintWriter pw = new PrintWriter(bw); 
		
		pw.println(database);
		pw.flush(); //이러면 입력하자마자 들어감. 
		
		pw.close();
		sc.close();

	}

}
//사용자에게 문자열을 지속적으로 입력받아 'note.kh' 파일에 문자열 출력 
//'종료' 입력하면 끝나게 