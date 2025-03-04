package Bank;

import utils.PinValidator;

public class BankingSystem{

	static final String storedAccountNumber = "1234";
	static final String storedPin = "1234";

	public static class LoginProcessor{

		public static boolean authenticate(String accountNumber, String pin){

				PinValidator validator = new PinValidator();
				PinValidator.Rules rules = validator.new Rules();

				return storedAccountNumber.equals(accountNumber) && rules.isValid(pin);		

		}

	}

}