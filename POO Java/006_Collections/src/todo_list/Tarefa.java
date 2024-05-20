package todo_list;

public class Tarefa {
	private String descricao;
	
	public Tarefa(String description) {
		this.descricao = description;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return "Tarefa{" + "'descricao='" + descricao + '\'' + "}";
	}
}
