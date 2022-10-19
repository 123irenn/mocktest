
import java.util.*;
interface  MaintenanceCharge{
	public float calculateMaintenanceCharge(float noOfYears);
	
}
class Account{

	private int accountNumber;
	private String customerName;
	private double balance;
	public Account(int accountNumber,String customerName,double balance)
	{
		this.accountNumber=accountNumber;
		this.customerName=customerName;
		this.balance=balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
class CurrentAccount extends Account
{

	public CurrentAccount(int accountNumber,String customerName,double balance)
	{
		super(accountNumber, customerName, balance);
		
		
	}
	public float  calculateMaintenanceCharge(float noOfYears)
	{
		return((100*noOfYears)+200);
	} 
}
class SavingsAccount1 extends Account implements  MaintenanceCharge 
{
	public SavingsAccount1(int accountNumber,String customerName,double balance)
	{
		super(accountNumber, customerName, balance);
		
		
	}
	public float  calculateMaintenanceCharge(float noOfYears)
	{
		return((50*noOfYears)+50);
	} 
	
}
public class bankAccount {

	public static void main(String[] args) {
		int ch;
		System.out.println("1.Savings Account\n2.Current Account\nEnter your choice");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		System.out.println("Enter the customer name:");
		String customerName=sc.next();
		System.out.println("Enter the account Number:");
		int accountNumber=sc.nextInt();
		System.out.println("Enter the balance Amount:");
		double balance=sc.nextDouble();
		System.out.println("Enter the  Number Of Years:");
		float noOfYears=sc.nextFloat();
		if(ch==1) {
			SavingsAccount1 sa=new SavingsAccount1(accountNumber,customerName,balance);
			System.out.println("Customer Name:"+sa.getCustomerName());
			System.out.println("Account Number:"+sa.getAccountNumber());
			System.out.println("Account Balance:"+sa.getBalance());
			System.out.println("Maintenance Charge for savings account:"+sa.calculateMaintenanceCharge(noOfYears));
			
		}
		else if(ch==2) {
			CurrentAccount ca=new CurrentAccount(accountNumber, customerName, balance);
			System.out.println("Customer Name:"+ca.getCustomerName());
			System.out.println("Account Number:"+ca.getAccountNumber());
			System.out.println("Account Balance:"+ca.getBalance());
			System.out.println("Maintenance Charge for savings account:"+ca.calculateMaintenanceCharge(noOfYears));
		}
		else {
			System.out.println("Invalid choice");
		}

	}

}
