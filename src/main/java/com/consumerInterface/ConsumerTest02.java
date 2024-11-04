package com.consumerInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest02 {
public static void main(String[] args) {
	Consumer<List<Integer> > modify = list ->
    {
        for (int i = 0; i < list.size(); i++)
            list.set(i, 2 * list.get(i));
    };
    List<Integer> list = new ArrayList<Integer>();
    list.add(2);
    list.add(1);
    list.add(3);

    // Implement modify using accept()
    modify.accept(list);
}
}
