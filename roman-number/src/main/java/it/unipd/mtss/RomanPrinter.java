////////////////////////////////////////////////////////////////////
// [DAVIDE] [MARTINELLI] [2077679]
// [MARCO] [COLA] [2079237]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
//stampa i numeri romani convertiti da IntegerToRoman in ASCII art
public class RomanPrinter {
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    public static String printAsciiArt(String romanNumber){
        StringBuilder result = new StringBuilder();
        int length = romanNumber.length();
        for (int i = 0; i < length; i++) {
            char c = romanNumber.charAt(i);
            switch(c) {
                case 'I':

                    result.append(" |_   _|\n");
                    result.append("   | |  \n");
                    result.append("   | |  \n");
                    result.append("  _| |_ \n");
                    result.append(" |_____|\n");
                    result.append("\n");
                    break;

                case 'V':
                    result.append(" \\ \\    / /\n");
                    result.append("  \\ \\  / / \n");
                    result.append("   \\ \\/ /  \n");
                    result.append("    \\  /   \n");
                    result.append("     \\/    \n");
                    result.append(" \n");
                    break;

                case 'X':
                    result.append(" \\ \\ / /\n");
                    result.append("  \\ V / \n");
                    result.append("   > <  \n");
                    result.append("  / . \\ \n");
                    result.append(" /_/ \\_\\\n");
                    result.append(" \n");
                    break;

                default:
                    throw new IllegalArgumentException("Invalid Roman numeral: " + c);
            }
        }
        return result.toString();
    }
    public static void printToConsole(int num) {
        String romanNumber = IntegerToRoman.convert(num);
        String asciiArt = printAsciiArt(romanNumber);
        System.out.println(asciiArt);
    }
}

