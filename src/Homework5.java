import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework5 {

    public static void main(String[] args) {
        int[] worstСase = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //Pivot must be either a greater or lesser element of the list. Sorted Array

        int[] array = {34, 56, 22, 78, 9, 3, 5, 100};
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }

    private static void quickSort(int[] array, int start, int end) {
        if (start < end) {

            int indexPivot = getIndexPivot(array, start, end, 6);
            quickSort(array, start, indexPivot - 1);
            quickSort(array, indexPivot + 1, end);

        }
    }

    private static int getIndexPivot(int[] array, int start, int end, int index) {
        int pivot = array[index];
        int indexPivot = start;
        System.out.println(indexPivot);
        System.out.println(Arrays.toString(array));
        for (int i = start; i < end; i++) {
            if (array[i] <= pivot) {
                swap(array, indexPivot, i);
                indexPivot++;
                System.out.println(indexPivot);
                System.out.println("в форе");
            }
            System.out.println(Arrays.toString(array));
        }
        swap(array, indexPivot, end);

        return indexPivot;

    }

    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }


}
