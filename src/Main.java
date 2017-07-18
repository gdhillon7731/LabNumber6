import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstLetter ="";
        String restFirstWord = "";
        String a = "a";
        String e = "e";
        String i = "i";
        String o = "o";
        String u = "u";
        String y = "y";
        String startVowel = "";
        String answer = "Yes";


            //welcome prompt
           System.out.println("\nWelcome to the Pig Latin Translator\n");

           do {
            //asking for input
           System.out.print("Enter a word to be translated:");
           String pigWord = scan.nextLine().toLowerCase();

           //separate the first letter from the rest
           firstLetter = pigWord.substring(0, 1);
           restFirstWord = pigWord.substring(1, pigWord.length());


           if (firstLetter.contains(a)) {
               System.out.println(restFirstWord + "way");
           }
           if (firstLetter.contains(e)) {
               System.out.println(restFirstWord + "way");
           }
           if (firstLetter.contains(i)) {
               System.out.println(restFirstWord + "way");
           }
           if (firstLetter.contains(o)) {
               System.out.println(restFirstWord + "way");
           }
           if (firstLetter.contains(u)) {
               System.out.println(restFirstWord + "way");
           }
           if (firstLetter.contains(y)) {
               System.out.println(restFirstWord + "way");
           }

           System.out.println("\nTranslate another word? (yes/no)");
           answer = scan.nextLine();

       } while (answer.equals("yes"));

        }







    }

