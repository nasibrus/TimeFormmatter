import java.util.*;
// Convert Function which takes in
// 24hour time and convert it to
// 12 hour format
/**
 *
 * @author Ruslan Nasibov (@nasibrus)
 */
class Main {
    public static void main(String ar[]){
        Scanner stri = new Scanner(System.in);
        // 24 hour format
        String str = stri.next();
        convert12(str);

    }

    static void convert12(String str){
// Get Hours
        int h1 = (int)str.charAt(0) - '0';
        int h2 = (int)str.charAt(1)- '0';

        int hh = h1 * 10 + h2;

        // Finding out the Meridien of time
        // ie. AM or PM
        String Meridien;
        if (hh < 12) {
            Meridien = "AM";
        }
        else
            Meridien = "PM";

        hh %= 12;

        // Handle 00 and 12 case separately
        if (hh == 0) {
            System.out.print("12");

            // Printing minutes and seconds
            for (int i = 2; i < 8; ++i) {
                System.out.print(str.charAt(i));
            }
        }
        else {
            System.out.print(hh);
            // Printing minutes and seconds
            for (int i = 2; i < 8; ++i) {
                System.out.print(str.charAt(i));
            }
        }

        // After time is printed
        // cout Meridien
        System.out.println(" "+Meridien);
    }


}