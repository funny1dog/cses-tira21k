public class BothSame {
    public long count(String s) {
        // TODO
    }

    public static void main(String[] args) {
        BothSame b = new BothSame();
        System.out.println(b.count("aaa")); // 6
        System.out.println(b.count("abcd")); // 4
        System.out.println(b.count("ababca")); // 10
    }
}
