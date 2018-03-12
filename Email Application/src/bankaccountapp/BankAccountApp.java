package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

import utilities.CSV;

public class BankAccountApp {

	public static void main(String[] args) {
		
		List<Account> accounts = new LinkedList<>();
		
		//read a CSV file the create a new account based on data
		String file = "resources/NewBankAccounts.csv";	
		List<String[]> newAccountHolders = CSV.read(file);
		
		for(String[] newAccountHolder : newAccountHolders){
			String name = newAccountHolder[0];
			String socialSn = newAccountHolder[1];
			String accountType = newAccountHolder[2];
			int initDeposit = Integer.parseInt(newAccountHolder[3]);
			
			if(accountType.equals("Savings")){
				System.out.println("OPEN A SAVINGS ACCOUNT");
				accounts.add(new Savings(name, socialSn, initDeposit));
			}else if(accountType.equals("Checking")){
				System.out.println("OPEN A CHECKING ACCOUNT");
				accounts.add(new Checking(name, socialSn, initDeposit));
			}else{
				System.out.println("ERROR READING ACCOUTN TYPE");
			}
			
		}
		
		for(Account account : accounts){
			account.showInfo();
		}
		
	}

}
