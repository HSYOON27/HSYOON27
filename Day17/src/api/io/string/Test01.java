package api.io.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//문자열과 바이트간의 변환이 가능한가? 
		//.getBytes()로 문자열을 바이트 배열로 변환 가능 
		
		String str = "hello 안녕하세요";
		
		byte[] b1 = str.getBytes(/*"UTF-8"*/); //이렇게하면 변환이 됩니다. UTF-8이 기본값임. 설정해놓은
		System.out.println("b1 = "+ Arrays.toString(b1));

		byte[] b2 = str.getBytes("MS949");
		System.out.println("b2 = " +Arrays.toString(b2));
		
		//다시 복구 -> 바이트 배열을 문자 배열로 만들려면 String 클래스의 생성자를 사용 
		String s1 = new String(b1);
		System.out.println("s1 = " + s1);
		
		String s2 = new String(b2, "MS949");
		System.out.println("s2 = " + s2);
		
	}

}
