package p06_09_2022;

public class EmailValidator extends Validator {
	
	protected String email;
	
	public EmailValidator() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public ValidationResult validationResultMetoda() {
		ValidationResult validacija = new ValidationResult();
		if (!email.contains("@") || (!email.endsWith(".com") && !email.endsWith(".net"))) {
			validacija.addError("Email is invalid");
		}
		return validacija;
	}
	
	
}
