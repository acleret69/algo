package algo;

public class Main {

    public static void main(String[] args) {
        Node<String> A = new Node<>("a");

        Node<String> B = A.addChild(new Node<>("b"));
        Node<String> C = A.addChild(new Node<>("c"));
        Node<String> D = A.addChild(new Node<>("d"));

        Node<String> E = B.addChild(new Node<>("e"));
        Node<String> F = B.addChild(new Node<>("f"));

        Node<String> G = D.addChild(new Node<>("g"));
        Node<String> H = D.addChild(new Node<>("h"));
        Node<String> I = D.addChild(new Node<>("i"));

        Node<String> J = E.addChild(new Node<>("j"));
        Node<String> K = E.addChild(new Node<>("k"));
        Node<String> L = E.addChild(new Node<>("l"));

        Node<String> M = G.addChild(new Node<>("m"));
        Node<String> N = I.addChild(new Node<>("n"));
        Node<String> O = I.addChild(new Node<>("o"));

        Node<String> P = M.addChild(new Node<>("p"));
        Tree tree = new Tree(A);

        Tree.print(tree.getRoot(), "-");
    }
}
