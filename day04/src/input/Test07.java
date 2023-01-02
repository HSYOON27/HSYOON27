package input;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("이름을 입력하세요");
    String name = sc.next();
	
    System.out.println("인원수를 입력하세요");
    int people = sc.nextInt();
	
    System.out.println("예상기간(일)을 입력하세요");
    int day = sc.nextInt();
	
    System.out.println("여행갈 년도를 입력하세요");
    int year = sc.nextInt();
	
    System.out.println("여행갈 월을 입력하세요");
    int month = sc.nextInt();

    sc.close();
    
	int price = 100000;
	int sale = 0;
	int leapsale = 5;
	int totalsale;
	
	boolean leap = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0); 

	
	if (month>=3 && month<=5){sale = 10;
	}
    else if 
	(month>=6 && month<=8) {sale = 5;
    }
	else if 
		(month>=9 && month<=11) {sale = 30;
	}
	else if 
		(month>=12 && month<=2) {sale = 20;
	} 
	if(leap) {
		totalsale = sale+leapsale;
	System.out.println("윤년 할인 5%가 적용됩니다.");
	

	int salePrice = price - (price * (100 - sale) / 100);
	int totalPrice = people * day * salePrice;
	int normalPrice = people * day * price;
	
	    System.out.println("여행 예정 : "+year+ "년" + month + "월 입니다.");	
	    System.out.println("여행 인원수 : "+people+ "명 입니다.");	
	    System.out.println("여행 인원기간은 : "+day+ "일 입니다.");	
	    System.out.println("계절 할인은 = "+people + "명 입니다.");	
	    System.out.println("여행 인원수는 = "+people + "명 입니다.");	
		System.out.println("계절 할인 " + sale + "%가 적용됩니다.");
		System.out.println("총 견적 비용은 " + normalPrice + " 원 입니다.");
		System.out.println("총 할인 비용은 " + salePrice + " 원 입니다.");
		System.out.println("총 비용은 " + totalPrice + " 원 입니다.");
		System.out.println("버튼을 눌러 예약 사이트로 이동해주세요.");

	}
	}}
