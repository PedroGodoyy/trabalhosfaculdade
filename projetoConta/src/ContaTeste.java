import java.util.Scanner;

public class ContaTeste {

    static Conta conta = new Conta();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        int deposito = 0;
        do {
            System.out.println("---MENU---");
            System.out.println("1- cadastrar");
            System.out.println("2- depositar");
            System.out.println("3- sacar");
            System.out.println("4- consultar");
            System.out.println("9- sair");
            System.out.println("Digite uma opção: ");

            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao){
                case 1:
                    execCadastrar();
                    break;
                case 2:
                    execDepositar();
                    deposito = 1;
                    break;
                case 3:
                    if(deposito == 1){
                        execSacar();
                    }else{
                        System.out.println("Primeiro você deve realizar um depósito!");
                    }
                    break;
                case 4:
                    execConsultar();
                    break;
                case 9:
                    opcao = 9;
                    break;
                default:
                    System.out.println("Opção inválida!!");
                    break;
            }
        }while(opcao!=9);
    }

    public static void execCadastrar(){
        System.out.println("Digite o número da conta: ");
        conta.setConta(scanner.nextLine());
        System.out.println("Digite a agência: ");
        conta.setAgencia(scanner.nextLine());
        System.out.println("Digite o nome do cliente: ");
        conta.setNomeCliente(scanner.nextLine());
    }

    public static void execConsultar(){
        conta.imprimir();
    }

    public static void execSacar(){
        System.out.println("Digite um valor para saque: ");
        int saque = conta.sacar(Double.parseDouble(scanner.nextLine()));
        if (saque == 1) {
            System.out.println("Saque realizado!");
        }else{
            System.out.println("Saque não realizado!");
        }
    }

    public static void execDepositar(){
        System.out.println("Digite um valor para depósito: ");
        conta.depositar(Double.parseDouble(scanner.nextLine()));
    }
}