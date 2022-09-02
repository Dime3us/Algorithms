import java.util.*;

public class Homework4 {
    public static void main(String[] args) {
        int[] array = {7, 3, 5, 9, 4, 1};
        int[] sortedArray = {0, 1, 3, 6, 9};
        System.out.println(Arrays.toString(array));
        mergeSort(array, array.length);
        System.out.println(Arrays.toString(array));
        String string = "Dir Lhao";
        String string1 = "mty amkv!!!";
        System.out.println(mergeString(string, string1));
        System.out.println(missingElement(sortedArray, 1));
        System.out.println(missingElementOlogN(sortedArray, 1));
    }

    private static void mergeSort(int[] array, int length) {
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < length; i++) {
            right[i - mid] = array[i];
        }
        mergeSort(left, mid);
        mergeSort(right, length - mid);
        mergeArray(left, right, array);
    }

    private static void mergeArray(int[] one, int[] two, int[] array) {
        int indexOne = 0;
        int indexTwo = 0;
        for (int i = 0; i < array.length; i++) {
            if (indexOne < one.length && indexTwo < two.length) {
                int elementOne = one[indexOne];
                int elementTwo = two[indexTwo];
                if (elementOne > elementTwo) {
                    array[i] = elementOne;
                    indexOne++;
                } else {
                    array[i] = elementTwo;
                    indexTwo++;
                }
                continue;
            }
            if (indexOne < one.length) {
                array[i] = one[indexOne];
                indexOne++;
            }
            if (indexTwo < two.length) {
                array[i] = two[indexTwo];
                indexTwo++;
            }
        }

    }

    private static String mergeString(String a, String b) {
        String result = "";
        String temp = a.length() < b.length() ? b : a;
        for (int i = 0; i < temp.length(); i++) {
            if (i < a.length() && i < b.length()) {
                result += a.charAt(i);
                result += b.charAt(i);
                continue;
            }
            result += temp.charAt(i);
        }


        return result;
    }

    private static int missingElement(int[] array, int n) {

        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < array.length - 1; i++) {
            int result = array[i];

            while (result + 1 != array[i + 1]) {

                temp.add(result + 1);
                result++;
            }
        }
        System.out.println(temp);
        return temp.get(n - 1);
    }

    private static int missingElementOlogN(int[] array, int n) {

        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < array.length / 2; i++) {
            int result = array[i];
            int resultTail = array[array.length - 1 - i];
            while (result + 1 != array[i + 1]) {
                temp.add(result + 1);
                result++;
            }
            while (resultTail - 1 != array[array.length - 2 - i]) {
                temp.add(resultTail - 1);
                resultTail--;
            }

        }
        Collections.sort(temp);
        System.out.println(temp);
        return temp.get(n - 1);
    }

}
