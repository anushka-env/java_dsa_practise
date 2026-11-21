
// ARRAYLIST IN JAVA

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class ArrayLists {

    public static void main(String args[]) {

        // 1. DECLARING ARRAYLISTS

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();


        // 2. ADDING ELEMENTS

        list.add(10);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original List: " + list);


        // 3. ACCESSING ELEMENTS

        int element = list.get(0);
        System.out.println("Element at index 0: " + element);


        // 4. ADDING ELEMENT AT A SPECIFIC INDEX

        list.add(1, 20);
        System.out.println("After adding 20: " + list);


        // 5. UPDATING AN ELEMENT

        list.set(0, 5);
        System.out.println("After updating: " + list);


        // 6. REMOVING ELEMENTS

        list.remove(0);  // Removes element at index 0
        System.out.println("After removing index 0: " + list);

        list.remove(Integer.valueOf(40)); // Removes element 40
        System.out.println("After removing 40: " + list);


        // 7. SIZE OF ARRAYLIST

        System.out.println("Size: " + list.size());


        // 8. CHECKING WHETHER ELEMENT EXISTS

        System.out.println("Contains 30? " + list.contains(30));
        System.out.println("Contains 100? " + list.contains(100));


        // 9. CHECKING WHETHER LIST IS EMPTY

        System.out.println("Is list empty? " + list.isEmpty());


        // 10. ITERATING THROUGH ARRAYLIST

        // Using for loop
        System.out.println("Using for loop:");

        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();


        // Using enhanced for loop
        System.out.println("Using for-each loop:");

        for(int val : list) {
            System.out.print(val + " ");
        }
        System.out.println();


        // 11. SORTING IN ASCENDING ORDER

        list.add(10);
        list.add(60);

        Collections.sort(list);

        System.out.println("Ascending Order: " + list);


        // 12. SORTING IN DESCENDING ORDER

        Collections.sort(list, Collections.reverseOrder());

        System.out.println("Descending Order: " + list);


        // 13. REVERSING AN ARRAYLIST

        Collections.reverse(list);

        System.out.println("Reversed List: " + list);


        // 14. FINDING MAXIMUM AND MINIMUM

        System.out.println("Maximum: " + Collections.max(list));
        System.out.println("Minimum: " + Collections.min(list));


        // 15. FREQUENCY OF AN ELEMENT

        System.out.println("Frequency of 10: " +
                           Collections.frequency(list, 10));


        // 16. ITERATOR

        System.out.println("Using Iterator:");

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();


        // 17. REMOVING ALL ELEMENTS

        ArrayList<Integer> temp = new ArrayList<>(list);

        temp.clear();

        System.out.println("After clearing: " + temp);
        System.out.println("Is temp empty? " + temp.isEmpty());


        // 18. STRING ARRAYLIST

        list2.add("Java");
        list2.add("Python");
        list2.add("C++");

        System.out.println("String List: " + list2);


        // 19. BOOLEAN ARRAYLIST

        list3.add(true);
        list3.add(false);
        list3.add(true);

        System.out.println("Boolean List: " + list3);
    }
}
