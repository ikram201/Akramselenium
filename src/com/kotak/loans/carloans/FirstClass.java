package com.kotak.loans.carloans;



public class FirstClass {

		
int a=20, b=30, c=0;
public void add()
{
	c = a+b;
	System.out.println("Add of A & B is :" +c);
	
}
public void sub()
{
	c = a-b;
	System.out.println("Sub of A & B is :"+c);
}
public static void main(String[] args) {

//System.out.println("hi");
FirstClass obj = new FirstClass();
obj.add();
obj.sub();
}}