package edu.alevel.module;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Objects;



public class LinkedListDen<E> implements ListDen<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;
    public LinkedListDen() {
        head = tail = null;
        size = 0;
    }


    private static final class Node<E> {
        private E value;
        private Node<E> next;
        private Node<E> previous;

        public Node(E value, Node<E> next, Node<E> previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
        public Node() {
            this.value = null;
            this.next = null;
            this.previous = null;
        }
    }

    @Override
    public void add(E element) {
        Node<E> newNode = new Node<>(element, null, tail);

        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }

        tail = newNode;
        size++;
    }

    @Override
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == size) {
            add(element);
            return;
        }

        Node<E> currentNode = getNode(index);
        Node<E> newNode = new Node<>(element, currentNode, currentNode.previous);

        if (currentNode.previous == null) {
            head = newNode;
        } else {
            currentNode.previous.next = newNode;
        }

        currentNode.previous = newNode;
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> currentNode = getNode(index);

        if (currentNode.previous == null) {
            head = currentNode.next;
        } else {
            currentNode.previous.next = currentNode.next;
        }

        if (currentNode.next == null) {
            tail = currentNode.previous;
        } else {
            currentNode.next.previous = currentNode.previous;
        }

        size--;
    }

    @Override
    public void removeLast() {
        if (size == 0) {
            throw new NoSuchElementException();
        }

        remove(size - 1);
    }

    @Override
    public void update(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> currentNode = getNode(index);
        currentNode.value = element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> currentNode = getNode(index);
        return currentNode.value;
    }

    @Override
    public void sort(Comparator<? super E> comparator) {
        if (size <= 1) {
            return;
        }

        Node<E> current = head.next;
        while (current != null) {
            Node<E> insertNode = current;
            E insertValue = insertNode.value;

            Node<E> compareNode = insertNode.previous;
            while (compareNode != null && comparator.compare(compareNode.value, insertValue) > 0) {
                compareNode.next.value = compareNode.value;
                compareNode = compareNode.previous;
            }

            if (compareNode == null) {
                head.value = insertValue;
            } else {
                compareNode.next.value = insertValue;
            }

            current = current.next;
        }
    }

    @Override
    public void sortReverse(Comparator<? super E> comparator) {
        sort(comparator.reversed());
    }

    // Допоміжний метод для отримання вузла по порядковому номеру

    private Node<E> getNode(int index) {
        Node<E> currentNode;

        if (index < size / 2) {
            currentNode = head;

            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
        } else {
            currentNode = tail;

            for (int i = size - 1; i > index; i--) {
                currentNode = currentNode.previous;
            }
        }

        return currentNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkedListDen<?> that = (LinkedListDen<?>) o;
        return size == that.size && Objects.equals(head, that.head) && Objects.equals(tail, that.tail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, tail, size);
    }

    @Override
    public String toString() {

        Node<E> temp = head;
        Object[] result = new Object[size];
        int index = 0;
        while (Objects.nonNull(temp)) {
            result[index] = temp.value;
            temp = temp.next;
            index++;
        }
        return Arrays.toString(result);
    }
}

