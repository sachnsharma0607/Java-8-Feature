package com.java8.predicateExample;

import java.util.function.Predicate;

public class EvenOddUsingPredicateFunction {
public static void main(String[] args) {
	Predicate<Integer> p=I->I%2==0;
	System.out.println(p.test(15));
	System.out.println(p.test(5));
	System.out.println(p.test(6));

}
}
