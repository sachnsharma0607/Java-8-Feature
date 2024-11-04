package com.supplierrInterface;

import java.util.function.Supplier;

public class RandomNumber01 {
public static void main(String[] args) {
	Supplier<Integer> randomValue = () ->(int)( Math.random()*10); 
	  
     
    System.out.println(randomValue.get());
}
}
