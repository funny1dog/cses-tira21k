public class AllPlaces {
    public AllPlaces(int n) {
        // TODO
    }

    public void addRoute(int a, int b) {
        // TODO
    }

    public boolean check() {
        // TODO
    }

    public static void main(String[] args) {
        AllPlaces a = new AllPlaces(5);
        a.addRoute(1,2);
        a.addRoute(1,3);
        a.addRoute(2,3);
        a.addRoute(2,4);
        System.out.println(a.check()); // false
        a.addRoute(2,5);
        System.out.println(a.check()); // false
        a.addRoute(3,1);
        System.out.println(a.check()); // false
        a.addRoute(5,4);
        System.out.println(a.check()); // true
    }
}
