package bankaccountapp;

public abstract class Account implements IBaseRate{
	
	//list common properties for saving and checking account
	private String name;
	private String socialSN;
	private double balance;
	
	protected String accountNumber;
	protected double rate;
	
	private static int index = 10000;
	
	
	//Constructor: to set base properties and initialize the account
	public Account(String name, String socialSN, double initDeposit){
		this.name = name;
		this.socialSN = socialSN;
		balance = initDeposit;
		
		//set account number
		index++;
		accountNumber = setAccountNumber();
		rate = getBaseRate();
	}
	
	public abstract void setRate();
	
	private String setAccountNumber(){
		String lastTwoOfSSN = socialSN.substring(socialSN.length() - 2);
		int uniqueID = index;
		int rand;
		do{
			rand = (int) Math.floor(Math.random() * Math.pow(10, 3));
			if(rand >= 100){
				break;
			}
		}while(1 != 0);
		
		return lastTwoOfSSN + "-" + uniqueID + "-" + rand;
	}
	
	public void showInfo(){
		System.out.println("NAME: " + name +
							"\nACCOUNT NUMBER: " + accountNumber +
							"\nBALANCE: $" + balance);
	}
	
	//list common methods
	public void deposit(double amount){
		balance += amount;
		System.out.println("DEPOSITED: " + amount);
		printBalance();
	}
	
	public void withdraw(double amount){
		balance -= amount;
		System.out.println("WITHDRAWED: " + amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount){
		balance -= amount;
		System.out.println("TRANSFERED $" + amount + " TO " + toWhere);
		printBalance();
	}
	
	public void printBalance(){
		System.out.println("CURRENT BALANCE: " + balance);
	}
	
	public void compound(){
		double accruedInterest = balance * (rate / 100);
		balance += accruedInterest;
		System.out.println("Accrued Interest: $" + accruedInterest);
		printBalance();
	}
	
	
	
}
