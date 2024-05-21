package Pesquisa;
import java.util.*;

public class SomaNumeros {
	public static void main(String[] args) {
		boolean opc = true;
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> numerosLista = new ArrayList<Integer>();
		
		do {
			System.out.println("Digite um número para adicionar na lista: ");
			String numero = scanner.nextLine();
			
			switch (numero) {
			case "q": {
				opc = false;
				break;
			}
			
			default:
				adicionarNumero(numerosLista, Integer.parseInt(numero));
				break;
			}
				
		} while (opc);
		
		System.out.println("=+=+==+=+==+=+=");
		calcularSoma(numerosLista);
		encontrarMaiorNumero(numerosLista);
		encontrarMenorNumero(numerosLista);
		exibirNumeros(numerosLista);
		System.out.println("=+=+==+=+==+=+=");
		scanner.close();
	}
	
	public static void adicionarNumero(ArrayList<Integer> numerosLista, int numero) {
		numerosLista.add(numero);
	}
	
	public static void calcularSoma(ArrayList<Integer> numerosLista) {
		int somaTodosNumeros = 0;
		
		for(Integer num : numerosLista) {
			somaTodosNumeros += num;
		}
		
		System.out.println("A soma de todos os números da lista é: " + somaTodosNumeros);
	}
	
	public static void encontrarMaiorNumero(ArrayList<Integer> numerosLista) {
		int maiorNumero = 0;
		
		for(Integer num : numerosLista) {
			if(num > maiorNumero) {maiorNumero = num;}
		}
		System.out.println("O MAIOR número da lista é: " + maiorNumero);
	}
	
	public static void encontrarMenorNumero(ArrayList<Integer> numerosLista) {
		int menorNumero = numerosLista.get(0);
		
		for(Integer num : numerosLista) {
			if(num < menorNumero) {
				menorNumero = num;
			}
		}
		System.out.println("O MENOR número da lista é: " + menorNumero);
	}
	
	public static void exibirNumeros(ArrayList<Integer> numerosLista) {
		System.out.println("Todos os números da sua lista: " + numerosLista);
	}
}
