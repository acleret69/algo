package algo;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        array = Arrays.asList(10, 5, 12, 2, 7, 15, 4, 17);
        binarySearchTree.listToTree(array);
        BinarySearchTree.print(binarySearchTree.getRoot().getRightChild(), "-");
        System.out.println("Facteur d'equilibrage du fils droit de la racine avant rotation simple gauche: " + BinarySearchNode.balanceFactor(binarySearchTree.getRoot().getRightChild()) + "\n");

        BinarySearchTree.print(BinarySearchNode.simpleLeftRotate(binarySearchTree.getRoot().getRightChild()), "-");
        System.out.println("Facteur d'equilibrage du fils droit de la racine après rotation simple gauche: " + BinarySearchNode.balanceFactor(BinarySearchNode.simpleLeftRotate(binarySearchTree.getRoot().getRightChild())));
    }
}
