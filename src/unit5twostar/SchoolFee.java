package unit5twostar;

public class SchoolFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double schoolFee = 10000;
        for(int i=0;i<10;i++)
        	schoolFee*=(1+0.05);
        double tenYearFee = schoolFee;
        double sum = 0;
        for(int i=0;i<4;i++)
        {
        	sum+=schoolFee;
        	schoolFee*=(1+0.05);
        }
        System.out.printf("SchoolFee after 10 years is %.2f\n",tenYearFee);
        System.out.printf("The total cost of 4 years after 10 is %.2f\n",sum);
	}

}
