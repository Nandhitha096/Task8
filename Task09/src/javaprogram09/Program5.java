package javaprogram09;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		
		System.out.println("***Anna University Grading System***");
		System.out.println();
		System.out.println("Enter the name of the Student : ");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		String st= sc.nextLine();
		System.out.println("Enter the mark scored by the student");
		Scanner sc1=new Scanner(System.in);
		int marks=sc1.nextInt();
		System.out.println();
		
        if(marks == 100)
        {
        	System.out.println("The Grade of the student "+st +" is " +'S');
        }
        else if(marks>=90 && marks<=99)
        {
        	System.out.println("The Grade of the student "+st +" is " +'A');
        }
        else if(marks >=80 && marks <=89)
        {
        	System.out.println("The Grade of the student "+st +" is " +'B');
        }
        else if(marks>=70 && marks<=79)
        {
        	System.out.println("The Grade of the student "+st +" is " +'C');
        }
        else if(marks>=60 && marks<=69)
        {
        	System.out.println("The Grade of the student "+st +" is " +'D');
        }
        else if(marks>=50 && marks<=59)
        {
        	System.out.println("The Grade of the student "+st +" is " +'E');
        }
        else if(marks<50 && marks>0)
        {
        	System.out.println("The Grade of the student "+st +" is " +'F');
        }
        else
        {
        	System.out.println("Invalid Input");
        }
	}

}
