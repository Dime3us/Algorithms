package Homework6;

import java.util.*;

public class App {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        System.out.println(dynamicArray);
        dynamicArray.add(2);
        System.out.println(dynamicArray);
        dynamicArray.add(3);
        System.out.println(dynamicArray);
        dynamicArray.add(8);
        System.out.println(dynamicArray);
        dynamicArray.add(4);
        System.out.println(dynamicArray);
        dynamicArray.add(6);
        System.out.println(dynamicArray);
//        System.out.println(dynamicArray.get(4));
//        System.out.println(dynamicArray.contains(5));
//        System.out.println(dynamicArray.isEmpty());
//        dynamicArray.clear();
//        System.out.println(dynamicArray.isEmpty());
//        dynamicArray.addAt(3, 10);
//        System.out.println(dynamicArray);
//        dynamicArray.removeAt(3);
//        System.out.println(dynamicArray);
//        System.out.println();
//        long d = new Date().getTime();
//        DynamicArray array = new DynamicArray();
//        addBillionArray(array);
//        long e = new Date().getTime();
//        System.out.println("Время выполнения программы Array " + (e - d) + " ms");   // 31 ms
//        List<Integer> list = new LinkedList<>();
//        long a = new Date().getTime();
//        addBillionLinked(list);
//        long b = new Date().getTime();
//        System.out.println("Время выполнения программы Linked " + (b - a) + " ms");  // 135 ms
//        timeTest();
//        long x = new Date().getTime();
//        //       getElementList(list);
//        long y = new Date().getTime();
//        System.out.println("Время выполнения программы GetLinked " + (y - x) + " ms"); // 84437 ms
//        long q = new Date().getTime();
//        getElementArray(array);
//        long w = new Date().getTime();
//        System.out.println("Время выполнения программы GetArray " + (w - q) + " ms"); // 15 ms
        Iterator iterator = dynamicArray.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public static void timeTest() {
        Integer[] integers = new Integer[1_000_000];
        Random r = new Random();
        for (int i = 0; i < integers.length; i++) {
            integers[i] = r.nextInt(100);
        }
        long stop;
        long start = System.nanoTime();
        LinkedList<Integer> integerLinkedList = new LinkedList<>(Arrays.asList(integers));
        stop = System.nanoTime();
        System.out.println(stop - start);
        start = System.nanoTime();
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(integers));
        stop = System.nanoTime();
        System.out.println(stop - start);

    }

    public static void addBillionArray(DynamicArray dynamicArray) {

        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            dynamicArray.add(random.nextInt(10));
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(dynamicArray.get(i));
        }


    }

    public static void addBillionLinked(List list) {

        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            list.add(random.nextInt(10));
        }

    }

    public static void getElementList(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {

            list.get(random.nextInt(1000000));
        }
    }

    public static void getElementArray(DynamicArray array) {
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {

            array.get(random.nextInt(1000000));
        }
    }

}
