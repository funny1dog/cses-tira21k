public class SameLevel {
    public int count(Node node, int level) {
        // TODO
    }

    public static void main(String[] args) {
        SameLevel s = new SameLevel();
        Node tree = new Node(null,
                             new Node(new Node(null,null),
                                      new Node(null,null)));
        System.out.println(s.count(tree,1)); // 1
        System.out.println(s.count(tree,2)); // 1
        System.out.println(s.count(tree,3)); // 2
        System.out.println(s.count(tree,4)); // 0
    }
}
