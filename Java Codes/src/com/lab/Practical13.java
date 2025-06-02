package com.lab;
import java.util.*;

public class Practical13 {

    public static void main(String[] args) {
    	
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple");

        System.out.println("ArrayList: " + fruits);

        
        Set<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Kolkata");
        cities.add("Delhi");

        System.out.println("HashSet: " + cities);

        
        Queue<String> tasks = new LinkedList<>();
        tasks.add("Task1");
        tasks.add("Task2");
        tasks.add("Task3");

        System.out.println("LinkedList(queue): " + tasks);
        System.out.println("Removed from Queue: " + tasks.poll());
        System.out.println("Queue after poll: " + tasks);

        
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(101, "Alex");

        System.out.println("HashMap: " + studentMap);
        System.out.println("Value for key 102: " + studentMap.get(102));
    }
}


/*Output-----
ArrayList: [Apple, Banana, Cherry, Apple]
HashSet: [Delhi, Kolkata, Mumbai]
LinkedList(queue): [Task1, Task2, Task3]
Removed from Queue: Task1
Queue after poll: [Task2, Task3]
HashMap: {101=Alex, 102=Bob, 103=Charlie}
Value for key 102: Bob
*/
