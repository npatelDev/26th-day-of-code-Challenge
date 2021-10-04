package com.BankSystem.Services;

import java.util.List;

import com.BankSystem.Dao.BankAccountDao;
import com.BankSystem.Dao.BankAccountDaoImplem;
import com.BankSystem.dto.BankAccount;

public class BankAccountServicesImple implements BankAccountServices {
	BankAccountDao bdao=new BankAccountDaoImplem();
	
	@Override
	public void addNewBankAccount(BankAccount bankAccount) {
	
		bdao.addNewBankAccount(bankAccount);
	}

	@Override
	public void removeBankAccount(BankAccount bankAccount) {
		bdao.removeBankAccount(bankAccount);
		
	}

	@Override
	public void updateBankAccount(BankAccount bankAccount) {
		bdao.updateBankAccount(bankAccount);
		
	}

	@Override
	public List<BankAccount> showAllAccount() {
		// TODO Auto-generated method stub
		return bdao.showAllAccount();
	}
			
}
