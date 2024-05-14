package javaprogram09;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		// Largest among three numbers
		
		int a,b,c;
		int largest;
		
		System.out.println("Enter the First number : ");
		Scanner sc1=new Scanner(System.in);
		a=sc1.nextInt();
		
		System.out.println();
		
		System.out.println("Enter the Second number : ");
		Scanner sc2=new Scanner(System.in);
		b=sc2.nextInt();
		
		System.out.println();
		
		System.out.println("Enter the Third number : ");
		Scanner sc3=new Scanner(System.in);
		c=sc3.nextInt();
		
		System.out.println();
		
		if(a>b && a>c)
		{
			
				System.out.println("The Greatest among three numbers = " +a);
		}
		else if(b>a && b>c)
		{
			
				System.out.println("The Greatest among three numbers = " +b);
		}
		else
		{
			System.out.println("The Greatest among three numbers = " +c);
		}
		

	}

}
