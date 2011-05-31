package com.etc.bank;

/**
 * 银行账户
 */
public class Account {
	private long accountID; // 账号
	private String name;
	private double balance; // 账户余额

	/**
	 * 存款 参数：amount为存款额
	 */
	public void deposit(double amount) {
		balance = balance + amount;
	}

	/**
	 * 取款 参数：amount为取款额
	 */
	public void withdraw(double amount) {
		System.out.println("---");
		balance = balance - amount;
	}

	public long getAccountID() {
		return accountID;
	}

	public void setAccountID(long accountID) {
		this.accountID = accountID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
