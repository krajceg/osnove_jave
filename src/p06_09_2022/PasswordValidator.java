package p06_09_2022;

public class PasswordValidator extends Validator {
	
	protected String password;

	public PasswordValidator() {
		super();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean specialChar () {
		if (password.contains("@") || password.contains("#") || password.contains("/") || password.contains("*")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean minLength() {
		if (password.length() >= 8) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean UpperCase() {
		for (int i = 0; i < password.length(); i++) {
			if (Character.isUpperCase(password.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	public boolean LowerCase() {
		for (int i = 0; i < password.length(); i++) {
			if (Character.isLowerCase(password.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	public boolean Digit() {
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public ValidationResult validationResultMetoda() {
		ValidationResult validacija = new ValidationResult();
		if (specialChar() != true || minLength() != true || UpperCase() != true || LowerCase() != true || Digit() != true) {
			if (specialChar() == false) {
				validacija.addError("Password must contain at least one special character @, # or *");
			}
			if (UpperCase() == false) {
				validacija.addError("Password must contain at least one uppercase letter");
			}
			if (LowerCase() == false) {
				validacija.addError("Password must contain at least one lowercase letter");
			}
			if (Digit() == false) {
				validacija.addError("Password must contain at least one digit");
			}
			if (minLength() == false) {
				validacija.addError("Password must be minimum 8 characters");
			}
		}
		return validacija;
	}

}
