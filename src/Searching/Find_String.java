package Searching;

public class Find_String {
	public static void main(String args[]) {
		String names[]= {"banu","bali","deva","sena"};
		String target="sena";
		boolean found=false;
		for(String str:names) {
			if(str.equals(target)) {
				found=true;
				break;
			}
		}
		System.out.println(found?"present":"not found");
	}

}
