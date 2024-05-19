package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {

    //test ASCII I
    @Test
    public void TestI() {
        StringBuilder result = new StringBuilder();
        result.append(" |_   _|\n");
        result.append("   | |  \n");
        result.append("   | |  \n");
        result.append("  _| |_ \n");
        result.append(" |_____|\n");
        result.append("\n");
        String stringa= result.toString();
        assertEquals(RomanPrinter.printAsciiArt("I"), stringa);
        RomanPrinter.printToConsole(1);
    }

    //test ASCII V
    @Test
    public void TestV() {
        StringBuilder result = new StringBuilder();
        result.append(" \\ \\    / /\n");
        result.append("  \\ \\  / / \n");
        result.append("   \\ \\/ /  \n");
        result.append("    \\  /   \n");
        result.append("     \\/    \n");
        result.append(" \n");
        String stringa= result.toString();
        assertEquals(RomanPrinter.printAsciiArt("V"), stringa);
        RomanPrinter.printToConsole(5);
    }

    //test ASCII X
    @Test
    public void TestX() {
        StringBuilder result = new StringBuilder();
        result.append(" \\ \\ / /\n");
        result.append("  \\ V / \n");
        result.append("   > <  \n");
        result.append("  / . \\ \n");
        result.append(" /_/ \\_\\\n");
        result.append(" \n");
        String stringa= result.toString();
        assertEquals(RomanPrinter.printAsciiArt("X"), stringa);
        RomanPrinter.printToConsole(10);
    }
}
