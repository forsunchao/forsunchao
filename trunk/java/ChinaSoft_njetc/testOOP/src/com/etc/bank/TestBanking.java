package com.etc.bank;

class TestBanking {
	
	public static void main(String[] args) {
		// Create an account 
		System.out.println("Creating an account");
		Account account = new Account();
		account.setAccountID(872313123);
		account.setName("zhangsan");
		account.setBalance(1000);
		System.out.println("Deposit 250.50");
		account.deposit(250.50);
		System.out.println("Withdraw 150.00");
		account.withdraw(150.00);
		System.out.println("The account has a balance of " + account.getBalance());
	}
}
