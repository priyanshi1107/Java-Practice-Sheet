package string;

public class IsSubsequence {
    public boolean isSub(String s1, String s2, int m, int n){
        int j = 0;
        for(int i=0; i<m&& j<n; i++){
            if(s1.charAt(i)==s2.charAt(j)){
                j++;
            }
        }
        return j==n;
    }
}
