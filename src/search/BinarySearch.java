package search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println("Hello World- from Gokul's IAir");
		List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8);
		binarySearch(list, 7);
	}
	
	public static void binarySearch(List<Integer> integers, int search){
		int size = integers.size();
		int min = 0; int max = size-1;
		while (true){
			if (integers.get(min + size/2) == search){
				System.out.println("Item found at location: " + size/2);
				break;
			}
			else if (integers.get(min + size/2) > search){
				System.out.println("Item found  is :" + integers.get(size/2));
				max = size/2;
				size = max - min;
			}
			else {
				System.out.println("Item found is :" + integers.get(size/2));
				min = size/2;
				size = max - min;
			}
		}
	}
	
}
