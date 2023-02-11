public class TwoChar {
    public long count(String s) {
        // TODO
    }

    public static void main(String[] args) {
        TwoChar t = new TwoChar();
        System.out.println(t.count("aaaa")); // 0
        System.out.println(t.count("abab")); // 6
        System.out.println(t.count("aabacba")); // 8
        System.out.println(t.count("abacaadbaacaa")); // 21
    }
}
