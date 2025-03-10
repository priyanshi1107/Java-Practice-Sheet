import learningFactoryPattern.Employee;
import learningFactoryPattern.EmployeeFactoryDesign;
import string.*;
import tcsPYQ.CardGame;
import tcsPYQ.CountDigits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Palindrome palindromeObj = new Palindrome();
//        System.out.println(palindromeObj.isPalindrome("abba"));

//        IsSubsequence isSubsequenceObj = new IsSubsequence();
//        System.out.println(isSubsequenceObj.isSub("priyanshi","priya",9,5));

//        IsAnagram isAnagramObj = new IsAnagram();
//        System.out.println(isAnagramObj.naiveSolutionOfAnagram("aayush","yaashu"));

//        CountDigits countDigitsObj = new CountDigits();
//        System.out.println(countDigitsObj.evenlyDividesEasy(1234));

//        LeftMostRepeatingChar leftMostRepeatingChar = new LeftMostRepeatingChar();
//        System.out.println(leftMostRepeatingChar.repeatChar("geeksforgeeks"));

        //Factory Design Pattern

//        Employee employee = EmployeeFactoryDesign.getEmployee("Android Developer");
//        employee.Salary();

//        ReverseWordInString reverseWordInString = new ReverseWordInString();
//        System.out.println(reverseWordInString.reverseWord("Hi I am prishi"));

//        PatternSearching patternSearching = new PatternSearching();
//        patternSearching.naiveApproachPatternSearching("abc","abcdefabcde");

//        String str = "***#####";
//        IsValidString isValidString = new IsValidString();
//        isValidString.countStarAndHash(str);

        //CARD GAME

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        for(int i = 0; i<n; i++){
            array[i] =sc.nextInt();
        }
         int k = sc.nextInt();

        CardGame cardGame = new CardGame();
        System.out.println(cardGame.cardGame(n,array,k));
    }
}