public class BestRoute {
    public BestRoute(int n) {
        // TODO
    }

    public void addRoad(int a, int b, int x) {
        // TODO
    }

    public int findRoute(int a, int b) {
        // TODO
    }

    public static void main(String[] args) {
        BestRoute b = new BestRoute(3);
        b.addRoad(1,2,2);
        System.out.println(b.findRoute(1,3)); // -1
        b.addRoad(1,3,5);
        System.out.println(b.findRoute(1,3)); // 5
        b.addRoad(2,3,1);
        System.out.println(b.findRoute(1,3)); // 3
    }
}
