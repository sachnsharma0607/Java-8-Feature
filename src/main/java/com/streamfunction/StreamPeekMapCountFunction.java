package com.streamfunction;

import java.util.stream.Stream;

public class StreamPeekMapCountFunction {
public static void main(String[] args) {
	Stream<String> stream = Stream.of("Geeks", "For", 
            "GeeksForGeeks", "A", 
            "Computer", "Portal"); 

// Since the stream is not being consumed 
// this will not throw any exception 

// Print the stream 
stream.filter(s -> s.startsWith("G")) 
.peek(s -> System.out.println("Filtered value: " + s)) 
.map(String::toUpperCase) 
.peek(s -> System.out.println("Uppercase value :" + s)) 
.count(); 
}
}
