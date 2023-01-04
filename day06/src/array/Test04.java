package array;

public class Test04 {

	public static void main(String[] args) {
		
		int[] data = new int[] {
				90, 85, 51, 63, 77, 71, 77, 85, 99, 70
		};
		int total = 0;
		int count = 0;
		
		//1. 모든 학생의 점수
		for (int i = 0; i < data.length; i++) {
			System.out.println("1. 모든 학생의 점수 : " + data[i] + "점");
		}
		//2. 모든 학생의 평균 점수
		for (int i = 0; i < data.length; i++) {
			total += data[i];			
		}
		System.out.println("2. 모든 학생의 평균 점수는 " + (double)total/data.length);
		
		//3. 재평가자(60점 미만)의 인원수
		for (int i = 0; i< data.length; i++) {
			if(data[i]<60) {
			count++; 
			}
		}
		System.out.println("3. 재평가자의 인원수는 "+count+"명 입니다.");
		
		//4. 성적 우수자의 인원수를 출력
		count=0;
		for (int i = 0; i< data.length; i++) {
			if(data[i]>=90) {
				count++;
			}
		}
		System.out.println("4. 성적 우수자의 인원수는 "+count+"명 입니다.");
		
		//5. 만약 이 반에 들어온 학생이 80점 이면 몇등인지 계산하여 출력 
		count=0;
		for (int i = 0; i< data.length; i++) {
			if(data[i]>80) {				
				count++;
			}
		}
		System.out.println("5. 80점인 학생의 등수는 "+(count+1)+"등 입니다.");
	}
}
//Test04(과제) 어떤 반 학생 10명의 성적 정보는 다음과 같다. 
//- 점수 : [90, 85, 51, 63, 77, 71, 77, 85, 99, 70]
//요구사항을 지켜 프로그래밍 하세요
//1. 모든 학생의 점수를 출력
//2. 모든 학생의 평균 점수를 출력
//3. 재평가자(60점 미만) 인원수를 출력
//4. 성적 우수자(90점 이상) 인원수를 출력
//5. 만약 이 반에 들어온 학생이 80점이면 몇등인지 계산하여 출력