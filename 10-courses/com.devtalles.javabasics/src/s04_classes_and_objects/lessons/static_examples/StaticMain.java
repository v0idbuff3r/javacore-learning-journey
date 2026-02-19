package s04classesandobjects.s04lessons.staticexamples;

public class StaticMain {
    static String appnName;

    static {
        appnName = "Mi app en Java";
        System.out.println("appnName = " + appnName);
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        counter.showCount();
        counter3.showCount();

        int result = MathUtils.square(5);
        System.out.println("result = " + result);
    }
}
