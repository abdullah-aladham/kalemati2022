package com.abdullah_aladham.kalemati.Exceptions;

public class UserNotFoundException extends RuntimeException {
	public  UserNotFoundException(String message) {
		super(message);
	}
}
