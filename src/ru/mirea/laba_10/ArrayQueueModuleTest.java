package ru.mirea.laba_10;

public class ArrayQueueModuleTest {
    public static void fill(ArrayQueueModule array) {
        for (int i = 0; i < 10; i++) {
            array.enqueue(i);
        }
    }

    public static void dump(ArrayQueueModule array) {
        while (array.isEmpty()) {
            System.out.println(array.size() + " " + " " + array.dequeue());
        }
    }

    public static void main(String[] args) {
        ArrayQueueModule array = new ArrayQueueModule();
        fill(array);
        dump(array);
    }
}