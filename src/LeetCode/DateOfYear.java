package LeetCode;
public class DateOfYear {
    public static int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8,10));
        int result = 0;
        int[] days = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(year%100 == 0){
            for(int i = 1; i < month; i++){
                result += days[i];
            }
            return result+day;
        }
        else if(year%400 == 0){
            for(int i = 1; i < month; i++){
                result += days[i];
            }
            if(month > 2) return result+day+1;
            else return result+day;
        }
        else if(year%4 == 0){
            for(int i = 1; i < month; i++){
                result += days[i];
            }
            if(month > 2) return result+day+1;
            else return result+day;
        }
        else{
            for(int i = 1; i < month; i++){
                result += days[i];
            }
            return result+day;
        }
    }

    public static void main(String[] args){
        String date = "1900-03-25";
        System.out.println(DateOfYear.dayOfYear(date));
    }
}
