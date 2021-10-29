package com.bridgelabz.userregistrationproblems;

public class UserRegistration {
	@FunctionalInterface
	public interface UserRegistration<n> {
		boolean validate(n param);
	}
}
