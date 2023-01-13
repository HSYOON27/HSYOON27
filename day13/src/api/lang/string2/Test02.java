package api.lang.string2;

public class Test02 {
	public static void main(String[] args) {
		//StringBuffer 사용
		//-thread-safe 처리(동기화 처리)가 되어 있기 때문에, 비교적 느리다. 빌더보다.. 
		//-사용자가 동시다발적으로 접근할 수 있는 환경일 경우 추천 ex) 웹 홈피 만들땐 무적권 얘 
		
		StringBuffer buffer = new StringBuffer();
				
		long start = System.currentTimeMillis();
		
		
		for(int i=0; i<100000000; i++) {
			//star += "★"; 얘를 아래처럼 바꾼거 
			buffer.append("★");
		}
		
		long finish = System.currentTimeMillis();
		
		System.out.println(finish-start);
		
		System.out.println(buffer.toString());
	}

}
