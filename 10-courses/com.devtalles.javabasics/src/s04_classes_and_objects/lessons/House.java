package s04classesandobjects.s04lessons;

public class House {
    private int doors;
    private int windows;
    private double size;

    public House() {}

    public House(int doors, int windows, double size) {
        this.doors = doors;
        this.windows = windows;
        this.size = size;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getWindows() {
        return windows;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    void openDoor() {
        System.out.println("La puerta esta abierta");
    }

    double calculateArea() {
        return size*size;
    }
}
