package com.functionalinterface;

import java.util.function.Function;

public class FunctionalInterFace01 {
public static void main(String[] args) {
	Function<String,Integer> f=(s)->{
		return s.length();
		
	};
	System.out.println(f.apply("sachin"));
	System.out.println(f.apply("Ankita Bhat"));
}
}
