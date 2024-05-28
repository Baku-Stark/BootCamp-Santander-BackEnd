public abstract class Conta implements IConta {
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente clientes;
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.clientes = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	protected void imprimirInfos() {
		System.out.println(String.format("=== Titular '%s' ===", clientes.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo --- $%.2f", this.saldo));
	}

	@Override
	public void sacar(double valor) {
		if(valor < saldo) {
			saldo -= valor;
			System.out.println(String.format("[-] Você realizou um saque de $%.2f em sua conta!", valor));
		}
		
		else {
			System.out.println("[x] O valor de saque é maior que o saldo.");
		}
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		System.out.println(String.format("[-] Você deposiou $%.2f em sua conta!", valor));
	}

	@Override
	public void transferir(double valor, Conta destino) {
		if(valor < saldo) {
			this.sacar(valor);
			destino.depositar(valor);
			
			System.out.println("[-] Você transferiu $" + valor + " para " + destino + "!");
		}
		
		else {
			System.out.println("[x] O valor de saque é maior que o saldo.");
		}
	}
}
