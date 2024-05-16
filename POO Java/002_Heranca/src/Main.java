public class Main {
	public static void main(String[] args) {
		MSNMessager msn = new MSNMessager();
		
		System.out.println("=== MSN ===");
		msn.enviarMensagem();
		msn.receberMensagem();
		
		FacebookMessager fcb = new FacebookMessager();
		System.out.println("=== Facebook ===");
		fcb.enviarMensagem();
		fcb.receberMensagem();
		
		Telegram tlg = new Telegram();
		System.out.println("=== Telegram ===");
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}
}
