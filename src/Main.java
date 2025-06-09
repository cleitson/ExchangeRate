import br.com.exchangeRate.api.RequestApi;
import br.com.exchangeRate.conversor.Converte;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double amount;
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);
        Converte converte = new Converte();

        while (opcao != 9) {
            System.out.println("##############################################################");
            System.out.println("Bem vindo ao conversor de moedas");

            System.out.println("1- Dolar =>> Real Brasileiro");
            System.out.println("2- Real Brasileiro =>> Dolar");
            System.out.println("3- Dolar =>> Peso argentino");
            System.out.println("4- Peso argentino =>> Dolar");
            System.out.println("5- Dolar =>> Euro");
            System.out.println("6- Euro =>> Dolar");
            System.out.println("7- Outras moedas");


            System.out.println("9- Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Qual o valor a converter?");
                    amount = scanner.nextDouble();
                    System.out.println(converte.converterMoeda("usd", "brl", amount));
                    break;
                case 2:
                    System.out.println("Qual o valor a converter?");
                    amount = scanner.nextDouble();
                    System.out.println(converte.converterMoeda("brl", "usd", amount));
                    break;
                case 3:
                    System.out.println("Qual o valor a converter?");
                    amount = scanner.nextDouble();
                    System.out.println(converte.converterMoeda("usd", "ars", amount));
                    break;
                case 4:
                    System.out.println("Qual o valor a converter?");
                    amount = scanner.nextDouble();
                    System.out.println(converte.converterMoeda("ars", "usd", amount));
                    break;
                case 5:
                    System.out.println("Qual o valor a converter?");
                    amount = scanner.nextDouble();
                    System.out.println(converte.converterMoeda("usd", "eur", amount));
                    break;
                case 6:
                    System.out.println("Qual o valor a converter?");
                    amount = scanner.nextDouble();
                    System.out.println(converte.converterMoeda("eur", "usd", amount));
                    break;
                case 7:
                    System.out.println("Outras moedas: para converter em outras moedas e necessario informar a moeda origem, o destino e valor");
                    System.out.println("Moeda origem (ex.: USD): ");
                    String base = scanner.nextLine();
                    System.out.println("Moeda destino (ex.: BRL): ");
                    String target = scanner.nextLine();
                    System.out.println("Qual o valor a converter?");
                    amount = scanner.nextDouble();
                    System.out.println(converte.converterMoeda(base, target, amount));
                    break;
                case 9:
                    System.out.println("Saindo...");
                    opcao = 9;
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }

    }
}