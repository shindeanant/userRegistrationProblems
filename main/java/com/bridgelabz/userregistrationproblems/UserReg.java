package com.bridgelabz.userregistrationproblems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserReg {
	public static final Scanner sc = new Scanner(System.in);
	public final String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
	public final String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";

	/*
	 * / This method checks if the entered first name is valid
	 */
	public boolean validateFirstName(String fname) {
		Pattern pattern = Pattern.compile(firstNamePattern);
		return pattern.matcher(fname).matches();
	}

	public boolean validateLastName(String lname) {
		Pattern pattern = Pattern.compile(firstNamePattern);
		return pattern.matcher(lname).matches();
	}

	/*
	 * / This is the main function
	 */
	public static void main(String[] args) {

		System.out.println("Enter First Name: ");
		String fname = sc.next();
		UserReg obj = new UserReg();
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
	}

}
