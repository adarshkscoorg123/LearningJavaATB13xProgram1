package ex_39_Java_CollectionsFramework_Queue;

import java.util.PriorityQueue;

public class Lab_288_Queue {

    public static void main(String[] args) {

        // Queue - First In First Out
        // Very rarely used

        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Lucky");
        queue.add("Octupus");
        queue.add("Mada");
        queue.add("Nari");
        queue.add("Jinkemari");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
