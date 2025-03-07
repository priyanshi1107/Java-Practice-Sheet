package string;

/*
* eg. str1 = abcdefabcd
*     str2 = abcd
* we have to search for the pattern of str2 in str 1
*     Output : 0 6
*     return index of that pattern
* */

/*
* time complexity = O((n-m+1)*m)
*/

public class PatternSearching {
    public static void naiveApproachPatternSearching(String pat , String txt){
        int m = pat.length();
        int n = txt.length();

        for(int i=0; i< n-m; i++ ){
            int j;
            for(j= 0; j<m; j++){
                if(pat.charAt(j)!=txt.charAt(i+j)){
                    break;
                }
            }
            if(j== m){
                System.out.println(i);
            }
        }
    }
}
