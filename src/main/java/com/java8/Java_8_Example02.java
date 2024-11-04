package com.java8;

public class Java_8_Example02 {
public static void main(String[] args) {
	Funcational_interfaceExample_withParameter i=(s)->{
		System.out.println("Lenght of the String : "+s.length());
	};
	i.m1("sachin Sharma");
	i.m1("Ankita Bhat");
	 i=(s)->{
		System.out.println("Replace of space of the String : "+s.replaceAll("\\s+","_"));
	};
	i.m1("Ankita B Bhat");
	}
}

@FunctionalInterface
interface Funcational_interfaceExample_withParameter{
	public  void m1(String s);
}