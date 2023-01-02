package input;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
    	System.out.println("국어 점수를 입력하세요");
        int k = sc.nextInt();
    	System.out.println("영어 점수를 입력하세요");
        int e = sc.nextInt();
    	System.out.println("수학 점수를 입력하세요");
        int m = sc.nextInt();

        sc.close();
        
        int total = k+e+m;
        double average = (double)total/3;
        //boolean pass = k >= 40 && e >= 40 && m>= 40 && average >= 60;
        //if
        if(k>=40 && e>=40 && m>=40 && k+e+m>=180) 
        {System.out.println("총점은 "+ total +"점 "+"평균은 "+average+"점 입니다. "+"합격 입니다.");}
        else 
        {System.out.println("총점은 "+ total +"점 "+"평균은 "+average+"점 입니다. "+"불합격 입니다.");}
	}}
//사용자에게 국 영 수 점수를 입력 받고 총점과 평균 합격여부를 계산하여 출력
// 합격이란 각 과목이 40점 이상이고, 평균이 60점 이상인 경우를 말합니다.