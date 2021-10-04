package com.BankSystem.Client;

import java.util.List;

import com.BankSystem.Services.BankAccountServices;
import com.BankSystem.Services.BankAccountServicesImple;
import com.BankSystem.dto.BankAccount;

public class BankAccountCollectionsMain {
	public static void main(String[] args) {
		
		BankAccountServices bservice=new BankAccountServicesImple();
		bservice.addNewBankAccount(new BankAccount("A",1,13000));
		bservice.addNewBankAccount(new BankAccount("B",2,15000));
		bservice.addNewBankAccount(new BankAccount("C",3,30000));
		bservice.addNewBankAccount(new BankAccount("D",4,20000));
		bservice.addNewBankAccount(new BankAccount("E",5,12000));
		
		List<BankAccount> actList=bservice.showAllAccount();
		
		for(BankAccount act:actList) {
			System.out.println(act.getAccontName()+" "+act.getAccontNumber()+" "+act.getAccontBalance());
		}
		System.out.println("-----------BankAcount Updated List----------------");
		BankAccount temp1=new BankAccount("Nitesh Patel",1,50000);
		BankAccount temp2=new BankAccount("Umesh Patel",2,10000);
		BankAccount temp3=new BankAccount("Ashish Patel",3,5000);
		BankAccount temp4=new BankAccount("Vijay Patel",4,1000);
		BankAccount temp5=new BankAccount("Manoj Patel",5,100000);
		bservice.updateBankAccount(temp1);
		bservice.updateBankAccount(temp2);
		bservice.updateBankAccount(temp3);
		bservice.updateBankAccount(temp4);
		bservice.updateBankAccount(temp5);
		System.out.println("-----------BankAcount Updated List----------------");
		actList=bservice.showAllAccount();
		for(BankAccount act:actList) {
			System.out.println(act.getAccontName()+" "+act.getAccontNumber()+" "+act.getAccontBalance());
		}
		bservice.removeBankAccount(temp3);
		System.out.println("--------Updated List After Deletion--------");
		for(BankAccount act:actList) {
			System.out.println(act.getAccontName()+" "+act.getAccontNumber()+" "+act.getAccontBalance());
		}
		
	}
}
