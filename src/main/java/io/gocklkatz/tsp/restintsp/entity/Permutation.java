package io.gocklkatz.tsp.restintsp.entity;

import java.util.ArrayList;
import java.util.List;

// https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
public class Permutation {
    private List<String> tours = new ArrayList<>();

    public List<String> getTours() {
        return tours;
    }

    /**
     * permutation function
     * @param str string to calculate permutation for
     * @param l starting index
     * @param r end index
     */
    public void permute(String str, int l, int r)
    {
        if (l == r) {
            tours.add(str);
        }
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }

    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
