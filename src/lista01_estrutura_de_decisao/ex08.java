package lista01_estrutura_de_decisao;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        System.out.println("\nQuanto você ganha por hora ? Quantas horas trabalhadas no mês? ");
        Scanner perNon = new Scanner(System.in);

        float ganhoPorH = perNon.nextFloat();
        float horas = perNon.nextFloat();
        double ganhoMes = ganhoPorH * horas;

        System.out.println("Você ganhará o valor de R$ " + ganhoMes);
    }
}
