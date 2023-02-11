public class FindTree {
    public int count(Node node1, Node node2) {
        // TODO
    }

    public static void main(String[] args) {
        FindTree f = new FindTree();
        Node tree1 = new Node(new Node(null,null),
                              new Node(null,null));
        Node tree2 = new Node(null,
                              new Node(new Node(null,null),
                                       new Node(null,null)));
        System.out.println(f.count(tree1,tree2)); // 1
    }
}
