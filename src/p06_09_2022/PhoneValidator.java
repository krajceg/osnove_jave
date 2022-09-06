package p06_09_2022;

public class PhoneValidator extends Validator {

	protected String brojTelefona;

	public PhoneValidator() {
		super();
	}

	public String getBrojTelefona() {
		return brojTelefona;
	}

	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}

	public boolean startsWithPlus() {
		if (brojTelefona.startsWith("+")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean noSpaces() {
		if (brojTelefona.contains(" ")) {
			return false;
		} else {
			return true;
		}
	}

	public boolean onlyDigits() {
		String brojTelefonaBezPlusa = brojTelefona.substring(1);
		if (brojTelefonaBezPlusa.matches("[0-9]+")) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public ValidationResult validationResultMetoda() {
		ValidationResult validacija = new ValidationResult();
		if (startsWithPlus() != true || noSpaces() != true || onlyDigits() != true) {
			if (startsWithPlus() == false) {
				validacija.addError("Phone number must start with +");
			}
			if (noSpaces() == false) {
				validacija.addError("Phone number cannot contain spaces");
			}
			if (onlyDigits() == false) {
				validacija.addError("Phone number can only contain numbers");
			}
		}
		return validacija;
	}

}
