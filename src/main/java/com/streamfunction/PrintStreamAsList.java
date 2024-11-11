package com.streamfunction;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintStreamAsList {
public static void main(String[] args) {

	  
    // Get the stream 
    Stream<String> stream = Stream.of("Geeks", "For", 
                                      "Geeks", "A", 
                                      "Computer", "Portal"); 

    // Print the stream 
    System.out.println(stream.collect(Collectors.toList())); 
}
}
