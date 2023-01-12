package api.lang.object;

public class Test03 {
	public static void main(String[] args) {
		//객체 비교
		//- 객체에서 비교연산(==)은 동일한 객체인지를 물어보는 것이다.
	    //- 특수한 경우가 아니라면 .equals()를 사용하도록 권장한다. 개조를하든 어떻게 하든 그게 앞에서한 해쉬코드 만진거	
		
		Student a = new Student("피카츄", 60);
		Student b = new Student("피카츄", 60);
        Student c = new Student("피카츄", 80);
        Student d = new Student("꼬부기", 80);
        
		System.out.println(a == b); // a랑 b랑 가리키는 대상이 같나요? (동일) //얘는 리모콘끼리의 비교 같을수가 없음 int double 같은거는 1차원적이니 이걸로 물어볼 수 있음. 
		System.out.println(a.equals(b)); // a랑 b랑 같아요? (동등) 

		//(Q) a와 b는 같은 학생인가요? 
	}

}
