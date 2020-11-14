package ru.mirea.laba_11;

import java.util.Arrays;

public class ArrayQueueADT {
    private Object[] elements = new Object[1];

    public static void enqueue(ArrayQueueADT array, Object element) {
        assert element != null;
        array.elements[array.elements.length-1] = element;
        ensureCapacity(array, array.elements.length);
    }

    private static void ensureCapacity(ArrayQueueADT array, int capacity) {
        if (capacity >= array.elements.length) {
            array.elements = Arrays.copyOf(array.elements, capacity+1);
        }
    }

    public static Object dequeue(ArrayQueueADT array) {
        if(array.elements.length > 0) {
            Object value = array.elements[0];
            Object[] temp = new Object[array.elements.length - 1];
            System.arraycopy(array.elements, 1, temp, 0, array.elements.length - 1);
            array.elements = temp;
            return value;
        }
        else {
            return null;
        }
    }

    public Object element(){
        return elements[0];
    }

    public void clear(){
        elements = new Object[1];
    }

    public static Object element(ArrayQueueADT array) {
        if(array.elements.length > 0) {
            return array.elements[0];
        }
        else {
            return null;
        }
    }

    public static int size(ArrayQueueADT array) {
        return array.elements.length-1;
    }

    public static boolean isEmpty(ArrayQueueADT array) {
        return array.elements.length-1 <= 0;
    }
}