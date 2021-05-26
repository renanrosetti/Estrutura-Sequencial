package lista01_estrutura_de_decisao;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        System.out.println("\nDigite a distância em metros para ser comvertida em centímetros: ");
        Scanner myOwn = new Scanner(System.in);

        float metros = myOwn.nextFloat();
        float cent = metros * 100;

        System.out.println("A distância em metros é: " + cent);
    }
}
