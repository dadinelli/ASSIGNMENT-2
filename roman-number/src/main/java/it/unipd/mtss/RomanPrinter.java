////////////////////////////////////////////////////////////////////
// [DAVIDE] [MARTINELLI] [2077679]
// [MARCO] [COLA] [2079237]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String res){
        String I =
                "  _____  \n" +
                " |_   _| \n" +
                "   | |   \n" +
                "   | |   \n" +
                "  _| |_  \n" +
                " |_____| \n" +
                "         \n";

        String V =
                " __      __ \n" +
                " \\ \\    / / \n" +
                "  \\ \\  / /  \n" +
                "   \\ \\/ /   \n" +
                "    \\  /    \n" +
                "     \\/     \n" +
                "            \n";

        String IV =
                " _____  __      __ \n" +
                "|_   _| \\ \\    / / \n" +
                "  | |    \\ \\  / /  \n" +
                "  | |     \\ \\/ /   \n" +
                " _| |_     \\  /    \n" +
                "|_____|     \\/     \n" +
                "               \n";

        String[] linesI = I.split("\n");
        String[] linesV = V.split("\n");
        String[] linesIV = IV.split("\n");

        int numLines = linesI.length;

        StringBuilder[] outputLines = new StringBuilder[numLines];
        for (int i = 0; i < numLines; i++) {
            outputLines[i] = new StringBuilder();
        }

        int i = 0;
        while (i < res.length()) {
            String[] currentLines;
            if (i + 1 < res.length() && res.substring(i, i + 2).equals("IV")) {
                currentLines = linesIV;
                i += 2; // Skip next character
            } else {
                switch (res.charAt(i)) {
                    case 'I':
                        currentLines = linesI;
                        break;
                    case 'V':
                        currentLines = linesV;
                        break;
                    default:
                        throw new IllegalArgumentException("Numero Romano non supportato: " + res.charAt(i));
                }
                i++;
            }
            for (int j = 0; j < numLines; j++) {
                outputLines[j].append(currentLines[j]);
            }
        }


        StringBuilder output = new StringBuilder();
        for (StringBuilder line : outputLines) {
            output.append(line).append("\n");
        }

        String result = output.toString();
        System.out.println(result);
        return result;
    }
}


