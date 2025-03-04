package utils;

public class PinValidator{

	
	public class Rules{

		public boolean isValid(String pin){

			if (pin.length() == 4 && pin.matches("\\d+")){
				return true;
			}
			else {
				System.out.println("Password must be equal to 4 characters ! ");
				return false;
			}			

		}

	}

}