package ATMInterface;

import java.util.Scanner;

public class ATM {
	 String cardno="1245-7894-5632", password="1234" ;
	 int balance ;
	 int withdraw;
	 int deposit;
	
	public ATM()
	{
	
	}
		
		ATM ( String username ,String password , int balance , int withdraw , int deposit )
		
		{
			username = getCardno();
			password = getPassword();
			balance = getBalance(); 
			withdraw = getWithdraw();
			deposit = getDeposit();
		}
		
		public String getCardno() {
			return cardno;
		}
		public void setCardno(String cardno) {
			this.cardno = cardno;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		public int getWithdraw() {
			return withdraw;
		}
		public void setWithdraw(int withdraw) {
			this.withdraw = withdraw;
		}
		public int getDeposit() {
			return deposit;
		}
		public void setDeposit(int deposit) {
			this.deposit = deposit;
		}
		
		public ATM Enter() {
			
			Scanner s = new Scanner(System.in);
	        System.out.print("Enter cardno:");
	        cardno = s.nextLine();
	        System.out.print("Enter password:");
	        password = s.nextLine();
	        
	        if(cardno.equals("1245-7894-5632") && password.equals("1234"))
	        	
	        {
	            System.out.println("validation Successful");
	           // System.out.println("Select Your Option:");
	            //ATMMenu choice = new ATMMenu();
	            //choice.choice();
	        }
	        else
	        {
	            System.out.println("Validation Failed");
	        	System.out.println("Please Try Again");
	        	return Enter();
	        }
	        return null;
	    }
	
			
		}
		
