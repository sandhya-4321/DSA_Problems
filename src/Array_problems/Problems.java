package Array_problems;
import java.util.Scanner;

public class Problems {

	public static void main(String[] args) {
		int arr[];//declaration
		System.out.println("array is declared");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];//initialization
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
		int b[]= {1,2,3,4,5};//direct initialization
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		int c[]= {1,2,3,4,5};//index input
			System.out.println(c[0]);
			System.out.println(c[1]);
			System.out.println(c[2]);
			System.out.println(c[3]);
			System.out.println(c[4]);
			
	   int d[]= {1,2,3,4,5};//array traverse
	   for(int i=0;i<b.length;i++) {
	System.out.println("Index:"+i+" value:"+d[i]);
			}
			
			
			
	
		
		
		

	}

}
