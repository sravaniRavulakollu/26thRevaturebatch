package eg1;

import java.util.Scanner;

public class FirstLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			int k=arr[i].length();
			if(k==1) {
				System.out.print(arr[i]+" ");
				continue;
			}
			String s1=arr[i];
			if(s1.charAt(0)==(s1.charAt(k-1))) {
				System.out.print(s1+" ");
				
			}
		}
		
		
	}

}