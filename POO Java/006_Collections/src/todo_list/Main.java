package todo_list;

public class Main {
	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		
		listaTarefa.adicionarTarefa("Nova tarefa 1");
		listaTarefa.adicionarTarefa("Nova tarefa 2");
		listaTarefa.adicionarTarefa("Nova tarefa 3");
		
		listaTarefa.removerTarefa("Nova tarefa 1");
		
		listaTarefa.obterDescricaoTarefas();
		
		System.out.println("Quantidade de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
	}
}
