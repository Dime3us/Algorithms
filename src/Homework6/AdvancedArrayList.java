package Homework6;

import java.util.Iterator;

public interface AdvancedArrayList {


    void addAt(int index, int value);

    void remove(int value);

    void removeAt(int index);

    void growSize();

    void shrinkSize();

    void set(int index, int value);

    void add(int value);


    int get(int index);

    void clear();

    boolean contains(int value);

    boolean isEmpty();

    Iterator<Integer> iterator();
}

