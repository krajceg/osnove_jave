package p06_09_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		
		PhoneValidator phoneValidator = new PhoneValidator();
		PasswordValidator passwordValidator = new PasswordValidator();
		EmailValidator emailValidator = new EmailValidator();
		
		phoneValidator.setBrojTelefona("381");
		phoneValidator.validationResultMetoda().print();
		
		emailValidator.setEmail("sveta@gmail.net");
		emailValidator.validationResultMetoda().print();
		
		passwordValidator.setPassword("12345678#Aa");
		passwordValidator.validationResultMetoda().print();
	}

}
