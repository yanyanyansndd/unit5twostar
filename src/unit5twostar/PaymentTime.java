package unit5twostar;

import java.util.Scanner;

public class PaymentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Loan Amount: ");
        double amount = input.nextDouble();
        System.out.println("Numbers of Years: ");
        int years = input.nextInt();
        System.out.println("Annual Interest Rate: ");
        double annualRate = input.nextDouble();
        System.out.print("\n");
        
        double monthRate = annualRate/1200;
        double monthPay = amount*monthRate/(1-1/(Math.pow(1+monthRate, years*12)));
        double total = monthPay*years*12;
        System.out.printf("Monthly Payment: %.2f\n",monthPay);
        System.out.printf("Total Payment: %.2f\n",total);
        System.out.println("Payment#         Interest       Principal       Balance");
        double balance = amount;
        double interest = 0.0;
        double principal = 0.0;
        for(int i=1;i<=years*12;i++) {
        	interest = monthRate*balance;
        	principal = monthPay-interest;
        	balance = balance-principal;
        	System.out.printf("%d\t\t %.2f\t\t%.2f\t\t%.2f\n",i,interest,principal,balance);
        }
	}

}
