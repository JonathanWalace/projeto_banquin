import entidade.Cliente;
import entidade.Conta;

class Main {
  public static void main(String[] args) {
    Cliente cliente = new Cliente();
		cliente.nome = "Otto";
		System.out.println("CLIENTE: " + cliente.nome);		
		

		Conta conta = new Conta(99991);
		System.out.println("CONTA: " + conta.getNumero() + " = R$ " + conta.getSaldo());		

		conta.creditar(1000);
		System.out.println("CONTA: " + conta.getNumero() + " = R$ " + conta.getSaldo());		

		conta.debitar(100);
    conta.debitar(200);
		System.out.println("CONTA: " + conta.getNumero() + " = R$ " + conta.getSaldo());		

    conta.debitar(1000);
		System.out.println("CONTA: " + conta.getNumero() + " = R$ " + conta.getSaldo());		

    conta.debitar(500);
		System.out.println("CONTA: " + conta.getNumero() + " = R$ " + conta.getSaldo());		

    

  }
}