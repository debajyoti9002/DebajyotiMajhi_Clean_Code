package com.epam.Clean_Code;
import java.util.Scanner;
import java.lang.Math;
public class Logic {
	
	//Input method for Simple & Compound Interest called from App Class
    public static double input(int x)
    {
    	Scanner sc= new Scanner(System.in);
    	double amount=0d;
    	
    	System.out.format("%s","\nEnter Principle Balance: ");
		double principle = sc.nextDouble();
    
		System.out.format("%s","Enter Annual Interest Rate (in percentage): ");
		double rate = sc.nextDouble();
		rate/=100;
		
		System.out.format("%s","Enter Time Period (in year) : ");
		double time = sc.nextDouble();
		switch(x)
    	{
    		case 1:
    			amount=SI(principle,rate,time);
    			break;
    		case 2:
    			System.out.format("%s","Enter number of times interest applied (per Time Period) : ");
    			double n = sc.nextDouble();
    			amount=CI(principle,rate,n,time);
    	}
		sc.close();
        return(amount);
    }
    
	public static double SI(double p, double r, double t)
    {
		return(p*r*t ); //Calculating Simple Interest
	}
	
    public static double CI(double p, double r, double n, double t)
    {
    	return ( p * Math.pow( (1+(r/n)), n*t) )-p; //Calculating Compound Interest
    }
    
    public static int costOfConstruction()
    {
    	Scanner s= new Scanner(System.in);
    	System.out.format("\nCost List of Home (in per square feet):\n" +
    			          "1.Standard Materials: 12,000 INR\n" +
   						  "2.Above Standard Materials: 15,000 INR\n" +
   				          "3.High Standard Materials: 18,000 INR\n" +
   						  "4.High Standard Materials & Fully Automated: 25,000\n" +
   				          "Enter Your Choice: ");    		
    	int x = s.nextInt();
    	if(x>4 || x<1)
    	{
    		System.out.format("\nWrong Choice! \n" );
    		System.out.format("THE END \n");
    		System.exit(0);
    	}
    	System.out.format("Enter the required area (in square feet): " );   
    	int area = s.nextInt();
    	int price[] = {12000,15000,18000,25000};
    	int cost= area * price[x-1];
    	s.close();
    	return cost;
    }
    
}

