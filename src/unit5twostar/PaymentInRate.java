package unit5twostar;

import java.util.Scanner;

public class PaymentInRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Loan Amount: ");
        double amount = input.nextDouble();
        System.out.println("Number of Years: ");
        int years = input.nextInt();
        System.out.println("Interest Rate     Monthly Payment     Total Payment\n");
        for(int i=0;i<25;i++) {
        	double rate = (0.125*i+5)/1200;
        	double monthPay = amount*rate/(1-1/Math.pow(1+rate, years * 12));
        	System.out.printf("%-4.3f%%            %-5.2f              %-7.2f\n",0.125*i+5,monthPay,monthPay*12*years);
        }
	}

}
