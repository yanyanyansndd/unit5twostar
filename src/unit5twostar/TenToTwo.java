package unit5twostar;

import java.util.Scanner;

public class TenToTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        String result = "";
        while(num!=0) {
        	result = num % 2 + result;
        	num = num /2;
        }
        System.out.println(result);
	}

}
