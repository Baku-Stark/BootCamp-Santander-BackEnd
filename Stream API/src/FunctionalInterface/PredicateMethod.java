package FunctionalInterface;

import java.util.*;
import java.util.function.Predicate;

public class PredicateMethod {
	public static void main(String[] args) {
		List<String> palavras = Arrays.asList("Rust", "Kotlin", "Python", "JavaScript", "C", "Go", "Ruby");
	
		Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
		
		palavras.stream()
			.filter(maisDeCincoCaracteres)
			.forEach(System.out::println);;
	}
}
