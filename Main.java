import br.classe.Conta;

class Main {
  public static void main(String[] args) {
    // instanciação
    Conta c1 = new Conta();
    Conta c2 = new Conta();
    Conta c3 = new Conta();
    Conta c4 = c1;

    // Dot notation
    c1.numero = 1000;
    c1.titular = "Jackson";
    c1.saldo = 5000;
    
    c2.numero = 1001;
    c2.titular = "Carla";
    c2.saldo = 15000;
    
    c3.numero = 1001;
    c3.titular = "Carla";
    c3.saldo = 15000;

    System.out.println("Numero[c1]: " + c1.numero);
    System.out.println("titular[c1]: " + c1.titular);
    System.out.println("saldo[c1]: " + c1.saldo);

    System.out.println("\nNumero[c2]: " + c2.numero);
    System.out.println("titular[c2]: " + c2.titular);
    System.out.println("saldo[c2]: " + c2.saldo);

    System.out.println("\nNumero[c3]: " + c3.numero);
    System.out.println("titular[c3]: " + c3.titular);
    System.out.println("saldo[c3]: " + c3.saldo + "\n");

    System.out.println(c2 == c3);
    System.out.println(c2);
    System.out.println(c3 + "\n");

    System.out.println(c1 == c4);
    System.out.println(c1);
    System.out.println(c4 + "\n");

    c4.titular = "Marcio";
    System.out.println(c1.titular);
    System.out.println(c4.titular + "\n");

    // Deposito na conta c1

    c1.imprimirSaldo();

    c1.sacarSaldo(1000);
    c1.imprimirSaldo();

    c1.depositarSaldo(1500);
    c1.imprimirSaldo();

    c1.sacarSaldo(5000000);
    c1.imprimirSaldo();
    
  }
}