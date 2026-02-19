package s03languagefundamentals.s03lessons.scannerexample.medavid;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int firstNumber = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int secondNumber = sc.nextInt();
        sc.close();

        int sum = (firstNumber + secondNumber);
        int difference = (firstNumber - secondNumber);
        boolean isBigger = (firstNumber > secondNumber);

        //System.out.println("");
        System.out.println("\n========CALCULADORA SIMPLE==============");
        System.out.println("La suma del primer y segundo número es:" + sum);
        System.out.println("La diferencia entre el primer y segundo número es: "  + difference);

        System.out.println("\n*******COMPARACIÓN SIMPLE************");
        if (isBigger) {
            System.out.println("El primer número es mayor!");
        } else {
            System.out.println("El segundo número es mayor o igual!");
        }

        System.err.println("\nFin de la aplicación.");
    }
}
