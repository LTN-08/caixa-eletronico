import java.util.Scanner;

public class Saque {
    public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema de saque do Lukinha ;)");

        var saldo = 800;

        System.out.println("Digite seu nome: ");
        var nome = leitor.nextLine();

        System.out.println("Digite o valor a ser sacado: ");
        var valor = leitor.nextInt();

        if (valor > 1000){
            System.out.println("Olá " + nome + "! O saque de " + valor + " não pode ser realizado: Valor máximo que pode ser sacado é R$1000,00");
        } else if (valor < 10) {
            System.out.println("Olá " + nome + "! O saque de " + valor + " não pode ser realizado: Valor mínimo que pode ser sacado é R$10,00");
        } else if (valor % 10 != 0) {
            System.out.println("Olá " + nome + "! O saque de " + valor + " não pode ser realizado: cédulas disponiveis: R$10, R$20, R$50 e R$100");
        } else if (valor > saldo) {
            System.out.println("Olá " + nome + "! O saque de " + valor + " não pode ser realizado: Saldo insuficiente!");
        } else {
            System.out.println("Olá " + nome + "! O saque de " + valor + " foi realizado com sucesso!");
        }
    }
}


