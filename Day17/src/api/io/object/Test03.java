package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		List<String> database = new ArrayList<>();
		
		while(true) {
			System.out.println("단어를 입력하세여.");
		String word = sc.nextLine();
		if(word.equals("종료")) {
			System.out.println("시스템을 종료합니다");
			break;}
		{
		database.add(word);
		}
		}
		sc.close();
		
		File target = new File("temp", "input.kh");
		FileOutputStream stream = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(stream);
		ObjectOutputStream mixer = new ObjectOutputStream(buffer);
		
		mixer.writeObject(database);
		
		mixer.close();
		
	}


	}

//사용자가 "종료" 라고 입력하기 전까지 입력한 단어를 List에 저장하여 input.kh에 저장 