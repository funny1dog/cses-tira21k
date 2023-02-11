public class Lucky {
    public boolean check(int n) {
        // TODO
    }

    public static void main(String[] args) {
        Lucky l = new Lucky();
        System.out.println(l.check(14)); // false
        System.out.println(l.check(16)); // true
        System.out.println(l.check(123)); // false
        System.out.println(l.check(777)); // true
        System.out.println(l.check(9999999)); // true
    }
}
