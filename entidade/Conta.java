package entidade;

public class Conta{
  private int numero;
  private double saldo;

  public Conta(int numero) {

    this.numero = numero; //This obrigatório | Retorno meu número
    this.saldo=0;
  }

  public int getNumero(){
    return this.numero; //This opcional | Retorno meu número
  }

  public double getSaldo(){
    return this.saldo; //This opcional | Retorno meu saldo
  }

  public void creditar(double v){
    this.saldo = this.saldo + v;
  }

  public void debitar(double v){
    this.saldo = this.saldo - v;

    if (this.saldo < 0){
      this.saldo = this.saldo - 10;
    }
  
  }  

}
