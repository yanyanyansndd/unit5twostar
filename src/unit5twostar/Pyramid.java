package unit5twostar;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter the number of lines: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for(int i=1;i<=number;i++)
        {
        	for(int j=1;j<=number-i;j++)
        		System.out.print("  ");
        	for(int j=i;j>1;j--)
        		System.out.print(j+" ");
        	for(int j=1;j<=i;j++)
        		System.out.print(j+" ");
        	System.out.print("\n");
        }
	}

}
