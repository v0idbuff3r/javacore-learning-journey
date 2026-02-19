package s03languagefundamentals.s03lessons.scannerexample;

import java.util.Scanner;

public class SimpleCalculator {
    // NumberCompare Refactor

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = getNumber("Ingrese el primer número: ", scanner);
        int secondNumber = getNumber("Ingrese el segundo número: ", scanner);

        printArithmeticOperations(firstNumber, secondNumber);
        numberCompare(firstNumber, secondNumber);

        scanner.close();
    }

    public static int getNumber(String message, Scanner scanner) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public static void printArithmeticOperations(int firstNumber, int secondNumber) {
        System.out.println("La suma de "+firstNumber+" + " +secondNumber+ " = " + (firstNumber + secondNumber));
        System.out.println("La diferencia de "+firstNumber+" - "+secondNumber+" = " + (firstNumber - secondNumber));
    }

    public static void numberCompare(int firstNumber, int secondNumber) {
        if(firstNumber==secondNumber) {
            System.out.println("Los dos números son iguales.");
        } else if(firstNumber>secondNumber) {
            System.out.println("El primer número es mayor que el segundo.");
        }else{
            System.out.println("El segundo número es mayor que el primero.");
        }
        System.out.println("Fin de la app");
    }
}
