/**
 * Created by gagandhillon on 7/16/17.
 */
public class main4 {


    public static String translate(String word) {
        char a = 'a';
        char e = 'e';
        char i = 'i';
        char o = 'o';
        char u = 'u';


        int start = 0;
        int firstVowel = 0;
        int end = word.length();
        for(i = 0; i < end; i++) {
            char c = Character.toLowerCase(word.charAt(i));
            if(c == a || c == e || c == i || c == o || c == u) {
                firstVowel = i;
                break;
            }
        }
        if(start != firstVowel) {
            String startString = word.substring(firstVowel, end);
            String endString = word.substring(start, firstVowel) + "ay";
            return startString+endString;
        }
        return word;
    }
}
