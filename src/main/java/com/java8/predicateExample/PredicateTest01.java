package com.java8.predicateExample;

import java.util.function.Predicate;

public class PredicateTest01 {
public static void main(String[] args) {
	
	Predicate<Integer> p=I->I>10;
	System.out.println(p.test(15));
	System.out.println(p.test(5));
}
}
