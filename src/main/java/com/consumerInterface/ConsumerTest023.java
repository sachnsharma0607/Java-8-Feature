package com.consumerInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest023 {
	
public static void main(String[] args) {
	
	Consumer<List<Integer>>
    dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
    List<Integer> list = new ArrayList<Integer>();
    list.add(2);
    list.add(1);
    list.add(3);
    dispList.accept(list);

}
}
