// WAP to check Armstrong Number

import java.util.Scanner;
public class Armstrong
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Put a Number  ");
	
	        int a=sc.nextInt(); 
		int r;
		int sum=0;
		int temp=a;  

		for (;a>0 ; ) 
		{
			r=a%10;  
			sum=sum +(r*r*r);
			a=a/10;
		}
		if(temp==sum)  
		{
			System.out.println("The given no "+temp+"  is an armstorng");  
		}
		else{
			System.out.println("The given no "+temp+"  is not an armstorng"); 
		}
	}
}
