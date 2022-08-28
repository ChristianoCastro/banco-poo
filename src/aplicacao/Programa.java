package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Conta;

public class Programa {

    public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;

		System.out.print("Numero da conta: ");
		int number = sc.nextInt();
		System.out.print("Titular da conta: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Existe um deposito inicial (s/n)? ");
		char response = sc.next().charAt(0);
		if (response == 's') {
			System.out.print("Insira o valor do deposito: ");
			double initialDeposit = sc.nextDouble();
			conta = new Conta(number, holder, initialDeposit);
		}
		else {
			conta = new Conta(number, holder);
		}
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Insira o valor do deposito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Dados atualizados da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Informe o valor do saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Dados atualizados da conta:");
		System.out.println(conta);
		
		sc.close();
	}
    
}