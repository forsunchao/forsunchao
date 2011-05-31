package com.etc.bank;

/**
 * �����˻�
 */
public class Account {
	private long accountID; // �˺�
	private String name;
	private double balance; // �˻����

	/**
	 * ��� ������amountΪ����
	 */
	public void deposit(double amount) {
		balance = balance + amount;
	}

	/**
	 * ȡ�� ������amountΪȡ���
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
