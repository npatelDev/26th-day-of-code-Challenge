package com.BankSystem.dto;
//PoJo Class
public class BankAccount {
	private String AccontName;
	private int AccontNumber;
	private int AccontBalance;
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(String accontName, int accontNumber, int accontBalance) {
		super();
		AccontName = accontName;
		AccontNumber = accontNumber;
		AccontBalance = accontBalance;
	}
	public String getAccontName() {
		return AccontName;
	}
	public void setAccontName(String accontName) {
		AccontName = accontName;
	}
	public int getAccontNumber() {
		return AccontNumber;
	}
	public void setAccontNumber(int accontNumber) {
		AccontNumber = accontNumber;
	}
	public int getAccontBalance() {
		return AccontBalance;
	}
	public void setAccontBalance(int accontBalance) {
		AccontBalance = accontBalance;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + AccontNumber;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (AccontNumber != other.AccontNumber)
			return false;
		return true;
	}
	
	
}
