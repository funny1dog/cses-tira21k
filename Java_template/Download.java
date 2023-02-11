public class Download {
    public Download(int n) {
        // TODO
    }

    public void addLink(int a, int b, int x) {
        // TODO
    }

    public int calculate(int a, int b) {
        // TODO
    }

    public static void main(String[] args) {
        Download d = new Download(4);
        System.out.println(d.calculate(1,4)); // 0
        d.addLink(1,2,5);
        d.addLink(2,4,6);
        d.addLink(1,4,2);
        System.out.println(d.calculate(1,4)); // 7
        d.addLink(1,3,4);
        d.addLink(3,2,2);
        System.out.println(d.calculate(1,4)); // 8
    }
}
