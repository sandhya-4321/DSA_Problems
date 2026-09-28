package Searching;
import java.util.Arrays;

public class Sorted_array_find_element {
	public static void main(String args[]) {
		int arr[]= {3,2,5,1,4,8,7,9,6};
		Arrays.sort(arr);
		int target=6;
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				found=true;
			}
			if(arr[i]>target) {
				break;
			}
		}
		System.out.println(found?"found element":"not found");
		
	}

}
