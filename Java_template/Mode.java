public class Mode {
    public int add(int x) {
        // TODO
    }

    public static void main(String[] args) {
        Mode m = new Mode();
        System.out.println(m.add(1)); // 1
        System.out.println(m.add(2)); // 1
        System.out.println(m.add(2)); // 2
        System.out.println(m.add(1)); // 1
        System.out.println(m.add(3)); // 1
        System.out.println(m.add(3)); // 1
        System.out.println(m.add(3)); // 3
    }
}
