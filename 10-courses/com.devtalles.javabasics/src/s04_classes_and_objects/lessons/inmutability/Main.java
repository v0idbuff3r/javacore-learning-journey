package s04classesandobjects.s04lessons.inmutabilidad;

public class Main {
    public static void main(String[] args) {
        House house = new House(2,4,23);
        System.out.println("house.getSize() = " + house.getSize());

        House house1 = new House(2,4,23);
        System.out.println("house.getWindows() = " + house1.getWindows());
        System.out.println(house==house1);
        System.out.println(house.equals(house1));
    }
}
