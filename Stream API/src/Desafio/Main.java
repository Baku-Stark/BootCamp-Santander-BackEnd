package Desafio;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Main {
	public void mostrarOrdemNumerica(List<Integer> numeros) {
		// UTILIZANDO O 'sorted'
		System.out.println("=== MOSTRANDO OS NUMEROS DA LISTA EM ORDEM NUMÉRICA ===");
		
		numeros.stream()
			.sorted(Integer::compareTo)
			.forEach(System.out::println);
	}
	
	public void mostrarSomaNumerosPares(List<Integer> numeros) {
		// UTILIZANDO O 'Consumer' e 'BinaryOperator'
		List<Integer> numerosPares = new ArrayList<Integer>();
		
		System.out.println("=== MOSTRANDO OS NUMEROS PARES SOMADOS ===");
		BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;
		
		numeros.stream().forEach(new Consumer<Integer>(){
			@Override
			public void accept(Integer numero) {
				if(numero % 2 == 0) {
					numerosPares.add(numero);
				}
			}
		});
		
		int resultado = numerosPares.stream()
				.reduce(0, somar);
		
		System.out.println("O resultado da soma dos números pares é: " + resultado); // # 43
	}
	
	public void mostrarNumerosPositivos(List<Integer> numeros) {
		List<Integer> numerosPositivos = new ArrayList<Integer>();
		
		System.out.println("=== MOSTRANDO OS NUMEROS POSITIVOS DA LISTA ===");
		numeros.stream().forEach(new Consumer<Integer>(){
			@Override
			public void accept(Integer numero) {
				if(numero > 0) {
					numerosPositivos.add(numero);
				}
			}
		});
		
		System.out.println("O resultado da soma dos números pares é: " + numerosPositivos);
	}
	
	public void removerValoresImpares(List<Integer> numeros) {
		List<Integer> numerosPares = new ArrayList<Integer>();
		
		System.out.println("=== MOSTRANDO OS NUMEROS PARES ===");
		
		numeros.stream().forEach(new Consumer<Integer>(){
			@Override
			public void accept(Integer numero) {
				if(numero % 2 == 0) {
					numerosPares.add(numero);
				}
			}
		});
		
		System.out.println("Lista sem os números IMPARES: " + numerosPares); 
	}
	
	public void calcularMaioresCinco(List<Integer> numeros) {
		List<Integer> numerosMaiorCinco = new ArrayList<Integer>();
		
		System.out.println("=== MOSTRANDO OS NUMEROS PARES ===");
		
		numeros.stream().forEach(new Consumer<Integer>(){
			@Override
			public void accept(Integer numero) {
				if(numero > 5) {
					numerosMaiorCinco.add(numero);
				}
			}
		});
		
		int soma = numerosMaiorCinco.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println("MÉDIA DOS NÚMEROS MAIORES QUE 5: " + soma / numerosMaiorCinco.size()); // # 8 
	}
	
	public static void main(String[] args){
		Main method = new Main();
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		// 1 - MOSTRAR EM ORDEM CRESCENTE
		method.mostrarOrdemNumerica(numeros);
		System.out.println('\n');
		
		// 2 - SOMAR TODOS OS NÚMEROS PARES
		method.mostrarSomaNumerosPares(numeros);
		System.out.println('\n');
		
		// 3 - MOSTRAR OS VALORES POSITIVOS
		method.mostrarNumerosPositivos(numeros);
		System.out.println('\n');
		
		// 4 - REMOVER OS NÚMEROS IMPARES
		method.removerValoresImpares(numeros);
		System.out.println('\n');
		
		// 5 - CALCULAR MÉDIA DOS NÚMEROS MAIORES QUE 5
		method.calcularMaioresCinco(numeros);
		System.out.println('\n');
	}
}
