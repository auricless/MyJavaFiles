package bankaccountapp;

public class Savings extends  Account{
	
	//list properties specific to savings account
	private int safetyDepositBoxId;
	private int safetyDepositBoxKey;
	
	//constructor: to initialize setting for savings properties
	public Savings(String name, String socialSN, double initDeposit){
		super(name, socialSN, initDeposit);
		
		accountNumber = "1" + "-" + accountNumber;
		setSafetyDepositBox();
		setRate();
	}
	
	//list any methods specific to savings account
	private void setSafetyDepositBox(){
		int digitCode;
		do{
			digitCode = (int) (Math.random() * Math.pow(10, 3)); 
			if(Integer.toString(digitCode).length() == 3){
				break;
			}
		}while(1 != 0);
		safetyDepositBoxId = digitCode; 
		
		int digitKey;
		do{
			digitKey = (int) (Math.random() * Math.pow(10, 4)); 
			if(Integer.toString(digitKey).length() == 4){
				break;
			}
		}while(1 != 0);
		safetyDepositBoxKey = digitKey;
	}
	
	@Override
	public void setRate(){
		rate = getBaseRate() -  0.25;
	}
	
	@Override
	public void showInfo(){
		System.out.println("=====================");
		System.out.println("ACCOUNT TYPE: Savings ");
		super.showInfo();
		System.out.println("SAVING ACCOUNT FEATURES: " +
							"\n   Safety Deposit Box ID: " + safetyDepositBoxId +
							"\n   Safety Deposit Key: " + safetyDepositBoxKey +
							"\n   Rate: " + rate + "%");
	}
}
