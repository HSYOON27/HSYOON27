package api.io.multi;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException{
		//멀티 바이트 출력에 대해 배워봅시다.
		//준비물 : 파일 객체(없으면 생김), 출력 스트림, +분해 스트림, +버퍼 스트림 

		File target = new File("temp", "multi.kh");
		FileOutputStream stream = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(stream, 20); //자르는애
		DataOutputStream mixer = new DataOutputStream(buffer); //모으는애 
		
		//[프로그램] -> mixer -> buffer -> stream -> target -> [multi.kh] 이런 구조임.
		mixer.writeBoolean(false); //boolean 형식으로 분해해서 출력이란 뜻.
		mixer.writeByte(100); //byte 형식으로 분해해서 출력
		mixer.writeInt(100); //int 형식으로 분해해서 출력
		mixer.writeChar(100); //char 형식으로 분해해서 출력
		mixer.writeLong(100L); //long 형식으로 분해해서 출력
		mixer.writeFloat(100f); //float 형식으로 분해해서 출력
		mixer.writeDouble(100d); //double 형식으로 분해해서 출력
		
		//총 합계 28byte, 버퍼 크기는 기본 8192byte 
		//버퍼는 가득 차야 전송이 된다. 
		//만약 프로그램 종료 등 여러 이유로 버퍼가 가득 차지 않아도 전송하려면,
		//강제 전송 명령을 사용해야 한다.
		//mixer.flush(); // 강제 전송 명령 
		mixer.close(); //flush 수행 후 종료. 앞으로 더 쓸 수 있는 경우에 flush, 아예 안쓸거다 close 
		//ex) 카톡 메시지 보내는게 flush 정도 
	}
}
