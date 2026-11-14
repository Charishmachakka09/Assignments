package weeklyassignments;
class BankAccount
{
	String accountHolder;
	double balance;
	BankAccount(String accountHolder,double balance)
	{
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	void withdraw(double amount) throws Exception
	{
		 System.out.println("Withdrawl Amount:"+amount);
	      if(amount>balance)
	    	  throw new Exception("Insufficient Balance!");
	      else
	      {
	    	  double remainingBalance=balance-amount;
	    	  System.out.println("Remaining Balance:"+remainingBalance);
	      }
	}
}
public class Program_BankAccountWithdrawl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         BankAccount ba=new BankAccount("Rahul",10000);
         System.out.println("Account Holder:"+ba.accountHolder);
         System.out.println("Current Balance:"+ba.balance);
         try {
        	 ba.withdraw(3000);
         }
         catch(Exception ex)
         {
        	 System.out.println(ex.getMessage());
         }
         finally
         {
        	 System.out.println("Transaction Process Completed");
         }
	}

}
