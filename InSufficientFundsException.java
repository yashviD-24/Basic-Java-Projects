//Example of User Defined Exception
//Checked Exception
//Throw and Throws
class InSuffientFundsException extends Exception{
   public InSuffientFundsException(String msg){
      super(msg);
   }
}
class Account{
    double balance;
    public Account(){
       balance=0;
    }
    public void Deposit(double Amount){
      balance=balance+Amount;
      System.out.println(Amount+"is deposit into account and balance is:"+balance);
    }
    public void Withdraw(double Amount)throws InSuffientFundsException{
      if(balance>Amount){
        balance=balance-Amount;
        System.out.println(Amount+"is withdraw from account and balance is:"+balance);
      }
      else{ 
        throw new InSuffientFundsException("Suffient balance is not there");
      }
	}
}
class Application{
	public static void main(String args[]){
		Account ac=new Account();
		ac.Deposit(25000);
		try{
			ac.Withdraw(20000);
            ac.Withdraw(4000);
            ac.Withdraw(2000);
		}
		catch(InSuffientFundsException e){
			System.out.println(e.getMessage());
		}
	}
}