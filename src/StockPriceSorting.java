
import java.util.*;
import java.lang.*;
import java.io.*;

public class StockPriceSorting
{
    public static void asc(double[] a1)
    {
        int n = a1.length;        
        double[] temp = new double[n];
        for(int i=0;i<n;i++)
        {
            temp[i] = a1[i];
        }        
        Arrays.sort(temp);
        System.out.println("Stock prices in ascending order are:");
        for(int i=0;i<n;i++)
            System.out.print(Double.toString(temp[i]) + " ");        
    }
    
    public static void desc(double[] a2)
    {
        int n = a2.length;        
        double[] temp = new double[n];
        for(int i=0;i<n;i++)
        {
            temp[i] = a2[i];
        }
        Arrays.sort(temp);
        System.out.println("Stock prices in descending order are :");
        for(int i=n-1;i>=0;i--)
            System.out.print(Double.toString(temp[i]) + " ");
    }
    
    public static void sharesrose(boolean[] a3)
    {
        int numofshares = 0;   
        for(int i=0;i<a3.length;i++)
        {
            if(a3[i] == true)
            	numofshares++;
        }        
        System.out.println("Total no of companies whose stock price rose today : " + numofshares);
    }
    
    public static void declinedShares(boolean[] a4)
    {
        int numofshares = 0;        
        for(int i=0;i<a4.length;i++)
        {
            if(a4[i] == false)
            	numofshares++;
        }        
        System.out.println("Total no of companies whose stock price declined today : " + numofshares);
    }
    
    public static boolean search(double[] a5, double x)
    {
       for(int i=0;i<a5.length;i++)
        {
            if(a5[i] == x)
                return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of companies");
        int n = sc.nextInt();        
        double[] companies = new double[n];        
        boolean[] shares = new boolean[n];
        int option = -1;       
 
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter current stock price of the company " + Integer.toString(i+1));
            companies[i] = sc.nextDouble();
            System.out.println("Whether the company's stock price rose today compared to yesterday?");
            shares[i] = sc.nextBoolean();
        }
        System.out.println("Enter the operation that you want to perform.");
        System.out.println("1. Display the companies stock prices in ascending order");
        System.out.println("2. Display the companies stock prices in descending order");
        System.out.println("3. Display the total no of companies for which stock prices rose today");
        System.out.println("4. Display the total no of companies for which stock prices declined today");
        System.out.println("5. Search a specific stock price");
        System.out.println("6. press 0 to exit");
        
        while(option!=0)
        {
            option = sc.nextInt();
            if(option == 1)
            {
                asc(companies);
            }
            else if(option == 2)
            {
                desc(companies);
            }
            else if(option == 3)
            {
            	sharesrose(shares);
            }
            else if(option == 4)
            {
            	declinedShares(shares);
            }
            else if(option == 5)
            {
                System.out.println("Enter the key value");
                double key = sc.nextDouble();
                boolean result = search(companies,key);
                if(result == true)
                {
                    System.out.println("Stock value of " + Double.toString(key) + " is present.");
                }
                else{
                    System.out.println("Key not found");
                }
            }
        }
        System.out.println("Exited successfully");
    }
}
