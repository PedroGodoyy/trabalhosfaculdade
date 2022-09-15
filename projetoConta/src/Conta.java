public class Conta {
    private String conta;
    private String agencia;
    private double saldo;
    private String nomeCliente;

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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public int sacar(double valor){
        if(getSaldo() == 0){
            return 0;
        }else if(getSaldo() >= valor){
            setSaldo(getSaldo()- valor);
            return 1;
        }else{
            return 0;
        }
    }
    public void depositar(double valor){
        setSaldo(getSaldo()+valor);
    }
    public void imprimir() {
        System.out.println("nomeCliente = " + nomeCliente);
        System.out.println("conta = " + conta);
        System.out.println("agencia = " + agencia);
        System.out.println("saldo = " + saldo);
    }
}
