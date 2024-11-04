package com.java8;

import java.util.TreeMap;

public class SortingTreeMapsingLamdaExpression {
public static void main(String[] args) {
	TreeMap<Integer, String> treemap=new TreeMap<>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
	treemap.put(105, "Sachin");
	treemap.put(204, "Ankita");
	treemap.put(306, "Nitin");
	treemap.put(150, "Vandana");
	treemap.put(176, "Swetha");
	treemap.put(220, "Ankita Bhat");
	treemap.put(50, "Sachin sharma");
	treemap.put(250, "Sachin kumar sharma");
	System.out.println(treemap);
}
}
