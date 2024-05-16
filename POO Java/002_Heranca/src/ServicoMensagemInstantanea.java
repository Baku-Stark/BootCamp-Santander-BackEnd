public class ServicoMensagemInstantanea {
	private boolean validarConectadoInternet() {
		return true;
	}
	
	private void salvarHistoricoInternet() {
		System.out.println("O histórico");
	}
	
	public void enviarMensagem() {
		String result = (validarConectadoInternet()) ? "O usuário enviou uma mensagem" : "[Sem conexão] O usuário não pode enviar uma mensagem";
		salvarHistoricoInternet();
		System.out.println(result);
	}
	
	public void receberMensagem() {
		String result = (validarConectadoInternet()) ? "O usuário recebeu uma mensagem" : "[Sem conexão]";
		salvarHistoricoInternet();
		System.out.println(result);
	}
}
