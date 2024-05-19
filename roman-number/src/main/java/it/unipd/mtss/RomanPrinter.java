////////////////////////////////////////////////////////////////////
// [DAVIDE] [MARTINELLI] [2077679]
// [MARCO] [COLA] [2079237]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;
import java.util.Map;

//stampa i numeri romani convertiti da IntegerToRoman in ASCII art
public class RomanPrinter {
    private static final String ONE_ASCII[] ={
            " _____ ",
            "|_   _|",
            "  | |  ",
            "  | |  ",
            " _| |_ ",
            "|_____|"
    };

    private static final String FIVE_ASCII[] ={
            "__      __",
            "\\ \\    / /",
            " \\ \\  / / ",
            "  \\ \\/ /  ",
            "   \\  /   ",
            "    \\/    "
    };

    private static final String TEN_ASCII[] ={
            "__   __ ",
            "\\ \\ / / ",
            " \\ V /  ",
            "  > <   ",
            " / . \\  ",
            "/_/ \\_\\ "
    };

    private static final Map<Character, String[]> romanToAscii =
            new HashMap<>();

    static {
        romanToAscii.put('I', ONE_ASCII);
        romanToAscii.put('V', FIVE_ASCII);
        romanToAscii.put('X', TEN_ASCII);
    }

    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        String result = "";
        String[] lines = new String[]{"", "", "", "", "", ""};

        for (char ch : romanNumber.toCharArray()) {
            String[] art = romanToAscii.get(ch);
            for (int i = 0; i < lines.length; i++) {
                lines[i] += art[i] ;
            }
        }

        for (String line : lines) {
            result += line + "\n";
        }

        return result;
    }
}

