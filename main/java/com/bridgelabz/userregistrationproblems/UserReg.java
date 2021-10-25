package com.bridgelabz.userregistrationproblems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserReg {
	public static final Scanner sc = new Scanner(System.in);
	public final String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
	public final String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
	public final String emailPattern = "[a-z0-9_+-]*(.[a-z0-9_+-]*?)@[a-z0-9]*.[a-z].*?[a-z]*?$";
	public final String phonePattern = "^[0-9]{2}[0-9]{10}$";
	public final String passordPattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}$";

	// This method checks if the entered first name is valid
	public boolean validateFirstName(String fname) {
		Pattern pattern = Pattern.compile(firstNamePattern);
		return pattern.matcher(fname).matches();
	}

	// This method checks if the entered lawst name is valid
	public boolean validateLastName(String lname) {
		Pattern pattern = Pattern.compile(firstNamePattern);
		return pattern.matcher(lname).matches();
	}

	// This method checks if the entered email is valid
	public boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile(emailPattern);
		return pattern.matcher(email).matches();
	}

	// This method checks if the entered phone number is valid
	public boolean validatePhone(String phone) {
		Pattern pattern = Pattern.compile(phonePattern);
		return pattern.matcher(phone).matches();
	}

	// This method checks if the entered password is valid
	public boolean validatePassword(String password) {
		Pattern pattern = Pattern.compile(passordPattern);
		return pattern.matcher(password).matches();
	}

	// Method for printing validate email output;
	public void emailTest(String email) {
		System.out.print(email + "->");
		if (validateEmail(email)) {
			System.out.printf("Email Valid \n");
		} else {
			System.out.printf("Email Invalid \n");
		}
	}

	// This is the main function
	public static void main(String[] args) {

		UserReg obj = new UserReg();
		System.out.println("Enter First Name: ");
		String fname = sc.next();
		if (obj.validateFirstName(fname)) {
			System.out.println("First Name Valid");
		} else {
			System.out.println("First Name Invalid");
		}

		System.out.println("\nEnter Last Name: ");
		String lname = sc.next();
		if (obj.validateFirstName(lname)) {
			System.out.println("Last Name Valid");
		} else {
			System.out.println("Last Name Invalid");
		}

		System.out.println("\nEnter Email: ");
		sc.nextLine();
		String email = sc.next();
		if (obj.validateEmail(email)) {
			System.out.println("Email Valid");
		} else {
			System.out.println("Email Invalid");
		}

		System.out.println("\nEnter Phone No with Country Code: ");
		String phone = sc.next();
		if (obj.validatePhone(phone)) {
			System.out.println("Phone No. Valid");
		} else {
			System.out.println("Phone No. Invalid");
		}

		System.out.println(
				"\nEnter Password (Min 8 characters with Atleast 1 Uppercase, 1 Numeric Digit, 1 Special Character): ");
		String password = sc.next();
		if (obj.validatePassword(password)) {
			System.out.println("Password Valid");
		} else {
			System.out.println("Password Invalid");
		}

		System.out.println("\nSamples Emails to Test");
		obj.emailTest("abc@yahoo.com");
		obj.emailTest("abc-100@yahoo.com");
		obj.emailTest("abc.100@yahoo.com");
		obj.emailTest("abc111@abc.com");
		obj.emailTest("abc-100@abc.net");
		obj.emailTest("abc.100@abc.com.au");
		obj.emailTest("abc@1.com");
		obj.emailTest("abc@gmail.com.com");
		obj.emailTest("abc+100@gmail.com");
	}

}
