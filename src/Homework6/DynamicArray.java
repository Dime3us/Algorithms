package Homework6;

import java.util.Arrays;
import java.util.Iterator;

public class DynamicArray implements AdvancedArrayList {
    private int[] array;
    private int count;
    private int size;

    public DynamicArray() {
        array = new int[1];
        count = 0;
        size = 1;

    }

    public void add(int i) {
        if (count == size) {
            growSize();
        }

        array[count] = i;
        count++;


    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        return array[index];
    }

    @Override
    public void clear() {
        for (int i = count; i >= 0; i--) {
            array[i] = 0;

        }
        count = 0;
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (value == array[i])
                return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;

    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter++ < count;
            }

            @Override
            public Integer next() {
                return array[counter - 1];
            }

        };
    }              // Iterator

    @Override
    public void addAt(int index, int value) {
        if (index > count) {
            System.out.println("!!!  Index is outside the array   !!!");
            return;
        }
        if (count == size) {
            // увеличить массив в два раза и скопировать в него старые элементы
            growSize();
        }
        for (int i = count - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = value;
        count++;
    }


    public void growSize() {
        int[] temp = new int[size * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
        size = size * 2;
    }

    @Override
    public void shrinkSize() {
        if (count <= size / 2 && count >= 2) {
            int[] temp = new int[size / 2];
            for (int i = 0; i < count; i++) {
                temp[i] = array[i];
            }
            array = temp;
            size = size / 2;
        }
    }

    public int size() {
        return count;
    }

    public int getInnerArrayLength() {
        return size;
    }

    public void removeAt(int index) {
        int[] newSource = new int[array.length];
        for (int i = 0; i < index; i++) {
            newSource[i] = array[i];
        }
        for (int i = index + 1; i < size(); i++) {
            newSource[i - 1] = array[i];
        }
        array = newSource;
        count--;
        if (count <= size / 2)
            shrinkSize();
    }


    @Override
    public void remove(int value) {
        int[] newSource = new int[array.length - 1];

        for (int i = 0; i < count; i++) {

            if (array[i] == value) {
                for (int j = 0; j < i; j++) {
                    newSource[j] = array[j];
                }
                for (int k = i + 1; k < count; k++) {
                    newSource[k - 1] = array[k];
                }
                array = newSource;
                break;
            }

        }
        count--;
    }

    public void set(int index, int value) {
        array[index] = value;
    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "array= " + Arrays.toString(array) +
                ", count=" + count +
                ", size=" + size +
                '}';
    }

    public String print() {
        StringBuilder arrayAsString = new StringBuilder();
        arrayAsString.append("[");
        for (int i = 0; i < count; i++) {
            arrayAsString.append(array[i] + " ");
            if (i != count - 1) {
                arrayAsString.append(" ");
            }
        }
        arrayAsString.append("]");
        return arrayAsString.toString();

    }
}
