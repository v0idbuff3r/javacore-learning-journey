package s03languagefundamentals.s03lessons.methods;

public class RecursiveMethod {
    static int sumTo(int n) {
        if(n>0) {
            return n + sumTo(n - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int sum = sumTo(4);
        System.out.println("Sumatoria: " + sum);
    }
}
