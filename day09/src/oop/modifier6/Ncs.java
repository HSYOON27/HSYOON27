package oop.modifier6;

public class Ncs {
	// field
		private String name;
		private String subject;
		private int score;
		private int raterScore;
		
		// setter method - 설정용 메소드 세터 게터 설정 가능 
		void setName(String name) {
			this.name = name;
		}

		void setSubject(String subject) {
			this.subject = subject;
		}

		void setScore(int score) {
			if (score < 0 || score > 100) {
				return;
			}
			
			this.score = score;
		}
		void setRaterScore(int raterScore) {
			if (raterScore< 0 || raterScore >100) {
				return;
			}
			this.raterScore = raterScore;
			}
		

	//getter method - 확인용 , 반환용 매서드. println에 쓰는거

			String getName() {
				return this.name;
			}
			String getSubject() {
				return this.subject;
			}
			int getScore() {
				return this.score;
			}
			int getRaterScore() {
				return this.raterScore;
			}
			
			int getTotal() {
				return this.getScore() + this.getRaterScore();
			}
			
			double getAverage() {
				return this.getTotal()/2.0;
			}
			//constructor
			Ncs(String name, String subject, int score, int raterScore){
				this.setName(name);
				this.setSubject(subject);
				this.setScore(score);
				this.setRaterScore(raterScore);
			}
			//method
			void output() {
				System.out.println("<NCS 평가 정보>");
				System.out.println("이름 : " + 	getName());
				System.out.println("과목 : "+ "" + getSubject());
				System.out.println("서술형 점수 : " + getScore());
				System.out.println("평가자 체크리스트 점수 : " + getRaterScore());
				if(this.getScore()>=40 && this.getRaterScore()>=40 && this.getAverage()>=60)
					System.out.println("통과");
				else System.out.println("재평가");
				
				System.out.println();

			}
}
