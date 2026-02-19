package s03languagefundamentals.s03lessons;

public class ConstansPractice {
    public static void main(String[] args) {
        final double TAX_RATE = 0.10;
        int grossSalary = 3000;
        double netSalary = grossSalary * (1 - TAX_RATE);

        System.out.println("Salario Neto = " + netSalary);
        
    }
}
