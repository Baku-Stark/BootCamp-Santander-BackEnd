public class Main {
	public static void main(String[] args) {
		MSNMessager msn = new MSNMessager();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		FacebookMessager fcb = new FacebookMessager();
		fcb.enviarMensagem();
		fcb.receberMensagem();
		
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}
}
