package s04classesandobjects.s04sectionproject.medavid;

import s04classesandobjects.s04sectionproject.refgabrielchaldu.BankApp;
import utilities.ConsoleStyle;

import java.util.Scanner;

//TODO: Extraer toda la lógica de la app en una clase intermedia, hacer el main más limpio.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount(0.0);

        while (true) {
            userMenu();
            int menuOption = sc.nextInt();
            if (menuOption == 0) {
               System.out.println(ConsoleStyle.getYellow("Saliendo del programa. Gracias por su visita!"));
               break;
            }
            bankAccount = bankAccountOperations(menuOption, sc, bankAccount);
        }
        sc.close();
        System.out.println(ConsoleStyle.getYellow("***Fin del programa!***"));
    }

    public static void userMenu() {
        System.out.print(ConsoleStyle.getBrightCyan("""
                ¿Qué operación desea realizar? 
                Inserte el número que corresponda a la operación deseada:
                0. Salir del programa.
                1. Crear cuenta bancaria.
                2. Consultar el saldo de su cuenta.
                3. Depositar saldo en su cuenta.
                4. Retirar dinero de su cuenta.
                """));
        System.out.print(ConsoleStyle.getBrightGreen("-> "));
    }

    public static BankAccount bankAccountOperations(int menuOption, Scanner sc, BankAccount bankAccount) {
        switch (menuOption) {
            case 1:
                return BankAccount.create(readAmount(ConsoleStyle.getBrightMagenta("Inserte el monto deseado inicial para su cuenta: "), sc));
            case 2:
                printBalance(bankAccount);
                break;
            case 3:
                bankAccount.deposit(readAmount(ConsoleStyle.getBrightMagenta("Ingrese el monto a depositar: "), sc));
                break;
            case 4:
                tryWithdraw(bankAccount, sc);
                break;
            default:
                System.out.println(ConsoleStyle.warn("""
                            Ingrese un número natural de operación que sea correcto,
                            que sea un número natural y que se corresponda con los del menú.
                            """));
        }
        System.out.println();
        return bankAccount;
    }

    public static void printBalance(BankAccount bankAccount){
        System.out.println(ConsoleStyle.getBrightMagenta("El saldo actual en su cuenta es: ") + bankAccount.getBalance());
    }

    public static double readAmount(String message, Scanner sc){
        System.out.print(message);
        return sc.nextDouble();
    }

    public static void tryWithdraw(BankAccount bankAccount, Scanner sc){
       boolean withdrawSucceeded = bankAccount.withdraw(readAmount(ConsoleStyle.getBrightMagenta("Ingrese el monto a retirar de su cuenta: "), sc));
       if (!withdrawSucceeded) {
           System.out.println(ConsoleStyle.error("Saldo insuficiente, compruebe el monto disponible en su cuenta!"));
       }
    }

    public static void tryDeposit(BankAccount bankAccount, Scanner sc) {
        boolean depositSucceeded = bankAccount.deposit(readAmount(ConsoleStyle.getBrightMagenta("Ingrese el monto a depositar: "), sc));
       if(!depositSucceeded) {
           System.out.println(ConsoleStyle.warn("Monto a depositar incorrecto, el monto tiene que ser mayor a 0!"));
       }
    }
}
