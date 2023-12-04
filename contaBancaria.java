public abstract class contaBancaria {

    private final String cliente;
    private final String agencia;
    private final String conta;
    private final String tipoConta;

public ContaBancaria(String cliente, String agencia, String conta, String tipoConta) {

this.cliente = cliente;
this.agencia = agencia;
this.conta = conta;
this.tipoConta = tipoConta;
}

public String getcliente() {return cliente;}
public String getAgencia() {return agencia;}
public String getConta() {return conta;}
public String getTipoConta() {return tipoConta;}

@Override
public String toString() {
    return String.format("%s, %s%Conta: %s, %s",
     getcliente(), getAgencia(), getConta(), getTipoConta());

}

public abstract double saldo();

}