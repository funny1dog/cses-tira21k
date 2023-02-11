public class Components {
    public Components(int n) {
        // TODO
    }

    public void addRoad(int a, int b) {
        // TODO
    }

    public int count() {
        // TODO
    }

    public static void main(String[] args) {
        Components c = new Components(5);
        System.out.println(c.count()); // 5
        c.addRoad(1,2);
        c.addRoad(1,3);
        System.out.println(c.count()); // 3
        c.addRoad(2,3);
        System.out.println(c.count()); // 3
        c.addRoad(4,5);
        System.out.println(c.count()); // 2
    }
}
