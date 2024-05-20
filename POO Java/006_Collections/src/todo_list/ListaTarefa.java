package todo_list;

import java.util.*;

public class ListaTarefa {
	private List<Tarefa> tarefaList;
	
	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		
		for(Tarefa T : tarefaList) {
			if(T.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(T);
			}
		}
		
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	public Integer obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricaoTarefas() {
		System.out.println(tarefaList);
	}
	
}
