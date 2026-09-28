package Array_problems;

public class Insert_Elementat_particular_pos {
	public static void main(String args[]) {
	int arr[]= {10,20,30,40};
	int pos=2;
	int value=25;
	
	//creating new array with extra length
	int newarr[]=new int[arr.length+1];
	
	//inserting values upto position
	for(int i=0;i<pos;i++) {
		newarr[i]=arr[i];
		
	}
	//inserting at specific position
	newarr[pos]=value;
	
	//remaining values insert into new array
	for(int i=pos;i<arr.length;i++) {
		newarr[i+1]=arr[i];
	}
	
	//print all elements in new array
	for(int i=0;i<newarr.length;i++) {
		System.out.println(newarr[i]+" ");
	}
	

}
}
