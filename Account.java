package pro1;
/*
	 * Problem 2. 
	Banking Operations relate a class with customer private instance 
	variables as accountNumber,accountName,accountBalance and 
	create methods as
	1. create account => accnumber,accname,accbal
	2. setAmount=> add amount to accbal
	3. getAmount=>print accbal and name account
	4. withDrawAmount()=to withdraw amount from accBalance
	create a main class to use customer and create atleast two 
	customers
	*/
	//Problem 2
	public class Account {

		private String accountName;
		private double accountBalance;
		
		public void createAccount(int accontnumber,String accname,double accbal) {
			this.accountName=accname;
			this.accountBalance=accbal;
		}
		public void setAmount(double amount) { //setAmount=> add amount to account balance
			accountBalance += amount;
		}
		public double getAmount() {  //getAmount=>print account balance and name account
			return accountBalance;
		}
		public double withDrawAmount(double amount){ //withDrawAmount()=to withdraw amount from accBalance
			accountBalance -= amount;
			return amount;
		}
		
		public static void main(String[] args) {
			Account a1= new Account();  //object 1
			Account a2= new Account();  //object 2
			a1.createAccount(10000,"elina",1000);
			a2.createAccount(90000,"abinash",9000);
			
			a1.setAmount(200);
			System.out.println("Customer name : "+a1.accountName);
			System.out.println("Account Balance : rs "+a1.getAmount());
			
			System.out.println("                               ");
			a2.setAmount(300);
			System.out.println("Customer name : "+a2.accountName);
			System.out.println("Account Balance : rs "+a2.getAmount());
		}
	}