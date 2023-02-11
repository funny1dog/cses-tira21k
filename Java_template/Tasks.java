public class Tasks {
    public void add(String name, int priority) {
        // TODO
    }

    public String next() {
        // TODO
    }

    public static void main(String[] args) {
        Tasks t = new Tasks();
        t.add("siivous",10);
        t.add("ulkoilu",50);
        t.add("opiskelu",50);
        System.out.println(t.next()); // opiskelu
        t.add("treffit",100);
        System.out.println(t.next()); // treffit
        System.out.println(t.next()); // ulkoilu
    }
}
