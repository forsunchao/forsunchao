package com.etc.bank;

/**
 * �����˻�
 */
class Account1 {
	long accountID; // �˺�
	String name;
	double balance; // �˻����

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
}
