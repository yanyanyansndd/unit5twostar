package unit5twostar;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double sumQ = 0;
        System.out.print("Enter 10 numbers: ");
        for(int i=0;i<10;i++) {
        	double tmp = input.nextDouble();
        	sum+=tmp;
        	sumQ += tmp*tmp;
        }
        double mean = sum/10.0;
        double sd = Math.sqrt((sumQ-sum*sum/10.0)/9.0);
        System.out.println("The mean is "+mean);
        System.out.println("The standard deviation is "+sd);
	}

}
