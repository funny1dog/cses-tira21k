public class Network {
    public Network(int n) {
        // TODO
    }

    public void addLink(int a, int b) {
        // TODO
    }

    public int bestRoute(int a, int b) {
        // TODO
    }

    public static void main(String[] args) {
        Network w = new Network(5);
        w.addLink(1,2);
        w.addLink(2,3);
        w.addLink(1,3);
        w.addLink(4,5);
        System.out.println(w.bestRoute(1,5)); // -1
        w.addLink(3,5);
        System.out.println(w.bestRoute(1,5)); // 2
    }
}
