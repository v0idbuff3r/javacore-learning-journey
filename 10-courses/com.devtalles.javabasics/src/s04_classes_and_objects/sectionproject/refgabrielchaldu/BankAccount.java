package s04classesandobjects.s04sectionproject.refgabrielchaldu;

import utilities.ConsoleStyle;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount>0){
            balance+=amount;
            System.out.println(ConsoleStyle.ok("Depósito exitoso!!!"));
        } else {
            System.out.println(ConsoleStyle.warn("El monto ingresado no es correcto."));
        }
    }

    public void withdraw(double amount) {
        if(amount>0 && amount<=balance) {
            balance-=amount;
            System.out.println(ConsoleStyle.ok("Extracción éxitosa!!!"));
        } else {
            System.out.println(ConsoleStyle.warn("Fondos insuficientes o monto inválido."));
        }
    }

    public void displayBalance() {
        System.out.println(ConsoleStyle.getBrightMagenta("Saldo: " + balance));
    }
}
