package arr;

import java.util.Scanner;

public class Class {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int sum=0;
		int sum1=0;
		int arr[][]=new int[n][m];
        for(int i=0;i<arr.length;i++)
        {
         for(int j=0;j<arr[i].length;j++)
           {
               System.out.println("enter value of index["+i+"] ["+j+"]");
	           arr[i][j]=sc.nextInt();
        
        	if(i==j)
        	{
        		sum=sum+arr[i][j];
        		System.out.println(sum);
        	}
        	else {
        		sum1=sum1+arr[i][j];
        		System.out.println(sum1);
        	}
        }System.out.println();
       
	}

}
}
