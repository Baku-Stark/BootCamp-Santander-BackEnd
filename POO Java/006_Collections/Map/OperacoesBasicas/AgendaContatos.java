package OperacoesBasicas;

import java.util.*;

public class AgendaContatos {
	private Map<String, String> agendaContatosMap;
	
	public AgendaContatos() {
		this.agendaContatosMap = new HashMap<>();
	}
	
	public void exibirAgendaContatos() {
		if(!agendaContatosMap.isEmpty()) {			
			System.out.println(agendaContatosMap);
		}
		
		else {
			System.out.println("A agenda de contatos está VAZIA.");
		}
	}
	
	public void adicionarContato(String nome, String telefone) {
		agendaContatosMap.put(nome, telefone);
	}
	
	public void excluiContatoPorNome(String nome) {
		if(!agendaContatosMap.isEmpty()) {
			agendaContatosMap.remove(nome);
		}
		
		else {			
			System.out.println("Este contato não exista na sua lista.");
		}
	}
	
	public String pesquisarPorNome(String nome) {
		String contato = "";
		
		if(!agendaContatosMap.isEmpty()) {
			contato = "Wallace" + " - Contato: " + agendaContatosMap.get(nome);
		}
		
		else {
			contato = "Não foi possível encontrar essa pessoa na sua agenda";
		}
		
		return contato;
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.adicionarContato("Wallace", "123456789");
		agendaContatos.adicionarContato("Satoru Gojo", "987654321");
		agendaContatos.adicionarContato("Roronoa Zoro", "123789456");
		
		agendaContatos.excluiContatoPorNome("Roronoa Zoro");
		
		agendaContatos.exibirAgendaContatos();
		
		System.out.println(agendaContatos.pesquisarPorNome("Wallace"));
	}
}
