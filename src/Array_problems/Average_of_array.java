package Array_problems;

public class Average_of_array {
	public static void main(String args[]) {
		int arr[]= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		int avg=sum/arr.length;
		System.out.println("Average of given array:"+avg);
	}

}


