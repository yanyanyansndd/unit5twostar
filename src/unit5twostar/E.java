package unit5twostar;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=10000;i<=100000;i+=10000) {
        	double e = 1.0;
        	double item = 1.0;
        	for(int j=1;j<=i;j++) {
        		item = item/j;
        		e +=item;
        	}
        	System.out.printf("i=%d, e=%f\n",i,e);
        }
	}

}
