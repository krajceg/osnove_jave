package p06_09_2022;

import java.util.ArrayList;

public class ValidationResult {

	protected boolean hasErrors;
	protected ArrayList<String> errors = new ArrayList<String>();

	public ValidationResult() {
		super();
		this.hasErrors = false;
	}

	public boolean isHasErrors() {
		return hasErrors;
	}

	public ArrayList<String> getErrors() {
		return errors;
	}

	public void addError(String error) {
		hasErrors = true;
		errors.add(error);
	}

	public void print() {
		if (hasErrors == true) {
			for (int i = 0; i < errors.size(); i++) {
				System.out.println(errors.get(i));
			}
		} else {
			System.out.println("No validation errors");
		}
	}
}
