public class GraphGame {
    public GraphGame(int n) {
        // TODO
    }

    public void addLink(int a, int b) {
        // TODO
    }

    public boolean winning(int x) {
        // TODO
    }

    public static void main(String[] args) {
        GraphGame g = new GraphGame(6);
        g.addLink(3,4);
        g.addLink(1,4);
        g.addLink(4,5);
        System.out.println(g.winning(3)); // false
        System.out.println(g.winning(1)); // false
        g.addLink(3,1);
        g.addLink(4,6);
        g.addLink(6,5);
        System.out.println(g.winning(3)); // true
        System.out.println(g.winning(1)); // false
        System.out.println(g.winning(2)); // false
    }
}
