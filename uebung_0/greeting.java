package hs_merseburg_se.uebung_0;
import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie ihren Namen ein: ");
        String name = scanner.nextLine();

        System.out.println("Hallo " + name + "!");

        scanner.close();
    }
}