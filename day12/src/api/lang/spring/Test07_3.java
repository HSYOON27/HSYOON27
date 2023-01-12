package api.lang.spring;

public class Test07_3 {
	public static void main(String[] args) {

		String name = "피카츄";
		
		
		//계산 해야 하는 것 = 총 글자 수, 한글 글자 수 
		int total = name.length();
		if(total>=2 && total<=7) {
		int korean = 0;
		for(int i=0; i<total; i++) {
			char ch = name.charAt(i); //글자 하나씩 처리 할때 명령어
			if(ch >= '가' && ch<= '힣') {
				korean++;
			}
		}
		if(korean == total) {//모든 글자가 한글이라면
			System.out.println("이름 설정이 완료되었습니다.");
		}
		else {
			System.out.println("한글 2~7글자로 작성하세요.");
		}
		//System.out.println("한글 : " + korean+ "글자, 총 " +total+"글자");
}
		else {
			System.out.println("한글 2~7글자로 작성하세요.");
			
		}
	}
}

