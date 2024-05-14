package javaprogram09;

import java.util.Scanner;
import java.io.Serializable;
import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		
		//Palindrome
		
		String str=new String();
		String str1=new String();
		int len;
		
		System.out.println("Enter the string : ");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		System.out.println();
		System.out.println("The entered string is : "+str);
		len=str.length();
		System.out.println();
		for(int i=len-1;i>=0;i--)
		{
			char c= str.charAt(i);
			str1=str1+c;
		}
		
		//System.out.println(str1);
		if(str.equalsIgnoreCase(str1))
		{
			System.out.println("The given string is a Palindrome");
		}
		else
		{
			System.out.println("The given string is NOT a Palindrome");
		}
		
		
		
	  /* 
	   * StringBuilder str1= new StringBuilder();
	    str1.append(str);
		str1=str1.reverse();
		System.out.println("The reversed string is : "+str1);
		System.out.println();
		
		//checking palindrome
		
		System.out.println(str.equals(str1)); //true
		if(str.equals(str1))
		{
		  System.out.println("The entered string is a Palindrome");
		  
		}
		else
		{
			System.out.println("The entered string is NOT a palindrome");
		}		
		
		len=str.length();
		System.out.println("Length of the given string : "+len);
	    while(i>0)
		{
			strrev[i]=str[len-1];
			i--;
		}
	*/
					
	}

}
