public class Brackets {
    public int count(String s) {
        // TODO
    }

    public static void main(String[] args) {
        Brackets b = new Brackets();
        System.out.println(b.count("(()())")); // 0
        System.out.println(b.count(")))))")); // 5
        System.out.println(b.count("((())(")); // 2
        System.out.println(b.count("(()()())()()")); // 0
        System.out.println(b.count("))))))((((((")); // 12
    }
}
