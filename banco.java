import java.util.Scanner;

public class banco {
    float saldo = 3234.67f;
    float credito = 20000;
    float emprestimo = 15000;
    float divida = 0;



  
    public void escolha() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n ========= ESCOLHA QUAL OPÇÃO DESEJA REALIZAR: ============\n");
            System.out.println("\n 1 - CONSULTAR SALDO");
            System.out.println("\n 2 - DEPÓSITO" );
            System.out.println("\n 3 - SAQUE" );
            System.out.println("\n 4 - EMPRÉSTIMO" );
            System.out.println("\n 5 - MOSTRAR QUANTIDADE DE DIVIDA");
            System.out.println("\n 6 - PAGAMENTO DE DÍVIDA");
            System.out.println("\n 7 - SAIR");
            System.out.println("\n ========= ESCOLHA QUAL OPÇÃO DESEJADA....>\n");
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Saldo: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor do depósito: ");
                    float deposito = scanner.nextFloat();
                    saldo = saldo + deposito;
                    System.out.println("Saldo: " + saldo);
                    break;
                case 3:
                    System.out.println("Digite o valor do saque: ");
                    float saque = scanner.nextFloat();
                    saldo = saldo - saque;
                    System.out.println("Saldo: " + saldo);
                    break;
                case 4:
                    System.out.println("Digite o valor do empréstimo: ");
                    float emprestimoValor = scanner.nextFloat();
                    saldo = saldo + emprestimoValor;
                    divida = divida + emprestimoValor;
                    System.out.println("Saldo: " + saldo);
              case 5:
                    System.out.println("Divida: " + divida);
                    break;
                case 6: 
                    System.out.println("\n VALOR ATUAL DA DÍVIDA: " + divida);
                    System.out.println("Digite o valor da dívida a ser paga: ");
                    float dividaValor = scanner.nextFloat();
                    saldo = saldo - dividaValor;
                    divida = divida - dividaValor;
                    System.out.println("Novo Saldo: " + saldo);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 6);
        scanner.close(); 
    }
}
