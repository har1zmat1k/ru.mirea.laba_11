package ru.mirea.laba_11;

public class ArrayQueueTest {
    public static void fill() {
        for (int i = 0; i < 10; i++) {
            ArrayQueue.enqueue(i);
        }
    }

    public static void dump() {
        while (!ArrayQueue.isEmpty()) {
            System.out.println(
                    ArrayQueue.size() + " " +
                            ArrayQueue.element() + " " +
                            ArrayQueue.dequeue()
            );
        }
    }

    public static void main(String[] args) {
        fill();
        dump();
    }
}
