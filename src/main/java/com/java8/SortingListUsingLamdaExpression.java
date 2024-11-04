package com.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingListUsingLamdaExpression {
public static void main(String[] args) {
	List<Integer> arraylist=new ArrayList<>();
	arraylist.add(25);
	arraylist.add(10);
	arraylist.add(5);
	arraylist.add(30);
	arraylist.add(45);
	arraylist.add(15);
	arraylist.add(7);
	arraylist.add(8);
	System.out.println("Before sorting : "+arraylist);
	Collections.sort(arraylist,(i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
	System.out.println("After sorting : "+arraylist);
}
}
