package lista01_estrutura_de_decisao;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        System.out.println("\nQuanto você ganha por hora ? Quantas horas trabalhadas no mês: ");
        Scanner myObj = new Scanner(System.in);
        float ganhoPorH = myObj.nextFloat();
        float horas = myObj.nextFloat();
        double ganhoMes = ganhoPorH * horas;
        System.out.println("Você ganhará o valor de R$ " + ganhoMes);
    }
}
