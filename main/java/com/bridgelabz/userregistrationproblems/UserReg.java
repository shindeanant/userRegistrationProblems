package com.bridgelabz.userregistrationproblems;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserReg {
	public static final Scanner sc = new Scanner(System.in);
	public final String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
	public final String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
	public final String emailPattern = "[a-z0-9_+-]*(.[a-z0-9_+-]*?)@[a-z0-9]*.[a-z]*[a-z]*?$";
	public final String phonePattern = "^[0-9]{2}[0-9]{10}$";
	public final String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}$";

	// This method checks if the entered first name is valid
	public boolean validateFirstName(String fname) throws UserRegistrationException {
		Predicate<String> validateFirstName1 = n -> n.matches(firstNamePattern);
		boolean result = validateFirstName1.test(fname);

		if (result == true) {
			return true;
		} else {
			throw new UserRegistrationException("Enter Valid First Name");
		}

	}

	// This method checks if the entered lawst name is valid
	public boolean validateLastName(String lname) throws UserRegistrationException {
		Predicate<String> validateLast = n -> n.matches(lastNamePattern);
		boolean result = validateLast.test(lname);
		if (result == true) {
			return true;
		} else {
			throw new UserRegistrationException("Enter Valid First Name");
		}
	}

	// This method checks if the entered email is valid
	public boolean validateEmail(String email) throws UserRegistrationException {
		Predicate<String> validateEmail = n -> n.matches(emailPattern);
		boolean result = validateEmail.test(email);
		if (result == true) {
			return true;
		} else {
			throw new UserRegistrationException("Enter Valid First Name");
		}
	}

	// This method checks if the entered phone number is valid
	public boolean validatePhone(String phone) throws UserRegistrationException {
		Predicate<String> validatePhone = n -> n.matches(phonePattern);
		boolean result = validatePhone.test(phone);
		if (result == true) {
			return true;
		} else {
			throw new UserRegistrationException("Enter Valid First Name");
		}
	}

	// This method checks if the entered password is valid
	public boolean validatePassword(String password) throws UserRegistrationException {
		Predicate<String> validateFirstName1 = n -> n.matches(passwordPattern);
		boolean result = validateFirstName1.test(password);
		if (result == true) {
			return true;
		} else {
			throw new UserRegistrationException("Enter Valid First Name");
		}
	}

	// This is the main function
	public static void main(String[] args) throws UserRegistrationException {

		UserReg obj = new UserReg();
		System.out.println("Enter First Name: ");
		String fname = sc.next();
		sc.nextLine();
		obj.validateFirstName(fname);

		System.out.println("\nEnter Last Name: ");
		String lname = sc.next();
		obj.validateFirstName(lname);

		System.out.println("\nEnter Email: ");
		sc.nextLine();
		String email = sc.next();
		obj.validateEmail(email);

		System.out.println("\nEnter Phone No with Country Code: ");
		String phone = sc.next();
		obj.validatePhone(phone);

		System.out.println(
				"\nEnter Password (Min 8 characters with Atleast 1 Uppercase, 1 Numeric Digit, 1 Special Character): ");
		String password = sc.next();
		obj.validatePassword(password);

		System.out.println("\nSamples Emails to Test");
		obj.validateEmail("abc@yahoo.com");
		obj.validateEmail("abc-100@yahoo.com");
		obj.validateEmail("abc.100@yahoo.com");
		obj.validateEmail("abc111@abc.com");
		obj.validateEmail("abc-100@abc.net");
		obj.validateEmail("abc.100@abc.com.au");
		obj.validateEmail("abc@1.com");
		obj.validateEmail("abc@gmail.com.com");
		obj.validateEmail("abc+100@gmail.com");
	}
}
