package Medium;

import java.util.*;
public class CircularQueue_622 {
    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;
    public CircularQueue_622(int k) {
        arr = new int[k];
        capacity = k;
        front = 0;
        rear = -1;
        size = 0;
    }
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
        return true;
    }
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % capacity;
        size--;
        return true;
    }
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[rear];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == capacity;
    }
    public static void main(String[] args) {
        CircularQueue_622 q = new CircularQueue_622(3);
        System.out.println(q.enQueue(16));
        System.out.println(q.enQueue(70));
        System.out.println(q.enQueue(5));
        System.out.println(q.enQueue(24));
        System.out.println(q.Rear());
        System.out.println(q.isFull());
        System.out.println(q.deQueue());
        System.out.println(q.enQueue(43));
        System.out.println(q.Rear());
    }
}
