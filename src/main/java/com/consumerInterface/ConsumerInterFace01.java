package com.consumerInterface;

import java.util.function.Consumer;

public class ConsumerInterFace01 {
public static void main(String[] args) {
	// Consumer to display a number
    Consumer<Integer> display = a -> System.out.println(a);

    // Implement display using accept()
    display.accept(10);
}
}
