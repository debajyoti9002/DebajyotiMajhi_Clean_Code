package com.epam.Clean_Code;

import java.util.Scanner;
public class App 
{
    
    public static void main( String[] args )
    {
    	Scanner scanner= new Scanner(System.in);
    	System.out.format("1.Calculate Simple Interest.\n" +
    					  "2.Calculate Compound Interest.\n" +
   						  "3.Calculate House Construction Cost.\n" +
   					  	  "Enter Your Choice: ");
   		int choice = scanner.nextInt();
   		switch(choice)
   		{
   			case 1:
   				System.out.format("\nAmount after Simple Interest is %.2f\n", Logic.input(choice));
   				break;
   			case 2: 
   				System.out.format("\nAmount after Compound Interest is %.2f\n", Logic.input(choice));
    			break;
    		case 3:
    			System.out.format("Your total cost will be INR " + Logic.costOfConstruction() +"\n\n" );
   				break;
    		default:
   				System.out.format("\nPlease enter correct choice! \n");
   		}
    	scanner.close();
    	System.out.format("Program Ended..... \n");
    }
}

