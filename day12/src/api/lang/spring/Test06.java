package api.lang.spring;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {

		String[] filter = new String[] {
				"신발","수박","십장생","변신","주옥","시베리아","개나리", "잣"
		};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String line = sc.nextLine();
		
		sc.close();
		
		
		for(int i=0; i < filter.length; i++) {
			int size = filter[i].length();
			String star = "*".repeat(size);
			line = line.replace(filter[i], star);
		}
		
		System.out.println("출력 : " + line);
		
//      나의 오답 
//		String a = "신발";
//		String b = "수박";
//		String c = "십장생";
//		String d = "변신";
//		String e = "주옥";
//		String f = "시베리아";
//		String g = "개나리";
//		String h = "잣";
//
//		if (line.equals(a)) {
//			System.out.println(line.replace(a, "**"));
//		} else if (line.equals(b)) {
//			System.out.println(line.replace(b, "**"));
//		} else if (line.equals(c)) {
//			System.out.println(line.replace(c, "***"));
//		} else if (line.equals(d)) {
//			System.out.println(line.replace(d, "**"));
//		} else if (line.equals(e)) {
//			System.out.println(line.replace(e, "**"));
//		} else if (line.equals(f)) {
//			System.out.println(line.replace(f, "****"));
//		} else if (line.equals(g)) {
//			System.out.println(line.replace(g, "**"));
//		} else if (line.equals(h)) {
//			System.out.println(line.replace(h, "**"));
//		}

	}
}
