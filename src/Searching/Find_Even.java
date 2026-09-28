package Searching;

public class Find_Even {
	public static void main(String args[]) {
		int arr[]= {13,5,78,33,90,23};
		for(int num:arr) {
			if(num%2==0) {
				System.out.println("found even number:"+num);
				return;
			}
			
		}
	     System.out.println("no even number found");
	}

}
