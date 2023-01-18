package api.io.file;

import java.io.File;

public class Test02 {
	public static void main(String[] args) {
		//디렉터리 분석
		//- 자바는 파일과 디렉터리의 생성 방법이 같다.(물론 사용법은 다름)
		
		File dir = new File("temp");
		
		if(!dir.isDirectory()) {
			System.err.println("디렉터리가 아닙니다.");
			System.exit(-1); // -1은 이상한데 
		}

		//디렉터리(폴더) 자체는 크기가 없다(내용물의 크기만 있을 뿐)
		System.out.println(dir.length());
		
		//디렉터리에서 의미가 있는 건 뭘까?
		//- 안에 무엇이 있냐가 중요한거지 얜. 그니까 이와 관련된 명령이 존재함.
		//- .listFiles()를 이용하면 내부에 들어있는 파일의 목록을 반환함. 
		
		File[] files = dir.listFiles();
		System.out.println("파일 개수는 : " + files.length);

		for(File file : files) {
			System.out.println(file.getPath()); //상대경로 
			//System.out.println(file.getAbsolutePath()); 절대경로 
		}
		
	}

}
