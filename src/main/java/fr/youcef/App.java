package fr.youcef;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("combien vous gagnez par an ?");
        int argentparan = clavier.nextInt();
        System.out.print(" Depuis combien de temps travaillez vous ?");
        int travail = clavier.nextInt();
        clavier.close();

        if ((argentparan >= 30000) && (travail >= 730)) {
            System.out.print("Bravo vous avez obtenu votre pret");

        } else {
            System.out.print("Vous ne pouvez pas obtenir pret");

        }

    }
}