package javaprogram09;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter the Input : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		 for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n; j++) {
	                if (i % 2 == 0 && j % 2 == 0) {
	                    System.out.print("*");
	                } else if (i % 2 == 1 && (j == 1 || j == n)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }

	}

