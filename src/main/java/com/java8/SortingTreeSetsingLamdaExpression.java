package com.java8;

import java.util.TreeSet;

public class SortingTreeSetsingLamdaExpression {
public static void main(String[] args) {
	TreeSet<Integer> treeSet=new TreeSet<Integer>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
	
	treeSet.add(25);
	treeSet.add(10);
	treeSet.add(5);
	treeSet.add(30);
	treeSet.add(45);
	treeSet.add(15);
	treeSet.add(7);
	treeSet.add(8);
	System.out.println("ascending order : "+treeSet);
}
}
