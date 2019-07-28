package LeetCode;
public class ReverseOnlyLetters {
    private static String reverseOnlyLetters(String S) {
        StringBuilder sb = new StringBuilder(S);
        int low = 0;
        int high = sb.length() - 1;

        while(low < high) {
            int x = sb.charAt(low);
            int y = sb.charAt(high);
            if(x >= 33 && x < 58 || x >= 58 && x < 65 || x >= 91 && x < 97){
                low++;
                continue;
            }
            else if(y >= 33 && y < 58 || y >= 58 && y < 65 || y >= 91 && y < 97){
                high--;
                continue;
            }
            char tmp = sb.charAt(low);
            sb.setCharAt(low, sb.charAt(high));
            sb.setCharAt(high, tmp);
            low++;
            high--;
        }
        return sb.toString();
    }
}
