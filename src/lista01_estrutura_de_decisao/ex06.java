package lista01_estrutura_de_decisao;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        System.out.println("\nDigite o raio do círculo: ");
        Scanner myOwn = new Scanner(System.in);

        float raio = myOwn.nextFloat();.
        float pi = 3.14f;
        float areaDoCirc = pi * (raio * raio);

        System.out.println("A soma da área do círculo é: " + areaDoCirc);
    }
}
