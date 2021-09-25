package BMS;

import java.util.Scanner;
import java.util.*; 
import java.util.Random;
public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scanner= new Scanner(System.in); 
	    char opt='\0';
	    String newacc= "45673AB";
	    int unum=' ';
	    int ubal=' ';
	    int accnum = ' ';
	    String pin = null;
	    String pin1 = null;
    	accnum = bankaccount.generateRandomDigits();
    	pin = bankaccount.getAlphaNumericString();
    	String uname = null;
    	String uadd = null;
    	String accounttype = null;
    	do {
	    System.out.println("------------------------------------------------------------------");
	    System.out.println("WELCOME TO BANK");
	    System.out.println("------------------------------------------------------------------");
	    System.out.println("Choose an Option ");
	    System.out.println("A.Creat an account");
	    System.out.println("B. Delete an account");
	    System.out.println("C.Deposit Money");
	    System.out.println("D.withdraw Money");
	    System.out.println("E.Transfer Ammount");
	    System.out.println("F.Login To Your Account ");
	    System.out.println("G.Print statement");
	    System.out.println("H.Saving Account Operations");
	    System.out.println("I.Checking Account Operations");
	    System.out.println("J.Quit");
	    System.out.println("------------------------------------------------------------------");
	    System.out.println("Select from A to E");
	    System.out.println("------------------------------------------------------------------");
	    opt= scanner.next().charAt(0);
	    
	    if (opt == 'A') {
	        System.out.println("You want to creat a new account.");
	        System.out.println("Enter Your Name");
        	uname = scanner.next();
        	System.out.println("Enter Your Number");
        	unum = scanner.nextInt();
        	System.out.println("Enter Your Adress");
        	uadd = scanner.next();
        	System.out.println("What kind of account you want to open");
	        System.out.println("1.Saving Account");
	        System.out.println("2.Checking Account");
	        opt= scanner.next().charAt(0);
	        if(opt == '1') { 
	        	accounttype = "Saving";
	        	System.out.println("Congradulations!!!! Saving Account Created");
	        	System.out.println("Your Account Number is: " + accnum );
	        	System.out.println("Your Account Pin is: " + pin);
	        	System.out.println("Enter Your Intial Balance");
	        	ubal = scanner.nextInt();
	        }
	        if(opt == '2') { 
	        	accounttype = "Checking";
	        	System.out.println("Congradulations!!!! Checking Account Created");
	        	System.out.println("Your Account Number is: " + accnum );
	        	System.out.println("Your Account Pin is: " + pin);
	        	System.out.println("Enter Your Intial Balance");
	        	ubal = scanner.nextInt();
	        }
	    }
	     if (opt == 'B') {
	        System.out.println("You want to delete a account.");
	        System.out.println("Please Enter the following information to procced");
	        System.out.println("Enter your account number");
	        int accnum1 = scanner.nextInt();
	        
	        if(accnum1 == accnum ) {
	        	System.out.println("MATCHED");
	        
	        System.out.println("Enter Your Pin ");
        	pin1 = scanner.next();
	        }
        	else if(pin1 == pin) {
	        	System.out.println("Deleted");
	        }
	        else if(accnum1 != accnum ){
	        	System.out.println("Account Not Found"); 
	        }
	        else if (pin1 != pin){
	    	   System.out.println("Invalid Pin");
	        }
	    }
	   
	      if (opt == 'C') {
	    	System.out.println("You selected the option to deposit money  in your account.");
	    	System.out.println("Enter Your Account Number");
	    	int accnum1 = scanner.nextInt();
	        if(accnum1 == accnum ) {
	        	System.out.println("MATCHED");
		        int ammountdep = bankaccount.deposit();
		    	System.out.println("Ammount deposited " +ammountdep );
		    	ubal= ubal + ammountdep;
		    	System.out.println("Your new balance is " +ubal);
	        }
	        else {
	        	System.out.println("Wrong");
	        }
	    }
	     if (opt == 'D') {
	    	System.out.println("You selected the option to withdraw money  in your account.");
	    	System.out.println("Enter Your Account Number");
	    	int accnum1 = scanner.nextInt();
	    	if(accnum1 != accnum) {
    			System.out.println("Account does not exist");
    		}
	    	else if(accnum1 == accnum ) {
	        	System.out.println("MATCHED");
	        	if(accounttype == "Checking")
	        		{
	        		int ammountwdraw = bankaccount.withdraw(); 
	        		if(ammountwdraw >= ubal) {
	        		System.out.println("Sorry you can not withdraw ");
	        		}
	        		else if (ammountwdraw < ubal) {
	        			System.out.println("Ammount withdrawn " +ammountwdraw );
	        			ubal= ubal- ammountwdraw;
	        			System.out.println("Your new balance is " +ubal);
	        		}
	        }
	    	if(accounttype == "Saving")
    		{
	    		int ammountwdraw = bankaccount.withdraw();
	    		System.out.println("Ammount withdrawn  " + ubal);
	    		ubal= ubal- ammountwdraw;
    			System.out.println("Your new balance is " +ubal);
    			}
	    	}
	     }
	    if (opt == 'E') { 
	    	System.out.println("You selected the option to transfer money from your account.");
	    	System.out.println("Please Enter your accountnumber.");
	    	int accnum1 = scanner.nextInt();
	        if(accnum1 == accnum ) {
	        	System.out.println("MATCHED");
	        	int ammounttrans = bankaccount.transfer(); 
	        	if (ammounttrans < ubal) {
	        		System.out.println("Ammount transferred " +ammounttrans );
		        	 ubal = ubal- ammounttrans;
		        	System.out.println("Your new balance after transfereing money is " +ubal);
	        	}
	        	if(ammounttrans <= ubal) {
	        		System.out.println("Can not Transfer");
	        	}
	        	}
	        else if(accnum1 != accnum) { 
	        	System.out.println("Wrong Account Number");
	        }
	    }
	        
	    if (opt == 'F') {
	        System.out.println("You have selected to login.");
	        System.out.println("Please Enter the following information to procced");
	        System.out.println("Enter your account number");
	        int accnum1 = scanner.nextInt();
	        if(accnum1 == accnum ) {
	        	System.out.println("MATCHED");
	        	System.out.println("Enter Your Pin ");
	        	pin1 = scanner.next();
	        	if(pin1 == pin ) {
	        		System.out.println("Information matched./n ");
	        		System.out.println("You are logged in./n ");
	        	}
	        	else if(pin1 != pin) {
	        		System.out.println("Wrong Password");
	        	}
	        }
	        else if (accnum1 != accnum) {
	        	System.out.println("Wrong Information");
	        }
	        
	        	}
	    if (opt == 'G') {
	    	System.out.println("You have selected to print statement.");
	    	System.out.println("Please Enter the following information to procced");
	        System.out.println("Enter your account number");
	        int accnum1 = scanner.nextInt();
	        if(accnum1 == accnum ) {
	        	System.out.println("MATCHED ");
	        	System.out.println("Printing Statement");
	        	System.out.println("Account Holder Name: " + uname);
	        	System.out.println("Account Holder Phone Number:" + unum);
	        	System.out.println("Account Holder Address: " + uadd);
	        	System.out.println("Account Initial Balance: " + ubal);
	        	System.out.println("Account Type:" + accounttype);
	        	System.out.println("Balance After Tansactions: " + ubal);
	        	
	    }
	   }
	    if (opt == 'H') {
	    	System.out.println("You have selected to print statement.");
	    	System.out.println("Please Enter the following information to procced");
	        System.out.println("Enter your account number");
	        int accnum1 = scanner.nextInt();
	        if(accnum1 == accnum ) {
	        	System.out.println("MATCHED ");
	        }
	        else if (accnum1 != accnum) {
	        	System.out.println("Wrong Account Number");
	        }
	        if (accounttype == "Checking") {
	        	System.out.println("Zakat and Interest does not Apply");
	        }
	        if (accounttype =="Saving") {
	        	System.out.println("If you want to calculate Zakat press '1'.");
	        	System.out.println("If you want to calculate Interest press '2'.");
	        	opt= scanner.next().charAt(0);	
	        switch (opt) {	
	        case '1' :{
	        		System.out.println("Proceeding with zakat calculations");
	        		if(ubal > 20000) {
	        			saving.calculatezakat(ubal);
	        		}
	        		else if (ubal<= 20000) {
	        			System.out.println("Zakat not applicable");
	        		}
	        	}
	        	    break;
	       case '2':{
	        		System.out.println("Proceeding with interest calculations");
	        		System.out.println("Enter the interest rate.");
	    			double intrate = scanner.nextDouble();
	        		saving.calculateinterest(ubal, intrate);
	        		}
	       break;
	        	}
	        	}	        	
	    }   	

    	}
	    while(opt != 'J');
	    }	
}
	