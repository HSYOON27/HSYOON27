package oop.modifier2;

public class Record {
	
	//field
	private String name;
	private int korean;
	private int english;
	private int math;
	
//	private int total = 0;
//	private double average;
	
	// setter method - 설정용 메소드
		void setName(String name) {
			this.name=name;
		}
		
		void setKorean(int korean) {
			if(korean < 0 || korean > 100) {
				return;//그만하세요
		}
			this.korean = korean;

		}
		void setEnglish(int english) {
			if(english < 0 || english > 100) {
				return;
			}
			this.english=english;
		}
		void setMath(int math) {
			if(math < 0 || math > 100) {
				return;
							}
			this.math=math;

		}
//		void setTotal() {
//			this.total=this.korean+this.math+this.english;
//		}
//		void setAverage(double average) {
//			this.average=this.total/3.0;
//		}
		// getter method - 확인용 , 반환용 매서드. println에 쓰는거
		
		String getName() {
			return this.name;
		}
		int getKorean() {
			return this.korean;
		}
		int getEnglish() {
			return this.english;
		}
		int getMath() {
			return this.math;
		}
		
		int getTotal() {
			return this.getKorean() + this.getEnglish() + this.getMath();
		}
		
		double getAverage() {
			return this.getTotal()/3.0;
		}
//		int getTotal() {
//			return this.total;
//		}
//		double getAverage() {
//			return this.average;
//		}
		
		// constructor
		//- 생성자에서도 설정시 setter 메소드를 사용하도록 한다. 
		
		//가상의 Getter 매소드를 만들어 개발을 편하게 한다
		//-> total 이라는 필드는 없지만 total을 계산해서 반환하는 getTotal()을 만든다.
		
		Record(String name, int korean, int english, int math){
			this.setName(name);
			this.setKorean(korean);
			this.setEnglish(english);
			this.setMath(math);
//			this.setTotal();
//			this.setAverage();
		
		}
		void output() {
			System.out.println("<학생 성적 정보>");
			System.out.println("이름 : " + 	getName());
			System.out.println("국어 성적 " + getKorean());
			System.out.println("영어 성적 " + getEnglish());
			System.out.println("수학 성적 " + getMath());
			System.out.println("총점 : " + this.getTotal() + "점");
			System.out.println("평균 : " + this.getAverage()+"점");
		
//          총점과 평균이 필요한 애들은 필드 세터 게터에 넣을 필요가 없음. 결과에서 넣으면 돼 			
//			System.out.println("총점 " + getTotal());
//			System.out.println("평균 " + getAverage());

		}
	}


