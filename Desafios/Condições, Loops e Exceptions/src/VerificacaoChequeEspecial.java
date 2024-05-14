import java.util.Scanner;

public class VerificacaoChequeEspecial { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        double saldo = scanner.nextDouble(); 
        double saque = scanner.nextDouble(); 
        
        //double saldo = 2500; 
        //double saque = 2750; 
        
        double limiteChequeEspecial = 500; 

        // TODO: Verifique se o saque não ultrapassa o saldo disponível na conta:
        if(saque < saldo && saque < limiteChequeEspecial) {
            // TODO: Verifique se o saque ultrapassa o limite do cheque especial, mas não o saldo total disponível:
        	System.out.println("Transacao realizada com sucesso.");
        }
        
        // Se o saque ultrapassar tanto o saldo disponível quanto o limite do cheque especial
        else{
        	limiteChequeEspecial += saldo;
        	
        	if(saque > limiteChequeEspecial) {        		
        		System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        	}
        	
        	else {
        		System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        	}
        	
        	
        }

		// Fechamos o objeto Scanner para liberar os recursos:
        scanner.close(); 
    }
}