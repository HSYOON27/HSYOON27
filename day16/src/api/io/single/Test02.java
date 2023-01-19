package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException, InterruptedException {
		//목표 : 싱글 바이트 단위 데이터 입력(열기)
		//준비물 : 파일 객체(없으면 에러뜸. 당연), 스트림 객체(입력용)
		
		File target = new File("temp", "single.kh");
		
		FileInputStream stream = new FileInputStream(target); //뜨로우 해줘야해 이거할땐
		//구조 : [프로그램] <- Stream <- target <- [single.kh] 
		
		//방법 [1] for을 이용하여 파일 크기만큼 반복하면 몇글자인지 알 수 있음.
		//- 사용하지 않음 근데 이 방법은.. 왜? 나중에는 여러 글자를 불러오니까 횟수 계산이 어려움.
		for(int i = 0; i<target.length(); i++) {
		int n = stream.read(); //IOException 최상위 예외 
		System.out.println("n = " + n );
		}
		
		//[2] while을 이용하여 반복하여 읽기 
		//-EOF 값인 -1이 나올때 까지 입력
		while(true) {
			int n = stream.read();
			if(n == -1) break;
			System.out.println("n = " + n);
			Thread.sleep(500);
			//-1은 EOF 를 의미 End Of File 의 약어
		}
		//다 쓴 통로는 정리
		stream.close();
		
		
		

	}

}
