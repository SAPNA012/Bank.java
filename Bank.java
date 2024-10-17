package basicJava.org.com;
/*
 * 1. Create a Bank class and declare an instance variable named amount of type double.Create parameterized constructor to initialize variable “amount” 
 *  with value 10000.Create two methods withdraw(double withdrawalAmount) and deposit(double depositAmount).
 *  Calculate withdrawal based on some condition (using ternary operator) like If amount is sufficient then “withdraw successful” 
 *  message will be printed on the console and amount should be updated after withdraw. Later on, deposit 5000 in the account balance.
 *  At the end display total balance on the console.
* */


public class Bank {
	
	 
          double amount;// declare an instance variable
          
          
	    public Bank(double amount){//Parameterized constructor
			
	    	this.amount=amount; //'this' use to point current  
			
		}
	    public void withdraw(double withdrawalAmount) {
	    	String message; 
	    	
	    	message=(withdrawalAmount<=amount) ?"withdraw successful"  :  "Insufficient Balance"; //using ternary operator check the withdrawal is possible
	    	System.out.println(message);
	    	
	    	amount=(withdrawalAmount<=amount)?(amount-withdrawalAmount):amount;//update balance after withdrawing successful!!!
	    	
	    }
	    public void deposit(double depositAmount) {
		
		amount+=depositAmount;// amount=amount+depositAmount; deposit the amount and update balance
		System.out.println("Amount Deposited:"+depositAmount);
		
        }
	    //method to Display total balance
	    public void DisplayBalance() {
	    	System.out.println("Total Balance is :"+amount);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank=new Bank(10000);//Creating bank object for Bank Class with parameter 10000
		
		bank.withdraw(3000);//withdraw amount with 3000 TOTAL BALANCE=10000-3000=7000
		
		bank.deposit(5000);//update amount with 5000 TOTAL BALANCE=7000+5000
		
		bank.DisplayBalance();// it display total balance=7000+5000=12000
}
}






