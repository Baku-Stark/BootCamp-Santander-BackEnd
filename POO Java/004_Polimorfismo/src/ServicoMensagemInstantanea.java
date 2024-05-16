public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	protected boolean validarConectadoInternet() {
		return true;
	}
	
	protected void salvarHistoricoInternet() {
		System.out.println("O histórico");
	}
}
