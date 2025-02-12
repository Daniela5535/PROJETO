import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("*****************************");
            System.out.println("*    Escolha a opção        *");
            System.out.println("*****************************");
            System.out.println("* 1. Próximo número         *");
            System.out.println("* 2. Juntar nome e apelido  *");
            System.out.println("* 3. Maior número           *");
            System.out.println("* 4. Soma dos números       *");
            System.out.println("* 5. Média dos números      *");
            System.out.println("* 0. Sair                   *");
            System.out.println("*****************************");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número: ");
                    int num = scanner.nextInt();
                    System.out.println("Número Seguinte: " + MathHelper.NumSeguinte(num));
                    break;

                case 2:
                    System.out.print("Escreva o seu nome: ");
                    String nome = scanner.next();
                    System.out.print("Escreva o seu apelido: ");
                    String apelido = scanner.next();
                    System.out.println("Nome completo: " + MathHelper.JuntNome(nome, apelido));
                    break;

                case 3:
                    System.out.print("Quantos números pretende inserir? ");
                    int qtdNum = scanner.nextInt();
                    int[] numeros = new int[qtdNum];

                    for (int i = 0; i < qtdNum; i++) {
                        System.out.print("Número " + (i + 1) + ": ");
                        numeros[i] = scanner.nextInt();
                    }

                    System.out.println("Maior número: " + MathHelper.maior(numeros));
                    break;

                case 4:
                    System.out.print("Quantos números pretende inserir? ");
                    qtdNum = scanner.nextInt();
                    int[] numerosSoma = new int[qtdNum];

                    for (int i = 0; i < qtdNum; i++) {
                        System.out.print("Número " + (i + 1) + ": ");
                        numerosSoma[i] = scanner.nextInt();
                    }

                    System.out.println("Soma dos números: " + MathHelper.soma(numerosSoma));
                    break;

                case 5:
                    System.out.print("Quantos números pretende inserir? ");
                    qtdNum = scanner.nextInt();
                    double[] numerosMedia = new double[qtdNum];

                    for (int i = 0; i < qtdNum; i++) {
                        System.out.print("Número " + (i + 1) + ": ");
                        numerosMedia[i] = scanner.nextDouble();
                    }

                    System.out.println("Média dos números: " + MathHelper.media(numerosMedia));
                    break;

                case 0:
                    System.out.println("Obrigada por utilizar o programa!.");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
