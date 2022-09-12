public class Conta {
    private String conta, agencia, nomeCliente;
    private double saldo;

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String cliente) {
        nomeCliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int sacar(double valor){
        if(getSaldo() > 0 || getSaldo() > valor){
            setSaldo(getSaldo()-valor);
            return 1;
        }else{
            return 0;
        }
    }

    public void depositar(double valor){
        setSaldo(getSaldo()+valor);
    }

    public void imprimir(){
        System.out.println("conta = " + conta);
        System.out.println("agencia = " + agencia);
        System.out.println("Cliente = " + nomeCliente);
        System.out.println("saldo = " + saldo);
    }

}
