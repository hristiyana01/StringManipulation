import java.util.*;

public class FindLongestWord {
    static String findLongestWord(String S, List<String> d) {
        String longest= "";

        d.sort(Comparator.comparing(String::length).reversed().thenComparing(Comparator.naturalOrder()));

        for(String s: d) {
            int i=0,j=0;

            while (i < S.length() && j < S.length()) {
                if(S.charAt(i) == s.charAt(j)) {
                    j++;
                }
                i++;
            }

            if(j == s.length() && s.length() > longest.length()) {
                longest = s;
            }

        }

        return longest;
    }
}
