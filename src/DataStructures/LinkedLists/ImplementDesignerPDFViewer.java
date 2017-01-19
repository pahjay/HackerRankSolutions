/**
 * Created by Ryan on 1/17/2017.
 */
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class ImplementDesignerPDFViewer {
    // BUG: scanning the letter 'o' results in a value of -1
    //

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] alphabetHeight = new int[26];
        String letters;
        int height = 0;
        int width = 0;

        for (int i = 0; i < 26; i++){
            alphabetHeight[i] = scan.nextInt();
        }

        letters = toUpperCase(scan.next());
        int[] letterPos = new int[letters.length()];
        width = letters.length();

        for(int i = 0; i < letters.length(); i++) {
            letterPos[i] = Character.getNumericValue(letters.charAt(i));
            if (alphabetHeight[letterPos[i]] > height) {
                height = alphabetHeight[letterPos[i]];
            }
        }
        System.out.println(height * width);
    }
}
