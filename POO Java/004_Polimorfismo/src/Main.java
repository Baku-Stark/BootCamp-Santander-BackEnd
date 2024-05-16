public class Main {
	public static void main(String[] args) {
		ServicoMensagemInstantanea smi = null;
		String app = "tlg";
		
		if(app.equals("msn")) {
			smi = new MSNMessager();
		}
		
		else if(app.equals("fcb")) {
			smi = new FacebookMessager();
		}
		
		else if(app.equals("tlg")) {
			smi = new Telegram();
		}
		
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}
