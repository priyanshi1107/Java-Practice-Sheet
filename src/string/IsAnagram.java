package string;
import java.util.*;

public class IsAnagram {
    public boolean naiveSolutionOfAnagram(String s1, String s2){        //O(n log n)
        if(s1.length() != s2.length()){
            return false;
        }

        char[] a1 = s1.toCharArray();
        Arrays.sort(a1);
        s1 = new String(a1);

        char[] a2 = s2.toCharArray();
        Arrays.sort(a2);
        s2 = new String(a2);

        return s1.equals(s2);
    }

//    public boolean efficientSolutionOfAnagram(String s1, String s2){
//
//    }
}
