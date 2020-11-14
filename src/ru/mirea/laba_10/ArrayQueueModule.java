package ru.mirea.laba_10;

import java.util.Arrays;

public class ArrayQueueModule {
    private int index = 0;
    private Object[] elements = new Object[1];

    public void enqueue(Object element) {
        assert element != null;
        elements[index] = element;
        ensureCapacity(++index);
    }

    private void ensureCapacity(int capacity) {
        if(capacity > elements.length-1)
            elements = Arrays.copyOf(elements, capacity+1);
    }

    public Object dequeue() {
        Object value = elements[0];
        Object[] temp = new Object[elements.length-1];
        System.arraycopy(elements, 1, temp, 0, elements.length - 1);
        elements = temp;
        return value;
    }

    public Object element(){
        return elements[0];
    }

    public void clear(){
        elements = new Object[1];
    }

    public int size() {
        return elements.length;
    }

    public boolean isEmpty() {
        return elements.length > 0;
    }
}
