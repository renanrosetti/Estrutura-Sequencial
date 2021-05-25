package lista01_estrutura_de_decisao;

import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        System.out.println("Temperatura em graus celsius: ");
        Scanner myObj = new Scanner(System.in);
        float tempCels = myObj.nextFloat();
        float tempFah = (tempCels * 9 / 5) + 32;
        System.out.println("Temperatura em Fahrenheit: " + tempFah);
        //Wwww
    }
}
