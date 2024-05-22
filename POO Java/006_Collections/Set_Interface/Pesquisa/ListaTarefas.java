package Pesquisa;

import java.util.*;

class Tarefa {
	String descricao;
	boolean concluida;
	
	public Tarefa(String descricao) {
		this.descricao = descricao;
		this.concluida = false;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public boolean isConcluida() {
	    return concluida;
	  }
	
	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}
	
	public boolean getConcluida() {
		return concluida;
	}
	
	 @Override
	  public String toString() {
	    return "Tarefa{" +
	        "descricao='" + descricao + '\'' +
	        ", concluida=" + concluida +
	        '}';
	  }
}


public class ListaTarefas {
	private Set<Tarefa> tarefasSet;

	  public ListaTarefas() {
	    this.tarefasSet = new HashSet<>();
	  }
	  
	  public void adicionarNovaTarefa(String descricao) {
		  tarefasSet.add(new Tarefa(descricao));
		  System.out.println(descricao + " -> Adicionada com sucesso na lista");
	  }
	  
	  public void exibirTarefas(){
		  System.out.println("= TAREFAS " + "{Qtd: " + tarefasSet.size() + "} =");
		  System.out.println(tarefasSet);
		  System.out.println("===============================");
	  }
	  
	  public void removerTarefa(String descricao) {
		    Tarefa tarefaParaRemover = null;
		    if (!tarefasSet.isEmpty()) {
		      for (Tarefa t : tarefasSet) {
		        if (t.getDescricao().equalsIgnoreCase(descricao)) {
		          tarefaParaRemover = t;
		          break;
		        }
		      }
		      tarefasSet.remove(tarefaParaRemover);
		      System.out.println(descricao + " -> Removida com sucesso na lista");
		    }
		    
		    else {
		      System.out.println("O conjunto está vazio");
		    }

		    if(tarefaParaRemover == null) {
		      System.out.println("Tarefa não encontrada!");
		    }
	  }
	  
	  public Set<Tarefa> obterTarefasPendentes() {
		  Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
		    for (Tarefa t : tarefasSet) {
		      if (!t.isConcluida()) {
		        tarefasNaoConcluidas.add(t);
		      }
		    }
		    return tarefasNaoConcluidas;
		  }

		  public void marcarTarefaConcluida(String descricao) {
		    for (Tarefa t : tarefasSet) {
		      if (t.getDescricao().equalsIgnoreCase(descricao)) {
		        t.setConcluida(true);
		      }
		    }
		  }
	  
	  public Set<Tarefa> pesquisarPorDescricao(String descricao) {
		    Set<Tarefa> tarefasPorNome = new HashSet<>();
		    
		    if (!tarefasSet.isEmpty()) {
		      
		    	for (Tarefa tarefa : tarefasSet) {
		    		
			        if (tarefa.getDescricao().startsWith(descricao)) {
			        	tarefasPorNome.add(tarefa);
			        }
		      }
		    	
		      return tarefasPorNome;
		    }
		    
		    else {
		      throw new RuntimeException("O conjunto está vazio!");
		    }
	}

	
	public static void main(String[] args) {
		ListaTarefas listaTarefas = new ListaTarefas();
		
		listaTarefas.adicionarNovaTarefa("Lavar o corolla com lava fervente");
		listaTarefas.adicionarNovaTarefa("Apagar o Java da existência");
		listaTarefas.adicionarNovaTarefa("Ligar para um alien");
		
		listaTarefas.removerTarefa("Apagar o Java da existência");
		
		listaTarefas.adicionarNovaTarefa("Apagar o Java da existência");
		
		listaTarefas.marcarTarefaConcluida("Apagar o Java da existência");
		
		System.out.println(listaTarefas.pesquisarPorDescricao("Ligar para um alien"));

		System.out.println("Tarefas pendentes....");
		System.out.println(listaTarefas.obterTarefasPendentes());
		
		listaTarefas.exibirTarefas();
		
	}
}
