package javaprogram09;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		
		int month;
		float rent;
		float sum;
		int days;
		float tariff;
		
		System.out.println("    Hotel tariff     ");
		System.out.println();
		
		System.out.println("Enter the month of stay : ");
		Scanner sc=new Scanner(System.in);
		month=sc.nextInt();
		
		System.out.println();
		
		System.out.println("Enter the room rent per day : ");
		Scanner sc1= new Scanner(System.in);
		rent=(float) sc1.nextDouble();
		
		System.out.println();
		
		System.out.println("Enter the number of days stayed in Hotel : ");
		Scanner sc2=new Scanner(System.in);
		days= sc2.nextInt();
		
		switch(month)
		{
		case 1:
			tariff = rent*days;
			System.out.println("The total Hotel Tariff for January month is : "); 
			//System.out.format("%2f", tariff);
			break;
			
		case 2:
			tariff = rent*days;
			System.out.println("The total Hotel Tariff for February month is "+ tariff);
			//System.out.format("%2f", tariff);
			break;
		case 3:
			tariff = rent*days;
			System.out.println("The total Hotel Tariff for March month is "+ tariff);
			//System.out.format("%2f", tariff);
			break;
		case 4:
			sum = (rent*20)/100;
			tariff = (rent*days)+sum; 
			System.out.println("The total Hotel Tariff for April month is "+ tariff);
			//System.out.format("%2f", tariff);
			break;
		case 5:
			sum = (rent*20)/100;
			tariff = (rent*days)+sum;                                                                                                                      
			System.out.println("The total Hotel Tariff for May month is "+ tariff);
			//System.out.format("%2f", tariff);
			break;
		case 6:
			sum = (rent*20)/100;
			tariff = (rent*days)+sum; 
			System.out.println("The total Hotel Tariff for june month is "+ tariff);
			//System.out.format("%2f", tariff);
			break;
		case 7:
			tariff = rent*days;
			System.out.println("The total Hotel Tariff for July month is "+ tariff);
			//System.out.format("%2f", tariff);
			break;
		
		case 8:
			tariff = rent*days;
			System.out.println("The total Hotel Tariff for August month is "+ tariff);
			//System.out.format("%2f", tariff);
			break;
		case 9:
			tariff = rent*days;
			System.out.println("The total Hotel Tariff for September month is "+ tariff);
			//System.out.format("%2f", tariff);
			break;
		case 10:
			tariff = rent*days;
			System.out.println("The total Hotel Tariff for October month is "+ tariff);
			//System.out.format("%2f", tariff);
			break;
		case 11:
			sum = (rent*20)/100;
			tariff = (rent*days)+sum; 
			System.out.println("The total Hotel Tariff for November month is "+ tariff);
			//System.out.format("%2f", tariff);
			break;
		case 12:
			sum = (rent*20)/100;
			tariff = (rent*days)+sum; 
			System.out.println("The total Hotel Tariff for December month is "+ tariff);
			//System.out.format("%2f", tariff);
			break;
		default :
			
			System.out.println("Invalid input");
			break;
		
		}

	}
}