package javaprogram09;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		
		//pattern program
		
		int i;
		int j;
		int n;
		
		System.out.println("Enter the input : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int num=1;
		
		System.out.println();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(num+ " ");
				num++;
			}
			System.out.println();
		}
	}

}
