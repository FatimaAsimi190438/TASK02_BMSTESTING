package BMS;

import java.util.Random;
import java.util.Scanner;

class bankaccount{

	public static int generateRandomDigits() {
	    int m = (int) Math.pow(10, 5 - 1);
	    return m + new Random().nextInt(9 * m);
	}
	static String getAlphaNumericString()
    {   int lowerLimit = 97;
        int upperLimit = 122;
        Random random = new Random();
        StringBuffer r = new StringBuffer(10);
        for (int i = 0; i < 10; i++) {
            int nextRandomChar = lowerLimit
                                 + (int)(random.nextFloat()
                                         * (upperLimit - lowerLimit + 1));
            r.append((char)nextRandomChar);
        }
        return r.toString();
    }  
		public static int deposit() {
		Scanner sc= new Scanner(System.in);	
		System.out.println("Please Enter your following information to proceed.");
		System.out.println("Please Enter ammount you want to deposite.");
		int ammount =sc.nextInt();		
		return ammount;
	}

		public static int withdraw() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter your following information to proceed.");
		System.out.println("Please Enter ammount you want to withdraw.");
		int ammount =sc.nextInt();		
		return ammount;
		}
		public static int transfer() {
			Scanner sc= new Scanner(System.in);
			System.out.println("Please Enter your following information to proceed.");
			System.out.println("Please enter ammount you want to transer.");
			int ammount =sc.nextInt();		
			return ammount;
	}
}