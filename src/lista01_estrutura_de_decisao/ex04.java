package lista01_estrutura_de_decisao;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        float note1, note2, note3, note4;
        float media;

        Scanner myOwn = new Scanner(System.in);
        System.out.println("\nDigite as quatros notas bimestrais: ");
        note1 = myOwn.nextFloat();
        note2 = myOwn.nextFloat();
        note3 = myOwn.nextFloat();
        note4 = myOwn.nextFloat();
        media = (note1 + note2 + note3 + note4) / 4;

        System.out.println("Sua media bimestral foi : " + media);    }
}
