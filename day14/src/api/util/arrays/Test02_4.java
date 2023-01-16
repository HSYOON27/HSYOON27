package api.util.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Test02_4 {

	public static void main(String[] args) {
		
				
				Integer[] data = new Integer[] {30, 50, 20, 10, 40};
				
				Arrays.sort(data, (o1, o2)->o2-o1);//우측에 정의된 기준에 따라 정렬
				
				System.out.println(Arrays.toString(data));
			}
		}





