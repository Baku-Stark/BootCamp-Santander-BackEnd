package OperacoesBasicas;

import java.util.*;

public class Desafio {
	private Set<String> palavrasUnicas;
	
	public Desafio() {
		this.palavrasUnicas = new HashSet<String>();
	}
	
	public void adicionarPalavra(String palavra) {
		// === ADICIONANDO UMA STRING NO SET
		palavrasUnicas.add(palavra);
		System.out.println("== '" + palavra + "' foi adicionado com sucesso! ==");
	}
	
	public void apagarPalavra(String palavra) {
		// === APAGANDO UMA STRING NO SET
		if(palavrasUnicas.contains(palavra)) {
			palavrasUnicas.remove(palavra);
		}
		
		else {
			System.out.println("[Apagando] Esta palavra não existe dentro do set");
		}
	}
	
	public boolean verificarPalavra(String palavra) {
		// === VERIFICAR SE POSSUI DETERMINADO ITEM NO SET
		return palavrasUnicas.contains(palavra);
	}
	
	public void exibirPalavras() {
		// === EXIBIND TODOS OS ITENS DO SET
		if(!palavrasUnicas.isEmpty()) {
			System.out.println(palavrasUnicas);
		}
		
		else {
			System.out.println("O conjunto está vazio");
		}
	}
	
	public static void main(String[] args) {
		Desafio linguagensUnicas = new Desafio();
		
		linguagensUnicas.adicionarPalavra("Python");
		linguagensUnicas.adicionarPalavra("Rust");
		linguagensUnicas.adicionarPalavra("TypeScript");
		linguagensUnicas.adicionarPalavra("Java");
		
		linguagensUnicas.exibirPalavras();
		
		
		if(linguagensUnicas.verificarPalavra("Python")) {
			System.out.println("Palavra existe dentro do set");
		}
		
		else {
			System.out.println("Palavra não existe dentro do set");
		}
		
		
		linguagensUnicas.apagarPalavra("Java");
		
		linguagensUnicas.exibirPalavras();
		
	}
}
