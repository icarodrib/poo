/* package br.classe; */

public class Conta{
  // Nodificador de acesso 
  // (altera a visibilidade dos membros de uma classe)
  // [+] public  >>> Qualquer classe pode acessar
  // [-] private >>> Apenas a propria classe pode acessar
  // [#] protect >>> Apenas as classes filhas e do mesmo pacote podem acessar
  //     default >>> Apenas as classes do mesmo pacote podem acessar
  
  // propriedades (membros)
  public int numero;
  public String titular;
  public double saldo;
  
  
  // comportamentos [Função] (membros)
  // podem ter ou não um retorno
  // podem ter ou não parametros
  public void imprimirSaldo(){
    System.out.println("Saldo: R$:" + saldo);
  }

  public boolean sacarSaldo(double valor){
    if(valor <= saldo && valor > 0){
      saldo = saldo - valor;
      System.out.println("Saque efetuado.");
      return true;
    }else{
      System.out.println("Valor inválido.");
      return false;
    }
  }

  public boolean depositarSaldo(double valor){
    if(valor > 0){
      saldo = saldo + valor;
      System.out.println("Deposito efetuado.");
      return true;
    }else{
      System.out.println("Valor inválido.");
      return false;
    }
  }
}