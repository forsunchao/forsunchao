package com.etc.bank;

/**
 * 银行账户
 */
class Account1 {
	long accountID; // 账号
	String name;
	double balance; // 账户余额

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
}
