package com.functionalinterface;

import java.util.function.Function;

public class CountTheSpaceInaString {
public static void main(String[] args) {
	Function<String,Integer> f=(s)->{
		return s.length()-s.replace(" ", "").length();
		
	};
	System.out.println("Count the Space in given String : "+f.apply("sachin kumar sharma"));
	System.out.println("Count the Space in given String : "+f.apply("Ankita Bhat"));
}
}
