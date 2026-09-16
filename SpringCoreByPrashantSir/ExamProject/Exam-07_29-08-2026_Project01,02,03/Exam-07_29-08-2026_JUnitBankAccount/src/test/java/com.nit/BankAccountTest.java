package com.nit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

	// Test 1: Deposit money
	@Test
	void testDeposit() {

		BankAccount account = new BankAccount(10000);

		account.deposit(5000);

		assertEquals(15000, account.getBalance());
	}

	// Test 2: Withdraw money
	@Test
	void testWithdraw() {

		BankAccount account = new BankAccount(10000);

		account.withdraw(3000);

		assertEquals(7000, account.getBalance());
	}

	// Test 3: Get current balance
	@Test
	void testGetBalance() {

		BankAccount account = new BankAccount(25000);

		assertEquals(25000, account.getBalance());
	}

	// Test 4: Interest calculation
	@Test
	void testCalculateInterest() {

		BankAccount account = new BankAccount(10000);

		double interest = account.calculateInterest(10);

		assertEquals(1000, interest);
	}

	// Test 5: Multiple deposits
	@Test
	void testMultipleDeposits() {

		BankAccount account = new BankAccount(5000);

		account.deposit(1000);
		account.deposit(2000);
		account.deposit(3000);

		assertEquals(11000, account.getBalance());
	}

	// Test 6: Withdraw after deposit
	@Test
	void testWithdrawAfterDeposit() {

		BankAccount account = new BankAccount(10000);

		account.deposit(5000);
		account.withdraw(3000);

		assertEquals(12000, account.getBalance());
	}
}
