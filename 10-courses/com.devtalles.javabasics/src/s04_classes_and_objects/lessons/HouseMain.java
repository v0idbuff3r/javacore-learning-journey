package s04classesandobjects.s04lessons;

public class HouseMain {
    public static void main(String[] args) {
        House myHouse = new House();
        myHouse.setDoors(2);
        myHouse.setWindows(4);
        myHouse.setSize(10);

        House myHouse2 = new House(4, 6, 20);

        System.out.println("La cantidad de puertas de la casa es: " + myHouse2.getDoors());
        myHouse2.openDoor();
        System.out.println("El área de la casa es: " + myHouse2.calculateArea());
    }
}
