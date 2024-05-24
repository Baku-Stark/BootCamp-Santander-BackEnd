package FunctionalInterface;

import java.util.List;
import java.util.stream.*;

public class SupplierMethod {
	public void main(String[] args) {
		List<String> listaSaudacao = Stream.generate(
				() -> {
					return "Hello, Wallace!";
				}
			)
			.limit(5)
			.collect(Collectors.toList());
		
		listaSaudacao.forEach(System.out::println);
	}
}
