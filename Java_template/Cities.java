public class Cities {
    public Cities(int n) {
        // TODO
    }

    public void addRoad(int a, int b) {
        // TODO
    }

    public boolean hasRoute(int a, int b) {
        // TODO
    }

    public static void main(String[] args) {
        Cities c = new Cities(5);
        c.addRoad(1,2);
        c.addRoad(1,3);
        c.addRoad(4,5);
        System.out.println(c.hasRoute(1,5)); // false
        c.addRoad(3,4);
        System.out.println(c.hasRoute(1,5)); // true
    }
}
