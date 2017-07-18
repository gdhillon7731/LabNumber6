import java.util.Scanner;

public class Main2 {

    public static void main(String[]arg){
        String a = "a";
        String e = "e";
        String i = "i";
        String o = "o";
        String u = "u";
        String y = "y";
        String newPigWord2 = "";
        String firstVowelA = ""; // up until the first vowel
        String firstVowelE = "";
        String firstVowelI = "";
        String firstVowelO = "";
        String firstVowelU = "";
        String firstVowelY = "";
        String restWordA = ""; //vowel plus the rest of the word
        String restWordE = "";
        String restWordI = "";
        String restWordO = "";
        String restWordU = "";
        String restWordY = "";
        int resultA = 0;
        int resultE = 0;
        int resultI = 0;
        int resultO = 0;
        int resultU = 0;
        int resultY = 0;


        //take in user input
        System.out.print("Enter a word to be translated:");
        Scanner scan = new Scanner(System.in);
        String pigWord2 = scan.nextLine().toLowerCase();

       if (pigWord2.contains(a)) {
           resultA = pigWord2.indexOf(a);
           firstVowelA = pigWord2.substring(0, resultA);
           restWordA = pigWord2.substring(resultA, pigWord2.length());
           newPigWord2 = restWordA + firstVowelA + "ay";
           System.out.println(newPigWord2);
       }

        else if (pigWord2.contains(e)) {
            resultE = pigWord2.indexOf(e);
            firstVowelE = pigWord2.substring(0, resultE);
            restWordE = pigWord2.substring(resultE, pigWord2.length());
            newPigWord2 = restWordE + firstVowelE + "ay";
            System.out.println(newPigWord2);
        }

        else if (pigWord2.contains(i)) {
            resultI = pigWord2.indexOf(i);
            firstVowelI = pigWord2.substring(0, resultI);
            restWordI = pigWord2.substring(resultI, pigWord2.length());
            newPigWord2 = restWordI + firstVowelI + "ay";
            System.out.println(newPigWord2);
        }

        if (pigWord2.contains(o)) {
            resultO = pigWord2.indexOf(o);
            firstVowelO = pigWord2.substring(0, resultO);
            restWordO = pigWord2.substring(resultO, pigWord2.length());
            newPigWord2 = restWordO + firstVowelO + "ay";
            System.out.println(newPigWord2);
        }
        if (pigWord2.contains(u)) {
            resultU = pigWord2.indexOf(u);
            firstVowelU = pigWord2.substring(0, resultU);
            restWordU = pigWord2.substring(resultI, pigWord2.length());
            newPigWord2 = restWordU + firstVowelU + "ay";
            System.out.println(newPigWord2);
        }

        if (pigWord2.contains(y)) {
            resultY = pigWord2.indexOf(y);
            firstVowelY = pigWord2.substring(0, resultY);
            restWordY = pigWord2.substring(resultY, pigWord2.length());
            newPigWord2 = restWordY + firstVowelY + "ay";
            System.out.println(newPigWord2);
        }















    }
}
