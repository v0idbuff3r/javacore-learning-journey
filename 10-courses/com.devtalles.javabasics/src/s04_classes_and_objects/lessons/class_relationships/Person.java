package s04classesandobjects.s04lessons.relacionesentreclases;

public class Person {
    //relación de dependencia
    public void calculateSum(Calculator calculator) {
        int result = calculator.add(5,3);
        System.out.println("Suma = " + result);
    }
}
