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

            int indexPivot = getIndexPivotMiddle(array, start, end, 6);
            quickSort(array, start, indexPivot - 1);
            quickSort(array, indexPivot + 1, end);

        }
    }

    private static int getIndexPivot(int[] array, int start, int end, int index) {
        int mid = start + (end - start) / 2;
        int pivot = array[mid];
        int indexPivot = start;

        for (int i = start; i < end; i++) {
            if (array[i] <= pivot) {
                swap(array, indexPivot, i);
                indexPivot++;
            }
        }
        swap(array, indexPivot, end);

        return indexPivot;

    }

    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    private static int getIndexPivotMiddle(int[] array, int start, int end, int index) {
        int mid = start + (end - start) / 2;
        int pivot = array[mid];
        int indexPivot = mid;   //index 0
        while (start < end) {
            while ((array[start] < pivot)) {
                start++;
            }
            while ((array[end] > pivot)) {
                end--;
            }
            if (start <= end) {
                swap(array, start, end);
                if (end == indexPivot) {
                    indexPivot = start;
                } else if (start == indexPivot) {
                    indexPivot = end;
                }
                start++;
                end--;
            }
        }

        if(start < indexPivot && array[start] > array[indexPivot]){
            swap(array,indexPivot,start);
            indexPivot = start;
        } else if (end > indexPivot && array[end] < array[indexPivot]) {
            swap(array,indexPivot, end);
            indexPivot = end;
        }
        return indexPivot;
    }
}