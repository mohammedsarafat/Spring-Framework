package com.nit.project02;

public class Bank {

	private int bankId;
	private String bankName;
	private String branch;
	private String IFSCCode;
	private String managerName;

	private Customer customer;

	public Bank() {
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void setIFSCCode(String iFSCCode) {
		IFSCCode = iFSCCode;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void display() {
		IO.println("Bank Details");
		IO.println("Bank ID      : " + bankId);
		IO.println("Bank Name    : " + bankName);
		IO.println("Branch       : " + branch);
		IO.println("IFSC Code    : " + IFSCCode);
		IO.println("Manager Name : " + managerName);

		IO.println();
		IO.println(customer);
	}
}
