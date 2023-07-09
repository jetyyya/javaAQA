package edu.alevel.module;

import java.util.Comparator;

public interface ListDen<E> {
    void add(E element);
    void add(int index, E element);
    void remove(int index);
    void removeLast();
    void update(int index, E element);
    int size();
    E get(int index);
    void sort(Comparator<? super E> comparator);
    void sortReverse(Comparator<? super E> comparator);
}
