package lista01_estrutura_de_decisao;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        System.out.println("\nDigite a altura do quadrado: ");
        Scanner myObj = new Scanner(System.in);
        float altura = myObj.nextFloat();
        double areaQuad = 2 * (altura * altura);
        System.out.println("O dobro da altura do quadrado é: " + areaQuad);
    }
}
