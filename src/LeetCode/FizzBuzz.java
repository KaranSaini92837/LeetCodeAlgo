package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i%3 == 0 && i%5 != 0) {
                result.add("Fizz");
            } else if (i%5 == 0 && n%3 != 0) {
                result.add("Buzz");
            } else if (n%3 == 0 && n%5 == 0) {
                result.add("FizzBuzz");
            } else {
                result.add("" + i + "");
            }
        }
        return result;
    }

    public static void main(String[] args){
        int n = 15;
        System.out.println((1%3 == 0 && 1%5 == 0));
//        for(String i : FizzBuzz.fizzBuzz(n)){
//            System.out.println(i);
//        }
    }
}
