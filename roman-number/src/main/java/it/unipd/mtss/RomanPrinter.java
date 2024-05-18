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
                  "\n  _____  \n" +
                    " |_   _| \n" +
                    "   | |   \n" +
                    "   | |   \n" +
                    "  _| |_  \n" +
                    " |_____| \n" +
                    "         \n";

        String[] lines = I.split("\n");
        int numLines = lines.length;

        StringBuilder[] outputLines = new StringBuilder[numLines];
        for (int i = 0; i < numLines; i++) {
            outputLines[i] = new StringBuilder();
        }

        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) == 'I') {
                for (int j = 0; j < numLines; j++) {
                    outputLines[j].append(lines[j]);
                }
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


