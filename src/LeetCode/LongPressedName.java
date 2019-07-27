package LeetCode;

public class LongPressedName {

    public static boolean isLongPressedName(String name, String typed) {
        if(typed.length() < name.length()){
            return true;
        }
        int j = 0;
        for(int i = 0; i < typed.length(); i++){
            if(name.charAt(j) == typed.charAt(i)){
                ++j;
            }
            if(j == name.length()){
                return true;
            }
        }
        return false;
    }
}
