public class ContaPJ extends Employee ContaBancaria {

    private final String CNPJ;
    private double saldo;
    private String senha;
   
    public ContaPJ (String cliente, String agencia,
            String conta,String tipoConta, String CNPJ, double saldo, String senha){
    super(cliente,agencia,conta,tipoConta);
    
    public Double getCNPJ() {return CNPJ;}
    public Double getsaldo() {return saldo;}
    public Double getsenha() {return senha;}

    this.CNPJ = CNPJ;


}
public void setSenha(String senha) {
		
    this.senha = senha;
}
}
