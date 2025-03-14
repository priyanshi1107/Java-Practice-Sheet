package tcsPYQ;
/*
* Q3. At a fun fair, a street vendor is selling different colours of balloons. He sells N number of different colours of
balloons (B[]). The task is to find the colour (odd) of the balloon which is present odd number of times in the
bunch of balloons.

Note: If there is more than one colour which is odd in number, then the first colour in the array which is present
odd number of times is displayed. The colours of the balloons can all be either upper case or lower case in the
array. If all the inputs are even in number, display the message "All are even".

Example 1:

7 -> Value of N

[r,g,b,b,g,y,y] -> B[]
Elements B[0] to B[N-1], where each input element is separated by new line.

Output : r -> [r,g,b,b,g,y,y] -> "r" colour balloon is present odd number of times in the bunch.

Explanation:

From the input array above: r: 1 balloon g: 2 balloons b: 2 balloons y : 2 balloons Hence, r is only the balloon
which is odd in nOnber.
* */

import java.util.*;

public class OddBalloon {
    public static String oddBalloon(int value, String[] array) {
        Map<String, Integer> newMap = new LinkedHashMap<>(); // Preserve insertion order

        // Count occurrences of each color
        for (String key : array) {
            newMap.put(key, newMap.getOrDefault(key, 0) + 1);
        }

        // Find first odd occurrence
        for (Map.Entry<String, Integer> entry : newMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey(); // Return the first odd occurrence
            }
        }

        return "All are even"; // If no odd occurrence found
    }

    public static void main(String[] args) {
        String[] balloons = {"r", "g", "b", "b", "g", "y", "y"};
        System.out.println(oddBalloon(balloons.length, balloons)); // Expected Output: r
    }
}
