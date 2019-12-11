package lab2;

import java.util.ArrayList;

public class Queue {
    int maxsize;
    ArrayList<Integer> queue = new ArrayList();
    boolean isLimitless = false;

    Queue() {
        this.isLimitless = true;
    }

    Queue(int n) {
        this.maxsize = n;
    }

    void Push(int i) {
        if (isLimitless) {
            queue.add(i);
            System.out.println("Number " + i + " successfully added");
        } else {
            if (queue.size() < maxsize) {
                queue.add(i);
                System.out.println("Number " + i + " successfully added");
            } else System.out.println("Queue limit reached");
        }

    }

    void Pop() {
        if (isLimitless) {
            if (queue.size() == 0) {
                System.out.println("There are no more elements in this queue");
            } else {
                int result = queue.get(0);
                queue.remove(0);
                System.out.println(result);
            }
        } else {
            if (queue.size() != 0) {
                int result = queue.get(0);
                queue.remove(0);
                System.out.println(result);
            } else {
                System.out.println("There are no more elements in this queue");
            }
        }

    }

    void isFull() {
        if (isLimitless) {
            System.out.println("This queue is never full");
        } else {
            if (queue.size() == maxsize) {
                System.out.println("The queue is full");
            } else {
                System.out.println("The queue is not full");
            }
        }
    }

    void isEmpty() {
        if (isLimitless) {
            if (queue.size() == 0) {
                System.out.println("The queue is empty");
            } else System.out.println("The queue is not empty");
        } else {
            if (queue.size() == 0) {
                System.out.println("The queue is empty");
            } else System.out.println("The queue is not empty");
        }
    }

    void print() {
        if (queue.size() == 0) {
            System.out.println("There are no elements in the queue");
        }
        for (int j = 0; j < queue.size(); j++) {
            System.out.print(queue.get(j) + " ");
        }
    }

}
