package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_1 {
	public static void main(String[] args) throws IOException{
		
		//파일 복붙하기 대상 : temp/copy.kh
		//준비물 : 파일 2개, 스트림 2개(입력,출력)
		File origin = new File("temp", "single.kh");
		File target = new File("temp", "copy.kh");
		
		FileInputStream in = new FileInputStream(origin);
		FileOutputStream out = new FileOutputStream(target);
	
        //현재 구조 [single.kh]->in->[프로그램]->out->[copy.kh]		
		//1글자 복사라는건 = 1글자 입력 + 1글자 출력. 이걸 반복문 조지면 전체가 복사되겠지? -1이 나올때 까지 
		while(true) {
		int n = in.read(); //반환형이 int라 int쓰는거야. 외워라 이건 
		out.write(n);
		if(n==-1)break;
		}
		//이 방식은 속도가 너무느림.. 파일이 작을때만 쓸 수 있음.. 왜 느릴까? 한개씩 옮기니까.
		//사용 스트림 정리
		in.close();
		out.close();
}
}
