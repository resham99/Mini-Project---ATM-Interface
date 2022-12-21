package ATMInterface;

import java.util.Scanner;

public class ATMMenu extends ATM {
	
	public void choice() {
	Scanner sc = new Scanner(System.in);
			
	System.out.println("Welcome to ATM\n");  
    System.out.println("Insert Your ATM Card in the ATM Machine\n");
    //System.out.println("Enter Passwors:\n");
    
    while(true)  
    {  
    	ATM atm = new ATM();
    	atm.Enter();
        System.out.println("Choose 1 for Withdraw:");  
        System.out.println("Choose 2 for Deposit:");  
        System.out.println("Choose 3 for Check Balance:");  
        System.out.println("Choose 4 for EXIT");  
        System.out.print("Choose the operation you want to perform:");  
          
        //get choice from user  
         
        int choice = sc.nextInt();  
        switch(choice)  
        { 
        
        case 1:  
	        System.out.print("Enter money to be withdrawn:");  
	                      
	        //get the withdrawl money from user  
	        withdraw = sc.nextInt();  
	                      
	        //check whether the balance is greater than or equal to the withdrawal amount  
	        if(balance >= withdraw)  
	        {  
	            //remove the withdrawl amount from the total balance  
	            balance = balance - withdraw;  
	            System.out.println("Transaction successful Please collect your money");  
	        }  
	        else  
	        {  
	            //show custom error message   
	            System.out.println("Insufficient Balance");  
	        }  
	        System.out.println("");  
	        break;

        case 2:  
            
	        System.out.print("Enter money to be deposited:");  
	                      
	        //get deposite amount from the user  
	        deposit = sc.nextInt();  
	                      
	        //add the deposit amount to the total balanace  
	        balance = balance + deposit;  
	        System.out.println("Your Money has been successfully depsited");  
	        System.out.println("");  
	        break;  
	   
	       case 3:  
	        //displaying the total balance of the user  
	        System.out.println("Balance : "+balance);  
	        System.out.println("");  
	        break; 
	        
	        case 4:  
	    		        //exit from the menu  
	    		        System.exit(0);  
	    		            }  
	    		        }


	 		    }  
	    		 
}












