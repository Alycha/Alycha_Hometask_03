/**
 * Created by Alycha on 11/23/2015.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Task 3
*Create 2 random collections of strings, compare the contents, print the number of equal and different elements to the
 * screen
 */

public class CompareCollectionsTask {
    public static void main(String[] args) {
        List Collection1 = new ArrayList(10);
        List Collection2 = new ArrayList(10);
        Collection1.add("Aleph Sadhe");
        Collection1.add("Ayin");
        Collection1.add("Samekh Ayin");
        Collection1.add("Lamed");
        Collection1.add("Sadhe");
        Collection1.add("Resh");
        Collection1.add("Mem Resh");
        Collection1.add("Daleth");
        Collection1.add("Beth");
        Collection1.add("Gimel");
        System.out.println("Collection 1:");
        for(int i = 0; i < Collection1.size(); i++) {
            System.out.println(Collection1.get(i));
        }

        Collection2.add("Aleph Gimel");
        Collection2.add("Waw");
        Collection2.add("Samekh Lamed");
        Collection2.add("Zayin");
        Collection2.add("Lamed");
        Collection2.add("Yod");
        Collection2.add("Mem Resh");
        Collection2.add("Resh");
        Collection2.add("Ayin");
        Collection2.add("Qoph");
        System.out.println();
        System.out.println("Collection 2:");
        for(int i = 0; i < Collection2.size(); i++) {
            System.out.println(Collection2.get(i));
        }

        int DifferentElements = 10;
        for (int i = 0; i < Collection1.size(); i++) {
            for (int j = 0; j < Collection2.size(); j++) {
                if (Collection2.get(j) == (Collection1.get(i))) {
                    DifferentElements--;
                }
            }
        }
        System.out.println();
        System.out.println("Number of different elements in 2 collections: " + DifferentElements);
        System.out.println("Number of equal elements in 2 collections: " + (10 - DifferentElements));

    }



}

