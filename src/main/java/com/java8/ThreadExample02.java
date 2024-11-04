package com.java8;

public class ThreadExample02 {
public static void main(String[] args) {

	
	Runnable r = ()->{
		for(int i=0;i<20;i++) {
		System.out.println("Child Thread");
		}
	};
	Thread t=new Thread(r);
	t.start();
	for(int i=0;i<20;i++) {
		System.out.println("Main Thread");
		}
}
}
