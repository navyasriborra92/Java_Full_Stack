package com.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ControllerAdvice
public class GlobalHandlerException {

	@ExceptionHandler(AccountNotFoundException.class)
	public String handleAccountNotFoundException(AccountNotFoundException ex, Model model){
		model.addAttribute("error", ex.getMessage());
		return "customerloginpage";
	}
	
	@ExceptionHandler(InsufficientBalanceException.class)
	public String handleInsufficientBalanceException(InsufficientBalanceException ex, Model model) {
		model.addAttribute("error", ex.getMessage());
		return "customerfundstransfer";
	}
	
	@ExceptionHandler(InvalidUpiIdException.class)
	public String handleInvalidUpiIdException(InvalidUpiIdException ex, Model model) {
		model.addAttribute("error", ex.getMessage());
		return "customerfundstransfer";
	}
	
	@ExceptionHandler(InvalidAmountException.class)
	public String handleInvalidAmountException(InvalidAmountException ex, Model model) {
		model.addAttribute("error", ex.getMessage());
		return "customerfundstransfer";
	}
		
	@ExceptionHandler(FilltheDetailsException.class)
	public String filltheDetailsException(FilltheDetailsException ex, Model model) {
		model.addAttribute("error", ex.getMessage());
		return "customerfundstransfer";
	}
	
}
