package FunctionalInterface;

import java.util.Optional;

public class ClassOptionalMethod {
	public void test_1() {
		// Cria um Optional contendo o valor fornecido. Se o valor for nulo,
		// lançará uma exceção NullPointerException.
		
		Optional<String> optionalValue = Optional.of("Hello");
		System.out.println(optionalValue.get());
	}
	
	public void test_2() {
		// Cria um Optional contendo o valor fornecido, mas permite que o valor seja nulo.
		
		String nullableValue = null;
		Optional<String> optionalValue = Optional.ofNullable(nullableValue);
		System.out.println(optionalValue.isPresent());
	}
	
	public void test_3() {
	    // Retorna um Optional vazio (sem valor).

	    Optional<String> optionalValue = Optional.empty();
	    System.out.println(optionalValue.isPresent());
	}
	
	public void test_4() {
	    // Verifica se o Optional contém um valor não nulo.

	    Optional<String> optionalValue = Optional.of("Hello");
	    System.out.println(optionalValue.isPresent());
	}
	
	public void test_5() {
	    // (A partir do Java 11): Verifica se o Optional está vazio (não contém um valor não nulo).

	    Optional<String> optionalValue = Optional.ofNullable(null);
	    System.out.println(optionalValue.isEmpty());
	}
	
	public void test_6() {
	    //Obtém o valor contido no Optional. Se o valor for nulo, lançará uma exceção NoSuchElementException.

	    Optional<String> optionalValue = Optional.of("Hello");
	    System.out.println(optionalValue.get());
	}
	
	public void test_7() {
	    //Obtém o valor contido no Optional, ou retorna um valor padrão se o Optional estiver vazio

	    Optional<String> optionalValue = Optional.ofNullable(null);
	    String result = optionalValue.orElse("Default"); 
	    System.out.println(result);
	}
	
	public void test_8() {
	    //Obtém o valor contido no Optional, ou retorna um valor fornecido por um Supplier se o Optional estiver vazio.

	    Optional<String> optionalValue = Optional.ofNullable(null);
	    String result = optionalValue.orElseGet(() -> "Value from Supplier");
	    System.out.println(result);
	}
	
	public void test_9() {
	    //Obtém o valor contido no Optional, ou lança uma exceção fornecida por um Supplier se o Optional estiver vazio.

	    Optional<String> optionalValue = Optional.ofNullable(null);
	    String result = optionalValue.orElseThrow(() -> new RuntimeException("Value not present"));
	}
	
	public void test_10() {
	    //Executa uma ação fornecida por um Consumer se o Optional contiver um valor.
	    
		Optional<String> optionalValue = Optional.of("Hello");
	    optionalValue.ifPresent(value -> System.out.println("Valor presente: " + value));
	}
	
	public static void main(String[] args) {
		ClassOptionalMethod method = new ClassOptionalMethod();
		
		int key = 5;
		
		switch (key) {
			case 1: {
				
				method.test_1();
				break;
			}
			
			
			case 2: {
				method.test_2();
				break;
			}
			
			case 3: {
				method.test_3();
				break;
			}
			
			case 4: {
				method.test_4();
				break;
			}
			
			case 5: {
				method.test_5();
				break;
			}
			
			case 6: {
				method.test_6();
				break;
			}
			
			case 7: {
				method.test_7();
				break;
			}
			
			case 8: {
				method.test_8();
				break;
			}
			
			case 9: {
				method.test_9();
				break;
			}
			
			case 10: {
				method.test_10();
				break;
			}
		}
		
	}
}
