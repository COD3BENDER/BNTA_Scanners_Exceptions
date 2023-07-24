package ScannerDemo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // if you want to take in  data use scanner

        System.out.println("Please enter your name: ");

        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        System.out.println("Whats your favourite number ?: ");

        int number = scanner.nextInt();

        System.out.println("I like " + number + " too!");

    }
}
