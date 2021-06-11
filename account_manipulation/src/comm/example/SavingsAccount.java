package comm.example;

@SuppressWarnings("rawtypes")
public class SavingsAccount extends Account{
    private double minimumBalance;
    public SavingsAccount(int accountNumber,comm.example.app.Customer c,double balance, double MinimumBalance)
    {
     super(accountNumber,c,balance);
     minimumBalance=MinimumBalance;
    }
   
    public double getMinimumBalance() {
    return minimumBalance;
  }
  public void setMinimumBalance(double minimumBalance) {
    this.minimumBalance = minimumBalance;
  }
   @SuppressWarnings("unchecked")
public boolean withdraw(double amount)
   {
       if((balance-amount)>minimumBalance)
       {
           balance=(balance-amount);
           return true;
       }
       else
       return false;
   }
    
}