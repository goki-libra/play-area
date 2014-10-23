package misc;

import java.util.Arrays;
import java.util.List;

public class LargestSubarray {
	
	public static void main(String args[]){
		List<Integer> val =  Arrays.asList(4, -3, 5, 3, 7, -8, 9, -3);
		
		int start = 0, end = 0, max = val.get(0);
		int s = 0, e = 0, m = 0;
		
		for (int i = 0; i < val.size(); i++){
			m = m + val.get(i);
			e = i;
			if (m > max){
				start = s;
				end = e;
				max = m;
			}
			else if (m < 0){
				s = i + 1;
				e = i + 1;
				m = 0;
			}
		}
		
		System.out.println(start + "  "+ end + " " + max);
	}

}
