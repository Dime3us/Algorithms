public class Homework2 {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,30};
        System.out.println(arraySum(arr, arr.length));
        System.out.println(maxArrayElement(arr,arr.length));
    }

    public static int arraySum(int[] array, int a) {
        {
            if (a == 0)
                return 0;
            return (arraySum(array, a - 1) + array[a - 1]);
        }
    }

    public static int maxArrayElement(int[] array, int a) {
        if (a==0)
            return 0;
        if(a == 1)
            return array[0];

        return Math.max(array[a-1], maxArrayElement(array, a-1));
    }

}


//    First level: Задача 1. Дан массив, вычислить рекурсивно сумму всех элементов этого массива. Итоговую сумму вывести в консоль.
//
//
//        Second level: Задача 1. Дан массив, написать рекурсивный метод нахождения максимального элемента в этом массиве.
//        Максимальное число вывести в консоль.