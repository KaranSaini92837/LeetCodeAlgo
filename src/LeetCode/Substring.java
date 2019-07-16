package LeetCode;

public class Substring {

    public static int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }
        if(needle.length() > haystack.length()){
            return -1;
        }
//        if(haystack.length() == needle.length() && haystack.equals(needle)){
//            if(haystack.equals(needle)){
//                return 0;
//            }
//            else{
//                return -1;
//            }
//        }
        else{
            for(int i = 0; i< haystack.length();i++){
                if(needle.length() <= haystack.length() -i && haystack.charAt(i) == needle.charAt(0) ){
                    if(haystack.substring(i, i+needle.length()).equals(needle)){
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String args[]){

        String s = "mississippi";
        String x = "pi";
        System.out.println(strStr(s,x));

    }
}
