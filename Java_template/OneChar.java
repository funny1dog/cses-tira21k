public class OneChar {
    public long count(String s) {
        // TODO
    }

    public static void main(String[] args) {
        OneChar o = new OneChar();
        System.out.println(o.count("aaa")); // 6
        System.out.println(o.count("abbbcaa")); // 11
        System.out.println(o.count("abcde")); // 5
    }
}
