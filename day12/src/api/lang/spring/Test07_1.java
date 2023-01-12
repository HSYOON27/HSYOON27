package api.lang.spring;

public class Test07_1 {
	public static void main(String[] args) {

		String name = "피카츄";
		
		
		//계산 해야 하는 것 = 총 글자 수, 한글 글자 수 
		int total = name.length();
		int korean = 0;
		
		for(int i=0; i<total; i++) {
			char ch = name.charAt(i);
			if(ch >= '가' && ch<= '힣') {
				korean++;
			}
		}
		System.out.println("한글 : " + korean+ "글자, 총 " +total+"글자");

}

}
