import java.util.Scanner;


public class Main3 {

    public static void main(String[] args) {
        String answer = "";

        System.out.println("Welcome to the Pig Latin Translator");


        do {
            System.out.println("Enter a line to be translated:");
            Scanner scan = new Scanner(System.in);
            String word = scan.nextLine().toLowerCase();

            char startLetter = word.charAt(0);
            if (startLetter == 'a' || startLetter == 'e' || startLetter == 'i' || startLetter == 'o'
                    || startLetter == 'u') {
                System.out.println(word + "way");

            } else {

                for (int i = 1; i < word.length(); i++) {
                    char letter = word.charAt(i);
                    if (letter == 'a' || letter == 'e' || letter == 'i'
                            || letter == 'o' || letter == 'u') {

                        //create a new string starting with this vowel that is starting consonant up until first vowel
                        String consonant = word.substring(0, i);

                        //(position i ( vowel) through end)
                        String vowel = word.substring(i, word.length());

                        //  add -ay
                        System.out.println(vowel + consonant + "ay");

                        break;
                    }


                }
                System.out.println("Translate another line (y/n):");
                answer = scan.nextLine().toLowerCase();


            }
        } while(answer.equals("yes"));

        System.out.println("Goodbye");



    }
}

