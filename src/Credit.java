
public class Credit {
    
    public static int findDigits(long num){
        int count = 0;
        while (num > 0){
            int digit = (int)num % 10;
            count++;
            num = num / 10;
        }
        return count;
    }//ending findDigits

    public static int getDigits(long num, int index){
        int result = 0;
        while (num > 0){
            int digit = (int)num % 10;
            count++;
            if(count == index){
                return digit;
            }
            num = num / 10;
        }
        return result;
    }//ending getDigits
    



    
}//last closing
