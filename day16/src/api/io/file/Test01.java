package api.io.file;

import java.io.File;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
	public static void main(String[] args) {
		//파일 제어
		//- Java에서는 파일 및 디렉터리 모두를 File 클래스로 제어함. 
		
		//파일 제어할 대상 파일의 객체를 생성한것임. 지금한게 
		File a = new File("temp/hello.txt");
		File b = new File("temp", "hello.txt");
		
		System.out.println("성공!");
		
		//파일 분석
		System.out.println(a.exists()); //존재하는애임?
		System.out.println(b.exists());
		
		System.out.println(a.isFile()); //파일인가?
        System.out.println(a.isDirectory()); //디렉토리인가? 
		
		System.out.println(a.length());//파일 크기(=들어있는 글자의 byte수)
		System.out.println(a.getName());//파일명
		System.out.println(a.getPath());//파일위치(상대경로) 
		System.out.println(a.getAbsolutePath());//파일위치(절대경로)
		
		//상대경로와 절대경로
		//- 상대경로는 특정 지점을 기준으로 계산한 경우 (ex : 우리 옆집. 내 앞자리)
		//- 장점 : 서로 다른 환경이어도 같은걸 가르킬 수 있음. 
		//  ./는 현재 경로를 의미. 생략이 가능. 있으나 마나
		//  ../는 현재 경로의 상위 경로를 의미한다. 생략 불가
		
		//- 절대경로는 모든 상황에서 동일한 경우를 말함. (ex : 서울시 영등포구 선유로길 59)
		//- 단점 : 길어
		
		System.out.println(a.canRead()); //읽기가 가능한가? 를 물어보는거
		System.out.println(a.canWrite()); //쓰기가 가능한가? 
		System.out.println(a.isHidden()); //파일이 숨겨져있는가?
		
		System.out.println(a.lastModified()); //마지막 수정시간
		
		Date d = new Date(a.lastModified());
		Format f = new SimpleDateFormat("y년 M월 d일 H시 m분 s초");
		//데이트 클래스 소환해서 데이트 나온다 -> Format f 나온다.
		
		System.out.println(f.format(d));
		
	}

}
