package api.io.single;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException
	{
		//목표 : 싱글 바이트 단위 데이터 출력(저장)
		//준비물 : 파일 객체(없으면 생김), 스트림 객체(통로) 출력용이 필요함.  
		
		//도구 준비 
		File target = new File("temp", "single.kh"); //확장자는 운영체제가 필요로 하는거지 우리가 필요로하는게 아님.
		FileOutputStream stream = new FileOutputStream(target);
		
		//현재 구조 : [프로그램]-> [stream] ->[target] -> [single.kh]
		stream.write(104);//h
		stream.write(101);//e
		stream.write(108);//l
		stream.write(108);//l
		stream.write(111);//o  ascii임 얘네는 
		stream.write(32); //space
		
		stream.write('j');
		stream.write('a');
		stream.write('v');
		stream.write('a');
		stream.write(10); // \n 엔터 

		stream.write(30000); // '0' 3만을 넣으면 -> (48) 넘어가면 뒤집힌다. byte30000 스트림엔 무적권 바이트만
		
		byte[] b = new byte[] {'H','E','L','L','O'};
		//배열은 내보내는 방법이 2가지가 있다. 다 내보내는 방법과 쪼금만 내보내는 방법!
		stream.write(b); //FIFO Queue 구조 
		stream.write(b, 0, 4); //b 배열을 0번부터 4개 내보내라.
		
		//입출력 통로는 반드시 close()가 필요
		stream.close();
		

	}

}
