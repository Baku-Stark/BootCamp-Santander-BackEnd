package FunctionalInterface;

import java.util.*;
import java.util.function.*;

public class ConsumerMethod {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		Consumer<Integer> imprimirNumeroPar = numero -> {
			if(numero % 2 == 0) {
				System.out.println(numero);
			}
		};
		
		numeros.stream().forEach(new Consumer<Integer>(){
			@Override
			public void accept(Integer numero) {
				if(numero % 2 == 0) {
					System.out.println(numero);
				}
			}
		});
	}
}
