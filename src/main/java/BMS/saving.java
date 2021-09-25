package BMS;

import java.util.Scanner;

public class saving {
		public static  double calculatezakat(int n)
		{
			double zakat;
			zakat= n * 2.5;
			zakat= zakat/100;
			System.out.println("Applicable zakat is Rs." +zakat);
			return zakat;		
		}	
		public static double calculateinterest(int n, double m)
		{
			Scanner scanner= new Scanner(System.in);
			double interest = 0.0;
			//double intrate= 0.0;
			//System.out.println("Enter the interest rate.");
			//intrate = scanner.nextDouble();
			interest = (n * m)/100;
			System.out.println("Your Interest is Rs." + interest);
			return interest;
		}
}