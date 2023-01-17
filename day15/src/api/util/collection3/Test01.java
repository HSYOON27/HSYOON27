package api.util.collection3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test01 {

	public static void main(String[] args) {
	   //Queue Vs Stack
       //- 사용법이 정해져 있는 Collection
       //- Queue는 FIFO(First-In-First-Out) 형태의 저장소
	   //- Stack은 LIFO(Last-In-First-Out) 형태의 저장소이다. 고리던지기 장난감.
		
	   Stack<Integer> stack = new Stack<>();
	   stack.push(10); //10번글 읽음 Stack은 add-> push
	   stack.push(12); //12번글 읽음
	   stack.push(17);
	   stack.push(20);
	   stack.push(25);
	   
	   // System.out.println(stack.peek()); //가장 최신 데이터 확인 마지막에 읽은걸 부르는 명령어.데이터 변화를 안주는
	   System.out.println(stack.pop()); // 가장 최신 데이터 확인 + 삭제
	   System.out.println(stack.pop());
	   System.out.println(stack.pop());
	   System.out.println(stack.pop());
	   System.out.println(stack.pop());
	   
	   System.out.println("-----------------");
	   
	   Queue<Integer> queue = new LinkedList<>();
	   
	   queue.add(10); //맨뒤에 10 줄세우기
	   queue.add(12); //맨뒤에 12 줄세우기
	   queue.add(17);
	   queue.add(20);
	   queue.add(25);
	   
	   System.out.println(queue.peek()); //stack이랑 반대죠? 확인만 하는 명령어
	   System.out.println(queue.poll()); //queue는 poll로 추출 
	   System.out.println(queue.poll());
	   System.out.println(queue.poll());
	   System.out.println(queue.poll());
	   System.out.println(queue.poll());
	   System.out.println(queue.poll());

	   //직접 구현보다 개념을 이해하는게 중요 Queue 는 FIFO(선입선출), Stack은 LIFO(후입선출) 
	}

}
