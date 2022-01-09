package algo;

public class Main {

    public static void main(String[] args) {
        int firstArray[] = {25, 40, 2, 65, 10};
        int secondArray[] = {10, 50, 1, 25, 35, 15};

        System.out.print("Tableau avant le tri par tas: \t");
        HeapSort.print(firstArray);
        HeapSort.sort(firstArray);

        System.out.print("Tableau après le tri par tas: \t");
        HeapSort.print(firstArray);

        System.out.print("\nTableau avant le tri par tas: \t");
        HeapSort.print(secondArray);
        HeapSort.sort(secondArray);

        System.out.print("Tableau après le tri par tas: \t");
        HeapSort.print(secondArray);
    }
}
