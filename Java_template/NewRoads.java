public class NewRoads {
    public NewRoads(int n) {
        // TODO
    }

    public void addRoad(int a, int b, int x) {
        // TODO
    }

    public int minCost() {
        // TODO
    }

    public static void main(String[] args) {
        NewRoads n = new NewRoads(4);
        n.addRoad(1,2,2);
        n.addRoad(1,3,5);
        System.out.println(n.minCost()); // -1
        n.addRoad(3,4,4);
        System.out.println(n.minCost()); // 11
        n.addRoad(2,3,1);
        System.out.println(n.minCost()); // 7
    }
}
