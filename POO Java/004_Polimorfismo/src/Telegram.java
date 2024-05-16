public class Telegram extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		System.out.println("=== Telegram ===");
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