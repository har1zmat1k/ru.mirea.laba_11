package ru.mirea.laba_11;


import java.util.Arrays;

public class ArrayQueue {
    private static int size;
    private static Object[] elements = new Object[1];

    public static void enqueue(Object element) {
        assert element != null;
        ensureCapacity(size + 1);
        elements[size++] = element;
    }

    private static void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            elements = Arrays.copyOf(elements, capacity+1);
        }
    }

    public static Object dequeue() {
        assert size > 0;
        if (elements.length > 0) {
            Object value = elements[0];
            Object[] temp = new Object[elements.length - 1];
            System.arraycopy(elements, 1, temp, 0, elements.length - 1);
            elements = temp;
            return value;
        } else {
            return null;
        }
    }

    public static void clear(){
        elements = new Object[1];
    }

    public static Object element() {
        assert size > 0;
        return elements[0];
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }
}
