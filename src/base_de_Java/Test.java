package base_de_Java;
import java.util.Scanner;

public class Test {

    static Scanner sc = new Scanner(System.in);
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double moyenne(int... valeurs) {
        int total = 0;
        for (int v : valeurs) {
            total += v;
        }
        return (double) total / valeurs.length;
    }

    public static int maximum(int... valeurs) {
        int max = valeurs[0];
        for (int v : valeurs) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println("=== MENU PRINCIPAL ===");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Moyenne");
        System.out.println("4. Trouver le plus grand");
        System.out.println("0. Quitter");

        int choix;

        do {
            System.out.print("Choisissez une option : ");
            choix = sc.nextInt();

        } while (choix != 0);
    }
}