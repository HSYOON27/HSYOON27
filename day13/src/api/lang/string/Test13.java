package api.lang.string;

public class Test13 {
	public static void main(String[] args) {
		//목표 : 기본자료형(원시형)과 문자열 사이의 변환 
		
		//- 100을 "100"으로 만들 수 있는가?? 반대는 가능한가? 이런걸 물어보는거다 
		//- 통신(입출력)에서는 int(4byte)나 double(8byte) 같은 데이터는 전송이 불가능하다. 왱? 
		//- 네트워크에서는 기본 전송단위가 패킷(packet)인데 크기가 1byte라서 잘라 보내야함. 
		//- 문자열로 변환하여 전송하고 수신하여 되돌리는 경우가 비일비재함.
		
		//그걸 지금한번 살펴보장
		
		//원시형을 String으로 변환 
		int a = 100;
		//String b = a;
		String b = "" + a; //편법 : 문자열 + 데이터는 = 문자열이 되어버림;; 하지만 권장하진 않음.
		String c = String.valueOf(a); // 정공법 : 문자열에서 제공하는 메소드 사용 

		
		String d = "200";
		//int e = d; 이건 당연히 안돼 
		int e = Integer.parseInt(d);
		
	}

}
