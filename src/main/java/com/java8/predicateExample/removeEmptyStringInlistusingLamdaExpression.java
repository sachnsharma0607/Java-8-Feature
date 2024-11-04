package com.java8.predicateExample;

import java.util.ArrayList;
import java.util.function.Predicate;

public class removeEmptyStringInlistusingLamdaExpression {
public static void main(String[] args) {
	String[] names= {"sachin",null,"","Ankita",null};
	Predicate<String> p=I->I!=null&&I.length()!=0;
	ArrayList<String> arrayList=new ArrayList<>();
	for(String name:names)
	{
		if(p.test(name)) {
			arrayList.add(name);
		}
	}
	System.out.println(arrayList);
}
}
