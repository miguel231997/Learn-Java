import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class App {
    public static void main(String args[]) {
        //Definition: A HashMap<K, V> is a part of javas java.uitl package and stores key-value paris, where keys are unique
        //implemenation: it uses hashin and buckets for efficient lookups, insertions, and deletions
        //Time complexity:
        //Best/ Average case: O(1) for inset, delete, and lookup in ideal conditions)
        //worst case: O(n) (if has collisions occur and all elements land in the same bucket)
        //KEY METHODS

        //Declare a hashMap without initializing
        HashMap<Integer, String> map = new HashMap();
        //At this point, map exists but doesn't reference an actual HashMap object yet. If you try usiing it without initilizing it, youll get a NullPointerException

        //Declaration and Initialize the HashMap
        HashMap<Integer, String> studentMap = new HashMap<>();

        //populate HashMap
        studentMap.put(1, "Alice");
        studentMap.put(2, "Bob");
        studentMap.put(3, "Charlie");

        //printing the HashMap

        System.out.println(studentMap); // {1-Alice, 2=bob, 3=Charlie}

        //Accessing a value by key
        System.out.println(studentMap.get(2));

        //Iterating through a HashMap

        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        //only iterating through the Keys

        for (Integer key : studentMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + studentMap.get(key));
        }

        //iterating only values

        for (String value : studentMap.values()) {
            System.out.println("Value: " + value);
        }

        //using forEach() Lambda Expression

        studentMap.forEach((key, value) -> System.out.println(key + " -> " + value));

        //updating a value in HashMap

        studentMap.put(2, "David");


        //Alternate Initialization with values Directly
        Map<Integer, String> names = Map.of(
                1, "Alice",
                2, "Bob",
                3, "Charlie"
        );
        System.out.println(names);


        if (names.containsKey(1)) { //checks if the key is in the hashmap
            System.out.println(1 + " = " + names.get(1)); //wil return the key value pair;
        }


        //Note: Map.of(...) creates an immutable Map, meaning you cannot add, remove, or modify elements.

        //HashSet- Declaration and Initialization
        //Declaration (only declaring, No initialization

        HashSet<String> set;

        //Initialization declaring and creating the object
        HashSet<String> secondSet = new HashSet<>();

        // Populate the HashSet
        secondSet.add("Alice");
        secondSet.add("Bob");
        secondSet.add("Charlie");

        // Print the HashSet
        System.out.println(secondSet); // Output: [Alice, Bob, Charlie]

        //Iterating through a HashSet only stores unique elements and does not support index-based access

        //using an Enhanced for loop

        for (String name : secondSet) {
            System.out.println(name);
        }

        //using iterator

        Iterator<String> interator = secondSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(interator.next());
        }

        //Use a HashMap when you need key-value lookups.
        //Use a HashSet when you only need unique values.

    }
}
