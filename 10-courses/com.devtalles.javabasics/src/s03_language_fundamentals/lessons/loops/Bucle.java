package s03languagefundamentals.s03lessons.loops;

public class Bucle {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i);
        }

        int counter = 0;
        int acumulator = 0;
        while (counter < 5) {
            System.out.println("Counter: " + counter);
            counter++;
            acumulator += counter;
        }
        System.out.println("Acumulador sumatoria:" + acumulator);

        int counter2 = 0;
        do {
            System.out.println("Counte 2: " + counter2);
            counter2++;
        } while (counter2 < 5);
    }
}
