package com.kotak.loans.carloans;

public class ChildClassKotak implements RBI
{

	public static void main(String[] args) {
	
		ChildClassKotak k = new ChildClassKotak();
		k.deposit();
		k.withdrawl();

	}

	@Override
	public void withdrawl() {
	System.out.println("i am overriden withdrawl in kotak");
		
	}

	@Override
	public void deposit() {
		System.out.println("I am overriden deposit in kotak");
		
	}

}
