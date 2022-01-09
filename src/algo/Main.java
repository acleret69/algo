package algo;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(new BinarySearchNode(20));
        binarySearchTree.insert(new BinarySearchNode(5));
        binarySearchTree.insert(new BinarySearchNode(25));
        binarySearchTree.insert(new BinarySearchNode(3));
        binarySearchTree.insert(new BinarySearchNode(12));
        binarySearchTree.insert(new BinarySearchNode(21));
        binarySearchTree.insert(new BinarySearchNode(28));
        binarySearchTree.insert(new BinarySearchNode(8));
        binarySearchTree.insert(new BinarySearchNode(13));
        binarySearchTree.insert(new BinarySearchNode(6));

        System.out.println("Arbre binaire de recherche initial");
        BinarySearchTree.print(binarySearchTree.getRoot(), "-");

        binarySearchTree.insert(new BinarySearchNode(50));
        binarySearchTree.insert(new BinarySearchNode(5));
        binarySearchTree.insert(new BinarySearchNode(25));
        binarySearchTree.insert(new BinarySearchNode(19));


        System.out.println("\nArbre binaire de recherche après insertion");
        BinarySearchTree.print(binarySearchTree.getRoot(), "-");

        System.out.println("Parcours en profondeur infixe: \t" + binarySearchTree.infixDepthCourse(binarySearchTree.getRoot()));
    }
}
