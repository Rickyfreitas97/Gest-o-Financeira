package ProjetoControleFinanceiro.Test;

import ProjetoControleFinanceiro.Dominio.Gasto;

import java.util.Scanner;

public class ControleFinanceiroTest {

    public static void main(String[] args) {

        Gasto gasto = new Gasto();
        Gasto gasto2 = new Gasto();
        Gasto gasto3 = new Gasto();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu salário:");
        double salario = scanner.nextDouble();

        System.out.println("digite seu limite de gastos: ");
        double limite = scanner.nextDouble();

        gasto.descricao = "Cartão de crédito";
        gasto.valor = 700;

        gasto2.descricao = "Aluguel";
        gasto2.valor = 400;

        gasto3.descricao = "Lazer";
        gasto3.valor = 300;

        double totalGastos = gasto.valor + gasto2.valor + gasto3.valor;

        double saldo = salario - totalGastos;

        System.out.println("\n===== RESUMO =====");

        System.out.println("\nSalário: " + salario);

        System.out.println("-----------------------");
        System.out.println(gasto.descricao);
        System.out.println(gasto.valor);

        System.out.println("-----------------------");
        System.out.println(gasto2.descricao);
        System.out.println(gasto2.valor);

        System.out.println("-----------------------");
        System.out.println(gasto3.descricao);
        System.out.println(gasto3.valor);

        System.out.println("Total de gastos: " + totalGastos);

        System.out.println("Saldo restante: " + saldo);

        if (totalGastos >= limite) {

            System.out.println("Você atingiu o limite de gastos!");

        } else {

            double restanteSaldo = limite - totalGastos;

            System.out.println("Você ainda pode gastar: " + restanteSaldo);

        }

        scanner.close();
    }
}
