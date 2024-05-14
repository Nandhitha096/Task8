package javaprogram09;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		String str=new String();
		String str1="";
		
		System.out.println("Enter the String to be reversed : ");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		System.out.println();
		
		System.out.println("The string is : " +str);
		int len=str.length();
		
		System.out.println();
		for(int i=len-1;i>=0;i--)
		{
			char c= str.charAt(i);
			str1=str1+c;
		}
        
		System.out.println("The reversed string is " +str1);
	}

}
