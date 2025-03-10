package tcsPYQ;
/*
* . The Card Game Challenge
 You are participating in a unique card game where
 several cards are arranged in a row. Each card has a
 certain number of points written on it. Your goal is to
 collect exactly K cards in such a way that your total
 score is maximized.
 However, there’s a catch! You can only pick cards from
 either the beginning or the end of the row in each step.
 Once a card is picked, it is removed, and you continue
 picking until you have exactly K cards.
 Input Format:
 Your task is to determine the maximum score you can
 achieve by strategically picking cards.
 The first line contains an integer N, the number of
 cards.
 The second line contains N space-separated integers
 representing the points on each card.
 The third line contains an integer K, the number of
 cards you must pick.
 Output Format:
 Print the maximum score that can be achieved by
 picking exactly K cards optimally.
Input :
 7
1 2 3 4 5 6 1
 3
Output : 12
 * */
public class CardGame {
    public static int cardGame(int n, int[] array, int k){
        int lsum = 0;
        int rsum = 0;
        int l = array.length;

        for(int i=0; i<k; i++){
            lsum += array[i];
        }
        int max = lsum;
        int r = l-1;
        for(int i=k-1; i>=0; i--){
            lsum -= array[i];
            rsum += array[r];
            r--;
            max = Math.max(max, lsum+rsum);
        }

        return max;
    }
}
