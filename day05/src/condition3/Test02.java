package condition3;
//import java.lang.*;
public class Test02 {
	public static void main(String[] args) {
	
		char key = 'a';
 
		//switch는 검사항목을 적는거임. 그 후 내가 지정한 지점으로 한번에 이동. 
		switch(key) {
		case 'w':
			System.out.println("앞으로 이동");
			break; // 그만 실행하고 나가세요 
		case 'a':
			System.out.println("왼쪽으로 이동");
			break;
		case 's':
			System.out.println("뒤로 이동");
			break;
		default :
			System.out.println("오른쪽으로 이동");
			break;
		}
		}
}
