package s04classesandobjects.s04sectionproject.refgabrielchaldu;

import utilities.ConsoleStyle;

import java.util.Scanner;

public class BankApp {
    private BankAccount bankAccount;
    private Scanner scanner;

    public BankApp(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        int option;
        do {
            displayMenu();
            option = getUserOption();
            proccessOption(option);
        } while (option != 4);
    }

    public void displayMenu() {
        System.out.println(ConsoleStyle.getBrightCyan("""
                \n Seleccionar opciones:
                1 - Dépositar dinero
                2 - Retirar dinero
                3 - Mostrar saldo
                4 - Salir
                """));
    }

    private int getUserOption() {
        return scanner.nextInt();
    }

    private void handleDeposit() {
        System.out.print(ConsoleStyle.getBrightMagenta("Ingrese el monto a depositar: "));
        double depositAmout = scanner.nextDouble();
        bankAccount.deposit(depositAmout);
    }

    private void handleWithdrawl() {
        System.out.print(ConsoleStyle.getBrightMagenta("Ingrese el monto a retirar: "));
        double withdrawAmount = scanner.nextDouble();
        bankAccount.withdraw(withdrawAmount);
    }

    private void proccessOption(int option) {
        switch (option) {
            case 1: {
               handleDeposit();
               break;
            }
            case 2: {
                handleWithdrawl();
                break;
            }
            case 3: {
                bankAccount.displayBalance();
                break;
            }
            case 4: {
                System.out.println(ConsoleStyle.getYellow("Gracias por utilizar la app"));
                break;
            }
            default: {
                System.out.println(ConsoleStyle.error("Opción incorrecta!"));
            }
        }
    }
}
