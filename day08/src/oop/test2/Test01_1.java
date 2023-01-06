
package oop.test2;

public class Test01_1 {
	public static void main(String[] args) {

		Scorer a1 = new Scorer();

		a1.goal = 8;
		a1.name = "킬리안 음바페";
		a1.nation = "프랑스";
		a1.rank = 1;

		System.out.print(a1.rank);
		System.out.print("위 ");
		System.out.print(a1.name);
		System.out.print(" ");
		System.out.print(a1.nation);
		System.out.print(" ");
		System.out.print(a1.goal);
		System.out.print("골 ");

		Scorer a2 = new Scorer();

		a2.goal = 7;
		a2.name = "리오넬 메시";
		a2.nation = "아르헨티나";
		a2.rank = 2;

		System.out.println();
		System.out.print(a2.rank);
		System.out.print("위 ");
		System.out.print(a2.name);
		System.out.print(" ");
		System.out.print(a2.nation);
		System.out.print(" ");
		System.out.print(a2.goal);
		System.out.print("골 ");
		
		Scorer a3 = new Scorer();

		a3.goal = 4;
		a3.name = "올리비에 지루";
		a3.nation = "프랑스";
		a3.rank = 3;

		System.out.println();
		System.out.print(a3.rank);
		System.out.print("위 ");
		System.out.print(a3.name);
		System.out.print(" ");
		System.out.print(a3.nation);
		System.out.print(" ");
		System.out.print(a3.goal);
		System.out.print("골 ");
		
		Scorer a4 = new Scorer();

		a4.goal = 4;
		a4.name = "훌리안 알바레즈";
		a4.nation = "아르헨티나";
		a4.rank = 4;

		System.out.println();
		System.out.print(a4.rank);
		System.out.print("위 ");
		System.out.print(a4.name);
		System.out.print(" ");
		System.out.print(a4.nation);
		System.out.print(" ");
		System.out.print(a4.goal);
		System.out.print("골 ");


	}
}
