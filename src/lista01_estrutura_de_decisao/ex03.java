package lista01_estrutura_de_decisao;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        int numb1, numb2, sum;

        Scanner myOwn = new Scanner(System.in);
        System.out.println("\nInsira o primeiro número: ");
        numb1 = myOwn.nextInt();

        System.out.println("\nInsira a segunda nota: ");
        numb2 = myOwn.nextInt();

        sum = numb1 + numb2;
        System.out.println("A soma dos dois números foi: " + sum);
    }
}
