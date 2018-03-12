package bankaccountapp;

public class Checking extends Account{

	//list properties specific to checking account
	private long debitCardNumber;
	private int debitCardPin;
	
	//constructor: initialize checking account properties
	public Checking(String name, String socialSN, double initDeposit){
		super(name, socialSN, initDeposit);
		accountNumber = "2" + "-" + accountNumber;
		
		setDebitCard();
		setRate();
	}
	
	//list any method specific to checking account
	private void setDebitCard(){
		long cardNumber;
		do{
			cardNumber = (long) (Math.random() * Math.pow(10, 12));
			if(Long.toString(cardNumber).length() == 12){
				break;
			}
		}while(1 != 0);
		debitCardNumber = cardNumber;
		
		int cardPin;
		do{
			cardPin = (int) (Math.random() * Math.pow(10, 4));
			if(Integer.toString(cardPin).length() == 4){
				break;
			}
		}while(1 != 0);
		debitCardPin = cardPin;
	}
	
	@Override
	public void setRate(){
		rate = getBaseRate() * 0.15;
	}
	
	@Override
	public void showInfo(){
		System.out.println("=====================");
		System.out.println("ACCOUNT TYPE: Checking ");
		super.showInfo();
		System.out.println("CHECKING ACCOUNT FEATURES: " +
				"\n   Debit Card Number: " + debitCardNumber +
				"\n   Debit Card Pin: " + debitCardPin +
				"\n   Rate: " + rate + "%");
	}
}
