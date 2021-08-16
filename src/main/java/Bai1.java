import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Bai1 {
    public static void main( String[] inputString ) {

        System.out.println("Input your array:");
        Scanner sc = new Scanner(System.in);
        String inputArray = sc.nextLine();
        countChar(inputArray);

//        String inputStr1 = "Hello One Mount Group";
//        String inputStr2 = "Hello 1 Mount Group";
//        String uppercaseStr = getChuoi(inputStr1);
//        String nonnumericStr = nonnumericStr(inputStr2);
    }

    public static void countChar(String inputArray) {
        int vowel = 0;
        int consonant = 0;
        inputArray = inputArray.toLowerCase();
        for(int i = 0; i < inputArray.length(); i++) {
            char ch = inputArray.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            } else if((ch >= 'a'&& ch <= 'z')) {
                consonant++;
            }
        }
        System.out.println("Total number of vowel: " + vowel);
        System.out.println("Total number of consonant: " + consonant);

    }

    public static void getChuoi(String inputStr1) {
        System.out.println(inputStr1);
        String result = "Fail";

      for (int i = 0; i < inputStr1.length(); i++) {
          if(Character.isUpperCase(inputStr1.charAt(i))) {
                System.out.println(inputStr1.charAt(i));
          }
        }
    }

    public static void nonnumericStr(String inputStr2) {
        System.out.println(inputStr2);
        String result = "Fail";
        for (int i = 0; i < inputStr2.length(); i++) {
            if(!Character.isDigit(inputStr2.charAt(i))) {
                System.out.print(inputStr2.charAt(i));
            }
        }
    }


}
