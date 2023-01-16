package api.util.scanner;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		//목표 : 단어 형태와 줄 단위 입력을 같이 사용하려면?
		//.next() 계열 사용 후 .nextLine() 메소드를 부르면 입력이 안됨
		//- 사이에 .nextLine()을 1회 더 추가하면 해결됨.
		//이유 - 구분하는 기호가 다르기 땜시룽
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int a = sc.nextInt();//50\n
		
		System.out.println("단어 입력 : ");
		String b = sc.next();//hello\n
		
		//이전 입력에서 남긴 쑤레기를 제거해야함.
		sc.nextLine(); //아래 nextLine이 문제가 됐던걸 얘가 문제가 되게끔해서 진행 하게함. 
		
		System.out.print("문장 입력 : ");
		String c = sc.nextLine();
		//next 뒤에 nextLine이 올때만 문제임.
		
		sc.close();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

				

	}

}
