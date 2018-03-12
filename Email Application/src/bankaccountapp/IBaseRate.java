package bankaccountapp;

public interface IBaseRate {
	
	//write a method that returns a base rate
	default double getBaseRate(){
		return 2.5;
	}
	
}
