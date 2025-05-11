//prova

package it.unipd.mtss;

import java.util.HashMap;
import java.util.Map;

public class RomanPrinter {
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static final Map<Character, String[]> ascii = new HashMap<> ();
    static {
        ascii.put('I', new String[]{
                " _____ ",
                "|_   _|",
                "  | |  ",
                "  | |  ",
                " _| |_ ",
                "|_____|"
        });
        ascii.put('V', new String[]{
                "__      __",
                "\\ \\    / /",
                " \\ \\  / / ",
                "  \\ \\/ /  ",
                "   \\  /   ",
                "    \\/    "
        });
        ascii.put('X', new String[]{
                "__   __",
                "\\ \\ / /",
                " \\ V / ",
                "  > <  ",
                " / . \\ ",
                "/_/ \\_\\"
        });
        ascii.put('L', new String[]{
                " _      ",
                "| |     ",
                "| |     ",
                "| |     ",
                "| |____ ",
                "|______|"
        });
        ascii.put('C', new String[]{
                "  _____ ",
                " / ____|",
                "| |     ",
                "| |     ",
                "| |____ ",
                " \\_____|"
        });
        ascii.put('D', new String[]{
                " _____  ",
                "|  __ \\ ",
                "| |  | |",
                "| |  | |",
                "| |__| |",
                "|_____/ "
        });
        ascii.put('M', new String[]{
                " __  __ ",
                "|  \\/  |",
                "| \\  / |",
                "| |\\/| |",
                "| |  | |",
                "|_|  |_|"
        });
    }

    private static String printAsciiArt(String romanNumber){
        StringBuilder ris = new StringBuilder();
        int height = ascii.get('I').length;     // Altezza di ciascuna letter (=6)

        for (int r = 0; r < height; r++) {      // Iterazione sulle righe delle lettere
            for (char c : romanNumber.toCharArray()) {      // Iterazione per ciascun carattere in romanNumber
                ris.append(ascii.get(c)[r] + ' ');      // Riga 'r' per ciascun carattere 'c'
            }
            ris.append('\n');
        }

        return ris.toString();
    }
}