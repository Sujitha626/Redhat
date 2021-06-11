package comm.example;

abstract public class Account<Customer> {
protected int accountNumber;
protected Customer customerObj;
protected double balance;
public   Account(int accountNumber,Customer c,double balance)
{
    this.accountNumber=accountNumber;
    this.customerObj=c;
    this.balance=balance;
}
    
    
    public Account(int accountNumber2, comm.example.app.Customer c, double balance2) {
	// TODO Auto-generated constructor stub
}


	public int getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }
  public Customer getCustomerObj() {
    return customerObj;
  }
  public void setCustomerObj(Customer customerObj) {
    this.customerObj = customerObj;
  }
  public double getBalance() {
    return balance;
  }
  public void setBalance(double balance) {
    this.balance = balance;
  }
    abstract public boolean withdraw(double a);
    
}   