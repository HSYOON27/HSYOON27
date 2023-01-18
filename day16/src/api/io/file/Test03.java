package api.io.file;

import java.io.File;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("파일이나 디렉토리 명을 입력하세요.");
		String some = sc.nextLine();
		
		File dir = new File(some);
		File[] files = dir.listFiles();
		sc.close();

		if(dir.isFile()) {
			System.out.println(dir.getName());
			System.out.println(dir.length());
		}
		
		else if(dir.isDirectory()){
			System.out.println(files);
			
		}
		else if(!dir.exists()){
			System.out.println("대상이 존재하지 않습니다.");
		}

	}

}
