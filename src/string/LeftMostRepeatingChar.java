package string;

public class LeftMostRepeatingChar {
    public int repeatChar(String s){

        for(int i =0 ; i<s.length(); i++) {
            for(int j = i+1; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    return i;
                }
            }
        }
        return -1;

    }
}
