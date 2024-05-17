import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, Enter a CC Number");
        System.out.println(Credit.findDigits(input.nextLong()) + " digits");
    }



}//last ending