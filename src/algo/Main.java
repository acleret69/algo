package algo;

import java.util.*;

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

        System.out.println("Parcours pour l'arbre de l'exercice 1");
        System.out.print("Parcours en largeur: \t\t\t\t");
        Tree.widthCourse(tree.getRoot());
        System.out.print("\nParcours en profondeur prefixe: \t");
        Tree.prefixDepthCourse(tree.getRoot(), new ArrayList<>());
        System.out.print("\nParcours en profondeur suffixe: \t");
        Tree.postfixDepthCourse(tree.getRoot(), new ArrayList<>());

        BinaryNode<Integer> i20 = new BinaryNode<>(20);
        BinaryNode<Integer> i5 = i20.setLeftChild(new BinaryNode<>(5));
        BinaryNode<Integer> i25 = i20.setRightChild(new BinaryNode<>(25));
        BinaryNode<Integer> i3 = i5.setLeftChild(new BinaryNode<>(3));
        BinaryNode<Integer> i12 = i5.setRightChild(new BinaryNode<>(12));
        BinaryNode<Integer> i21 = i25.setLeftChild(new BinaryNode<>(21));
        BinaryNode<Integer> i28 = i25.setRightChild(new BinaryNode<>(28));
        BinaryNode<Integer> i8 = i12.setLeftChild(new BinaryNode<>(8));
        BinaryNode<Integer> i13 = i12.setRightChild(new BinaryNode<>(13));
        BinaryNode<Integer> i6 = i8.setLeftChild(new BinaryNode<>(6));
        BinaryTree binaryTree = new BinaryTree(i20);

        System.out.println("\nParcours pour l'arbre de l'exercice 2");
        System.out.print("Parcours en largeur: \t\t\t\t");
        BinaryTree.widthCourse(binaryTree.getRoot());
        System.out.print("\nParcours en profondeur prefixe: \t");
        System.out.println(binaryTree.prefixDepthCourse(binaryTree.getRoot()));
        System.out.print("Parcours en profondeur suffixe: \t");
        System.out.println(binaryTree.postfixDepthCourse(binaryTree.getRoot()));
        System.out.print("Parcours en profondeur infixe: \t\t");
        System.out.println(binaryTree.infixDepthCourse(binaryTree.getRoot()));
    }
}
 