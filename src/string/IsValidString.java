package string;

public class IsValidString {
    public static void countStarAndHash(String str){
        int count1 =0;
        int count2 =0;

        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)== '*'){
                count1 ++;
            }else{
                count2 ++;
            }
        }

        if(count1>count2){
            System.out.println(count1-count2);
        }else if(count2>count1){
            System.out.println(-(count2-count1));
        }else if(count1 == count2){
            System.out.println(0);
        }
    }
}
