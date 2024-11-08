package timepass;
/*
Implement the uniqueNames method.
When passed two arrays of names, it will return an array
containing the names that appear in either or both arrays.
The returned array should have no duplicates.
*/

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class MergeNames {

public static String[] uniqueNames(String[] names1, String[] names2) {
    // Set<String> set = new HashSet<String>(Arrays.asList(names1));
    // set.addAll(Arrays.asList(names2));
    // return set.toArray(new String[0]);
   
    Set<String> set = new HashSet<String>();
    set.addAll(Arrays.asList(names1));
    set.addAll(Arrays.asList(names2));
    return set.toArray(new String[0]);
}

public static void main(String[] args) {
    String[] names1 = new String[] {"Amzad", "Arshad", "Afsar", "Aaqib"};
    String[] names2 = new String[] {"Aleefia", "Aneesa", "Aaqib", "Amzad" };
    System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2)));
    // should print Amzad, Arshad, Afsar, Aaqib, Aleefia, Aneesa
}
}