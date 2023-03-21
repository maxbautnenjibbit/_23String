import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex04 {

    // Teilweise Lösung, nicht alle Fälle beachtet.
    public static void main(String[] args) {
        String text = "Magisches Wort mit Sonderzeichen";
        StringBuilder hangman = new StringBuilder();
        int maxTries = 6;
        int tries = 0;

        ArrayList<Character> characters = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ')
                hangman.append("_");
            else
                hangman.append(" ");
        }

        Scanner scanner = new Scanner(System.in);

        while (hangman.toString().contains("_") && tries <= maxTries) {
            for (int i = 0; i < 15; i++) {
                System.out.println();
            }
            System.out.println("Bitte gebe einen Buchstaben ein.");
            System.out.println("Wort: " + hangman);
            System.out.println("Fehler (" + tries + "): " + characters.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(", ")));
            System.out.print("Buchstabe: ");

            String next = scanner.next();
            char insert = next.charAt(0);

            int i = text.toLowerCase().indexOf(String.valueOf(insert).toLowerCase());

            if (i == -1) {
                characters.add(insert);
                tries++;
            } else {
                char[] chars = text.toCharArray();
                char[] chars1 = hangman.toString().toCharArray();

                for (int i1 = 0; i1 < chars.length; i1++) {
                    char aChar = chars[i1];

                    if (Character.toLowerCase(aChar) == Character.toLowerCase(insert))
                        chars1[i1] = aChar;
                }

                hangman = new StringBuilder(String.valueOf(chars1));
            }
        }

        System.out.println();
        System.out.println();

        if (hangman.toString().equals(text)) {
            System.out.println("Herzlichen Glückwunsch alles ist richtig!");
            System.out.println("Das Lösungswort: " + text);
        } else {
            System.out.println("Du hast zu viele Fehler. Das richtige Wort wäre " + text + " gewesen!");
        }

        scanner.close();
    }

}
