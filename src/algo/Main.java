package algo;
import java.util.*;

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

        System.out.println("Hauteur de la racine de l'arbre binaire de recherche: " + BinarySearchNode.getHeight(binarySearchTree.getRoot()));
        System.out.println("Facteur d'equilibrage de la racine de l'arbre binaire de recherche: " + BinarySearchNode.balanceFactor(binarySearchTree.getRoot()));
        System.out.println("Cet arbre est un arbre equilibre ? " + binarySearchTree.isBalanceTree());
    }
}
