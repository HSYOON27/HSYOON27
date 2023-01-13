package api.lang.etc;

import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {
		//Runtime 클래스(외부환경과 소통이 가능하게 만들어주는 클래스)
		//- 생성자 없음(아예 생성이 불가/미리 생성해두었거나 대행해주는 경우). 런타임은 후자 
		//- 왜 이런짓을 할까? 
		//- 생성이든 렌탈이든 부탁을해서 얻어와야 하는 상황
		//- 왜? 만들 때 반드시 지켜야 하는 규칙이 있는 경우가 있기 땜시.
		//- 반드시 생성 메소드가 static으로 존재한다.(getInstance.. 으로 되어있음 보통)
		
		//Runtime r = new Runtime(); //생성자 없으니까 안되지?? 얘는 직접생성이니 불가능해
		   
		   
		Runtime r = Runtime.getRuntime(); //생성의뢰임 얘는 그니까 가능
		String os = System.getProperty("os.name");
		if(os.startsWith("Windows")) {
			r.exec("notepad");
		}
		else if(os.startsWith("Mac")) {
		r.exec("open -a TestEdit.app");
		} //else가 아니지 윈도우가 아니라고 mac이 아니니까 
		
		//r.exec("calc");
		//r.exec("mspaint");
		//r.exec("cmd /c start https://www.google.com");
		
		
	}

}
