package it.unipd.mtss;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanPrinterTest {

    @Test
    public void shouldPrintI() {
        RomanPrinter printer = new RomanPrinter();
        String expect =
                "  _____  \n" +
                " |_   _| \n" +
                "   | |   \n" +
                "   | |   \n" +
                "  _| |_  \n" +
                " |_____| \n" +
                "         \n";
        assertEquals(expect.trim(), printer.print(1).trim());
    }

    @Test
    public void shouldPrintII() {
        RomanPrinter printer = new RomanPrinter();
        String expect =
                "  _____    _____  \n" +
                " |_   _|  |_   _| \n" +
                "   | |      | |   \n" +
                "   | |      | |   \n" +
                "  _| |_    _| |_  \n" +
                " |_____|  |_____| \n" +
                "                 \n";
        assertEquals(expect.trim(), printer.print(2).trim());
    }

    @Test
    public void shouldPrintIII() {
        RomanPrinter printer = new RomanPrinter();
        String expect =
                "  _____    _____    _____  \n" +
                " |_   _|  |_   _|  |_   _| \n" +
                "   | |      | |      | |   \n" +
                "   | |      | |      | |   \n" +
                "  _| |_    _| |_    _| |_  \n" +
                " |_____|  |_____|  |_____| \n" +
                "                         \n";
        assertEquals(expect.trim(), printer.print(3).trim());
    }

    @Test
    public void shouldPrintIV() {
        RomanPrinter printer = new RomanPrinter();
        String expect =
                " _____  __      __ \n" +
                "|_   _| \\ \\    / / \n" +
                "  | |    \\ \\  / /  \n" +
                "  | |     \\ \\/ /   \n" +
                " _| |_     \\  /    \n" +
                "|_____|     \\/     \n" +
                "               \n";
        assertEquals(expect.trim(), printer.print(4).trim());
    }

    @Test
    public void shouldPrintV() {
        RomanPrinter printer = new RomanPrinter();
        String expect =
                " __      __ \n" +
                " \\ \\    / / \n" +
                "  \\ \\  / /  \n" +
                "   \\ \\/ /   \n" +
                "    \\  /    \n" +
                "     \\/     \n" +
                "            \n";
        assertEquals(expect.trim(), printer.print(5).trim());
    }

    @Test
    public void shouldPrintVI() {
        RomanPrinter printer = new RomanPrinter();
        String expect =
                " __      __   _____  \n" +
                " \\ \\    / /  |_   _| \n" +
                "  \\ \\  / /     | |   \n" +
                "   \\ \\/ /      | |   \n" +
                "    \\  /      _| |_  \n" +
                "     \\/      |_____| \n" +
                "                    \n";
        assertEquals(expect.trim(), printer.print(6).trim());
    }
}

