package com.BankSystem.Dao;

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;

import com.BankSystem.Exception.AccountNotFoundException;
import com.BankSystem.dto.BankAccount;

public class BankAccountDaoImplem implements BankAccountDao{
	
	List<BankAccount> accountList=new ArrayList<>();
	
	
	@Override
	public void addNewBankAccount(BankAccount bankAccount) {
		
		accountList.add(bankAccount);
	}

	@Override
	public void removeBankAccount(BankAccount bankAccount) {
		/*before deleting bankAcount we need to check account exit or not
		 other wise it will throw an exception
		 */
		if(!accountList .contains(bankAccount)) {
			try {
			throw new AccountNotFoundException(bankAccount.getAccontNumber());
		}catch(AccountNotFoundException e) {
			e.printStackTrace();
		}
		}
		accountList.remove(bankAccount);
			
		
	}

	@Override
	public void updateBankAccount(BankAccount bankAccount) {
		
		if(!accountList .contains(bankAccount)) {
			try {
			throw new AccountNotFoundException(bankAccount.getAccontNumber());
		}catch(AccountNotFoundException e) {
			e.printStackTrace();
		}
		}
		int index=accountList.indexOf(bankAccount);
		// indexOf method provides index location at which bankAccount stored 
		/*set method Replaces the element at the specified position in this list with the
		 *  specified element (optional operation).
		 */
		accountList.set(index, bankAccount);
	}

	@Override
	public List<BankAccount> showAllAccount() {
		return accountList;
		
	}

}
