package com.jpm.scope.accessmodifiers;

public class AccountOps
{

	public static void main(String[] args)
	{
		Account myAccount = new Account("My Account");
		myAccount.deposit(2000);
		myAccount.withdrawal(500);
		myAccount.withdrawal(-200);
		myAccount.deposit(-20);
		myAccount.calculateBalance();
//		myAccount.balance = 5000;//Not good
		System.out.println("Balance: " + myAccount.getBalance());
//		myAccount.transactions.add(5000);//Not good
		myAccount.calculateBalance();
	}

}
