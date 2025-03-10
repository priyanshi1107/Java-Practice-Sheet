package tcsPYQ;
/* Bingu was testing all the strings he had at his place
 and found that most of them were prone to a vicious
 attack by Banju, his arch-enemy. Bingu decided to
 encrypt all the strings he had, by the following method.
 Every substring of identical letters is replaced by a
 single instance of that letter followed by the number of
 occurrences of that letter. Then, the string thus obtained
 is further encrypted by reversing it.
 Input:
 s = "aabc“
 Output: 1c1b2a
 Explanation: aabc
 Step1: a2b1c1
 Step2: 1c1b2a
 */
public class StringEncryption {
    public static String stringEncryption(String s){
        int count = 1;
        String newString = "";
        for (int i =0; i<s.length(); i++){
            if((i < (s.length() - 1)) && (s.charAt(i) == s.charAt(i+1))){
                count ++;
            }else{
                newString += s.charAt(i);
                newString += count;
            }
        }
        String reverse = "";
        for(int i = newString.length()-1; i>=0; i--){
            reverse =reverse + newString.charAt(i);
        }
        return reverse ;
    }
}
