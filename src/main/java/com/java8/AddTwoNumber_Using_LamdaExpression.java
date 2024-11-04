package com.java8;

public class AddTwoNumber_Using_LamdaExpression {
public static void main(String[] args) {
	Funcational_interface_pass_two_Numbner n=(i,j)->System.out.println(i+j);
	n.m1(5, 6);
	n=(i,j)->System.out.println(i*j);
	n.m1(10, 2);
	n=(i,j)->System.out.println(i-j);
	n.m1(12, 2);
}
}

@FunctionalInterface
interface Funcational_interface_pass_two_Numbner{
	public  void m1(int i, int j);
}