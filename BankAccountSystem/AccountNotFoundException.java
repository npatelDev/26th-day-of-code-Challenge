package com.BankSystem.Exception;

public class AccountNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int AccontNumber;
	public AccountNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountNotFoundException(int accontNumber) {
		super();
		AccontNumber = accontNumber;
	}
	@Override
	public String toString() {
		return "AccountNotFoundException [AccontNumber=" + AccontNumber + "]";
	}
	
	
	
		
}
