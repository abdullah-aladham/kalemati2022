package com.abdullah_aladham.kalemati.Exceptions;

public class RequestNotFoundException extends RuntimeException {

	RequestNotFoundException(String message){
		super(message);
	}
}
