package LambdaExpressions;

import java.util.*;
import java.util.function.*;

interface StringFunction{
	String run(String str);
}

public class Main {
	public static void ArrayListForEach() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    numbers.forEach( (n) -> { System.out.println(n); } );
	}
	
	public static void ArrayListConsumer() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    
	    Consumer<Integer> method = (n) -> { System.out.println(n); };
	    numbers.forEach( method );
	}
	
	public static void printFormatted(String str, StringFunction format) {
	    String result = format.run(str);
	    System.out.println(result);
	  }
	
	public static void main(String[] args) {
	    ArrayListForEach();
	    System.out.println("====");
	    ArrayListConsumer();
	    System.out.println("====");
	    
	    StringFunction exclaim = (s) -> s + "!";
	    StringFunction ask = (s) -> s + "?";
	    printFormatted("Hello", exclaim);
	    printFormatted("Hello", ask);
	}
}