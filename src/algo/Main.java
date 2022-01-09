package algo;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        final int MAXBOUND = 10000;
        List<Integer> array = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < MAXBOUND; i++) {
            array.add(rand.nextInt(MAXBOUND));
        }
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.listToTree(array);

        long startBinarySearchTree = System.nanoTime();
        binarySearchTree.infixDepthCourse(binarySearchTree.getRoot());
        long timeElapsedBinarySearchTree = System.nanoTime() - startBinarySearchTree;

        long start = System.nanoTime();
        Collections.sort(array);
        long timeElapsed = System.nanoTime() - start;

        System.out.println("Temps pour trier un arbre binaire de recherche: \t \t" + timeElapsedBinarySearchTree);
        System.out.println("Temps pour trier un tableau avec Collections.sort(): \t" + timeElapsed);
    }
}
