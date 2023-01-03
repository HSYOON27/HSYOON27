package condition3;
//import java.lang.*;
public class Test01 {
	public static void main(String[] args) {
	//목표 : if문의 문제점과 해결책 
		
		char key = 'a'; // char은 '' 따옴표 한개 짜리만 쓴다.
		
		if(key == 'w') {
			System.out.println("앞으로 이동");
			}
		else if(key == 'a') {
			System.out.println("왼쪽으로 이동");
			}
		else if(key == 's') {
			System.out.println("뒤로 이동");
			}
		else {
			System.out.println("오른쪽으로 이동");
		}
	}
}
// if문의 단점이 나옴. 즉 순서대로 계속 물어봄 해당 정답이 나올때까지. w 1번, a 2번, s는 3번 d도,3번 물어봄
// 즉 각각의 상황이 동일한 속도로 실행되지 않음.