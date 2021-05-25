package lista01_estrutura_de_decisao;

import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        int numI1 = 0;
        int numI2 = 0;
        int numR = 0;

        System.out.println("\nDigite o primeiro número Inteiro: ");
        Scanner myObj = new Scanner(System.in);
        numI1 = myObj . nextInt();
        System.out.println("\nDigite o segundo número Inteiro: ");
        numI2 = myObj.nextInt();

        do {
            System.out.println("\nDigite o número Real: ");
            numR = myObj.nextInt();
            if (numR < 0){
                System.out.println ("(O número real é sempre positivo)"  );
            }
        }while (numR < 0);

        System.out.println("a: " + (numI1 * 2 * (numI2 / 2)));
        System.out.println("b: " + ((numI1 * 3) + numR));
        System.out.println("c: " + (numR * numR));

    }
}
