import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome para registro\nr: ");
		String nome_cliente = scanner.nextLine();
		System.out.println();
		
		
		System.out.println(String.format(
				"=== SEJA BEM-VINDO AO $BANCO CENTRAL$, %s",
				nome_cliente
			)
		);
		Cliente cliente = new Cliente();
		cliente.setNome(nome_cliente);
		Conta contaCorrente = new ContaCorrente(cliente);
		Conta contaPoupanca = new ContaPoupanca(cliente);
		
		loop: while(true) {
			
			System.out.println("Escolha uma das opções abaixo");
			System.out.println("[ 1  ] Depositar");
			System.out.println("[ 2  ] Saque");
			System.out.println("[ 3  ] Transferir");
			System.out.println("[ 4  ] Mostrar Extratos");
			System.out.println("[ 5+ ] Sair");
			System.out.println("===================================");
			System.out.println("Opção: ");
			int escolha = scanner.nextInt();
			System.out.println();
			
			switch (escolha) {
			case 1: {
				System.out.println("Valor para depósito? $");
				double valor = scanner.nextDouble();
				contaCorrente.depositar(valor);
				break;
			}
			
			case 2:{
				System.out.println("Valor para saque? $");
				double valor = scanner.nextDouble();
				contaCorrente.sacar(valor);
				break;
			}
			
			case 3: {
				System.out.println("Valor para transferência? $");
				double valor = scanner.nextDouble();
				contaCorrente.transferir(valor, contaPoupanca);
				break;
			}
			
			case 4:{
				contaCorrente.imprimirExtrato();
				contaPoupanca.imprimirExtrato();
				break;
			}
			
			default:
				break loop;
			}
		}
		
		scanner.close();
		System.out.println("App Encerrado!");
	}
}
