public class Homework1 {

    public static void main(String[] args) {
        String[] lastNameList = {"Smirnov", "Ivanov", "Kuznecov", "Sokolov", "Popov", "Lebedev", "Kozlov", "Novikov", "Morozov", "Petrov", "Volkov", "Solovev", "Vasilev", "Zaicev", "Pavlov"};
        bubbleSort(lastNameList);
        System.out.println();
        selectionSort(lastNameList);

        // write your code here
    }

    public static void bubbleSort(String[] sort_arr) {

        String temp;
        System.out.println("Strings in sorted order:");
        for (int j = 0; j < sort_arr.length; j++) {
            for (int i = j + 1; i < sort_arr.length; i++) {

                if (sort_arr[i].compareTo(sort_arr[j]) < 0) {
                    temp = sort_arr[j];
                    sort_arr[j] = sort_arr[i];
                    sort_arr[i] = temp;
                }
            }
            System.out.println(j + " - " + sort_arr[j]);
        }
    }
    public static void selectionSort(String[] sort_arr) {
        for (int i = 0; i < sort_arr.length; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < sort_arr.length; j++) {
                if (sort_arr[minElementIndex].compareTo(sort_arr[j]) > 0) {
                    minElementIndex = j;
                }
            }


            String temp = sort_arr[i];
            sort_arr[i] = sort_arr[minElementIndex];
            sort_arr[minElementIndex] = temp;

            System.out.println(i + " - " + sort_arr[i]);
        }
    }
}

