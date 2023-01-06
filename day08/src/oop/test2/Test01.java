package oop.test2;

public class Test01 {
	public static void main(String[] args) {

		//객체 생성
		Scorer a1 = new Scorer();
        Scorer a2 = new Scorer();
        Scorer a3 = new Scorer();
        Scorer a4 = new Scorer();
		
        //정보 초기화
        a1.rank = 1;
        a1.name = "킬리안 음바페";
        a1.nation = "프랑스";
        a1.goal = 8;
        
        a2.rank = 2;
        a2.name = "리오넬 메시";
        a2.nation = "아르헨티나";
        a2.goal = 7;
        
        a3.rank = 3;
        a3.name = "올리비에 지루";
        a3.nation = "프랑스";
        a3.goal = 4;
        
        a4.rank = 4;
        a4.name = "훌리안 알바레스";
        a4.nation = "아르헨티나";
        a4.goal = 4;
        
        //정보 출력
        
        System.out.println(a1.rank);
        System.out.println(a1.name);
        System.out.println(a1.nation);
        System.out.println(a1.goal);
        
        System.out.println(a2.rank);
        System.out.println(a2.name);
        System.out.println(a2.nation);
        System.out.println(a2.goal);
        
        System.out.println(a3.rank);
        System.out.println(a3.name);
        System.out.println(a3.nation);
        System.out.println(a3.goal);
        
        System.out.println(a4.rank);
        
        System.out.println(a4.name);
        System.out.println(a4.nation);
        System.out.println(a4.goal);



	}
}
