public class Ball {
    public Ball(int n) {
        // TODO
    }

    public void addPair(int a, int b) {
        // TODO
    }

    public int calculate() {
        // TODO
    }

    public static void main(String[] args) {
        Ball b = new Ball(4);
        System.out.println(b.calculate()); // 0
        b.addPair(1,2);
        System.out.println(b.calculate()); // 1
        b.addPair(1,3);
        b.addPair(3,2);
        System.out.println(b.calculate()); // 2
    }
}
