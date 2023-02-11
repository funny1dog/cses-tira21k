public class Lisp {
    public long eval(String s) {
        // TODO
    }

    public static void main(String[] args) {
        Lisp l = new Lisp();
        System.out.println(l.eval("(+ 1 2 3 4 5)")); // 15
        System.out.println(l.eval("(+ 5 (* 3 2) 7)")); // 18
        System.out.println(l.eval("(* (+ (+ 1 2) 3) (+ (* 4 5) 6 2))")); // 168
        System.out.println(l.eval("(+ 123 456)")); // 579
    }
}
