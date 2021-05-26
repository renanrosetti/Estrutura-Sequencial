package lista01_estrutura_de_decisao;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        System.out.println("Temperatura em Fahrenheit: ");
        Scanner myOwn = new Scanner(System.in);

        float tempFah = myOwn.nextFloat();
        float tempCels = 5 * ((tempFah - 32) / 9);

        System.out.println("Temperatura em graus Celsius: " + tempCels);
    }
}
