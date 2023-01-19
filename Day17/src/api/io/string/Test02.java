package api.io.string;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException{
		//문자열을 편법으로 바이트 변환 후 출력
		
		String text = "hello 안녕하세요";
		
		File target = new File("temp", "string.kh");
		FileOutputStream stream = new FileOutputStream(target);
		
		byte[] b = text.getBytes();
		
		stream.write(b);
		stream.close();
		//근데 왜 내가 맨날 직접 byte로 변환을 해야하나?
		//stream을 써서 그래 
		//결론적으로 이렇게 안한다. 
	}

}
