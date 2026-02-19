package s03languagefundamentals.s03sectionproject.medavid;

import java.util.Scanner;

public class GradeCalculator {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         byte userAge = 0;
         float mathsCalification = 0.0f;
         float spanishCalification = 0.0f;
         float chemistryCalification = 0.0f;
         float average = 0.0f;

         while(true) {

             System.out.println("**************************************");
             System.out.println("******Calculadora de Aprobado*********");
             System.out.println("**************************************");

             System.out.print("Ingrese su nombre: ");
             String userName = sc.nextLine();
             System.out.print("Ingrese su edad: ");
             userAge = sc.nextByte();
             System.out.println("Ingrese las calificaciones de cada materia a continuación:");
             System.out.print("Matemáticas: ");
             mathsCalification = sc.nextFloat();
             System.out.print("Español: ");
             spanishCalification = sc.nextFloat();
             System.out.print("Química: ");
             chemistryCalification = sc.nextFloat();

             average = (mathsCalification + spanishCalification + chemistryCalification) / 3;
             boolean hasPassedGrade = (average >= 6.0);

             if(hasPassedGrade) {
                 System.out.println("El alumno " + userName.toUpperCase() + " con " + userAge + " años de edad.");
                 System.out.println("Tiene un promedio de " + average);
                 System.out.println("FELICIDADES HAS PASADO DE GRADO!");
             } else if(!hasPassedGrade) {
                 System.out.println("El alumno " + userName.toUpperCase() + " con " + userAge + " años de edad.");
                 System.out.println("Tiene un promedio de " + average);
                 System.out.println("Lo sentimo no ha pasado de grado. Esfuerzate y estudia más para los exámenes");
                 System.out.println("TU PUEDES!");
             } else {
                 System.err.println("ERROR!");
                 System.err.println("Verifique su información. Ingrese sus datos de manera correcta");
             }

             System.out.println("average = " + average);
             System.out.println("hasPassedGrade = " + hasPassedGrade);
             System.out.print("Si desea repetir el proceso ingrese 1: ");
             System.out.println("Scanner valor: " + sc.hasNextInt());
             int exitLoop = sc.nextInt();
             if (exitLoop == 0) {
                 sc.close();
                 break;
             }
             sc.nextLine();
         }

     }
}
