package com.java8;

public class Java_8_Example01 {

	public  void m1() {
		System.out.println("Function Example : Hello");
	}
	public static void main(String[] args) {
		new Java_8_Example01().m1();
		Funcational_interfaceExample i=	()->{
			System.out.println("Lamda Example : Hello");
		};
		i.m1();
		
	}
	
	
}

@FunctionalInterface
interface Funcational_interfaceExample{
	public  void m1();
}