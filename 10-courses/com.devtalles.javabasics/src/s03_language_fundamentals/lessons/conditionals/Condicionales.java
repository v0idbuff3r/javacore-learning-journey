package s03languagefundamentals.s03lessons.conditionals;

public class Condicionales {
    public static void main(String[] args) {

        // Buenas práticas a continuación código reutilizable
        int age = 19;
        double average = 7.5;

        boolean isAdult = age>16;
        boolean hasPassingGrade = average>=7;

        /*
        * Es una buena práctica porque al crear booleans puedo cambiar solo el valor de los boolean o de las
        * variables y ya automáticamente todo el código es reutilizable, no necesito cambiar cada línea de
        * de manera manual.
         */
        if(isAdult && hasPassingGrade) {
            System.out.println("El estudiante cumple con todos los requisitos");
        }

        if (!isAdult) {
            System.out.println("Es un adulto");
        }

        /* Mala Práctica - Tener código no reutilizable o que sea difícil de reutilizar.
        * Cómo en el ejemplo de abajo
        int age = 10;

        if (age>18) {
            System.out.println("Es mayor a 18");
        } else if (age <= 0) {
            System.out.println("No es válido");
        } else {
            System.out.println("Es menor a 18");
        }*/

        /*
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("El dato ingresado no es válido");
        }*/
    }
}
