package com.exceptions;

public class InvalidUpiIdException extends RuntimeException{

	public InvalidUpiIdException(String message){
		super(message);
	}
}
