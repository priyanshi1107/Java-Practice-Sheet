/* Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). Return the total number of such digits.

A digit d of n divides n evenly if the remainder when n is divided by d is 0 (n % d == 0).
Digits of n should be checked individually. If a digit is 0, it should be ignored because division by 0 is undefined.

Examples :
Input: n = 12
Output: 2

Explanation: 1, 2 when both divide 12 leaves remainder 0.
*/
package tcsPYQ;

public class CountDigits {
    public int evenlyDivides(int n) {
        String s = Integer.toString(n);
        int[] intArray = new int[s.length()];
        int count = 0;

        for(int i = 0; i<s.length(); i++){
            intArray[i] = Character.getNumericValue(s.charAt(i));
        }

        for(int i= 0; i<intArray.length; i++){
            if(intArray[i]!=0 && n%intArray[i]==0){
                count++;
            }
        }
        return count;
    }

    public int evenlyDividesEasy(int n){
        int count = 0;
        int temp = n;
        while ( temp > 0 ){
            int digit = temp % 10;
            if(digit != 0 && n%digit==0){
                count++;
            }
            temp /=10;
        }
        return count;
    }
}
