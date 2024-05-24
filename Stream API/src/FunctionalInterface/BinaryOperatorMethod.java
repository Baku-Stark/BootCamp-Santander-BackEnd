package FunctionalInterface;

import java.util.*;
import java.util.function.BinaryOperator;

public class BinaryOperatorMethod {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		
		BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;
		
		int resultado = numeros.stream()
				.reduce(0, somar);
		
		System.out.println("O resultado da soma é: " + resultado);
	}
}
