package com.BankSystem.Dao;

import java.util.List;

import com.BankSystem.dto.BankAccount;

public interface BankAccountDao {
		
	public abstract void  addNewBankAccount(BankAccount bankAccount);
	public abstract void  removeBankAccount(BankAccount bankAccount);
	public abstract void  updateBankAccount(BankAccount bankAccount);
	public abstract List<BankAccount> showAllAccount();
	
}
