package api.io.file;

import java.io.File;
import java.util.Scanner;

public class Test03_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		String input = sc.nextLine();
		sc.close();
		
		File target = new File(input);
		
		if(!target.exists()) {
			System.out.println("존재하지 않는 파일 또는 폴더입니다.");
		}
		else if(target.isFile()) {
			System.out.println("<파일 정보>");
			System.out.println("이름 : " + target.getName());
			System.out.println("크기 : " + target.length());
		}
		else {
			System.out.println("<디렉터리 정보>");
			System.out.println("이름 : " + target.getName());
			File[] files = target.listFiles(); //디렉터리일때만 사용 가능한 명령어임 외우자 .
			System.out.println("파일은 총 : " + files.length + "개 입니다.");
			for(File file : files) {
				System.out.println(file.getName());
				System.out.print("  ");
				if(file.isFile()) {
					System.out.println("[파일]");
				}
				else if(file.isDirectory()) {
					System.out.println("[폴더]");
				}
			}
		}
	}
}
