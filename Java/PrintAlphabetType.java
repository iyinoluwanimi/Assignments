import java.util.Scanner;
public class PrintAlphabetType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write any letter in small letter");
        String userLetter = input.next();
        if ((userLetter.equalsIgnoreCase("a")) || (userLetter.equalsIgnoreCase("e")) ||
            (userLetter.equalsIgnoreCase("i")) || (userLetter.equalsIgnoreCase("o")) ||
            (userLetter.equalsIgnoreCase("u"))) {
            System.out.println("Vowel");
        }
        else
            if ((userLetter.equalsIgnoreCase("b")) || (userLetter.equalsIgnoreCase("c")) ||
                (userLetter.equalsIgnoreCase("d")) || (userLetter.equalsIgnoreCase("f")) ||
                (userLetter.equalsIgnoreCase("g")) || (userLetter.equalsIgnoreCase("h")) ||
                (userLetter.equalsIgnoreCase("j")) || (userLetter.equalsIgnoreCase("k")) ||
                (userLetter.equalsIgnoreCase("l")) || (userLetter.equalsIgnoreCase("m")) ||
                (userLetter.equalsIgnoreCase("n")) || (userLetter.equalsIgnoreCase("p")) ||
                (userLetter.equalsIgnoreCase("q")) || (userLetter.equalsIgnoreCase("r")) ||
                (userLetter.equalsIgnoreCase("s")) || (userLetter.equalsIgnoreCase("t")) ||
                (userLetter.equalsIgnoreCase("v")) || (userLetter.equalsIgnoreCase("w")) ||
                (userLetter.equalsIgnoreCase("x")) || (userLetter.equalsIgnoreCase("y")) ||
                (userLetter.equalsIgnoreCase("z"))) {
                System.out.println("Consonant");
            }
            else {
                System.out.println("Invalid Input");
            }
    }
}
