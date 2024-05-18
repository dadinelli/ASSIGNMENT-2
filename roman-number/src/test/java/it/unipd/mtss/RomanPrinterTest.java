package it.unipd.mtss;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanPrinterTest {

    @Test
    public void shouldPrintI(){
        RomanPrinter printer = new RomanPrinter();
        String expect =
              "\n  _____  \n" +
                " |_   _| \n" +
                "   | |   \n" +
                "   | |   \n" +
                "  _| |_  \n" +
                " |_____| \n" +
                "         \n" +
                "         ";
        assertEquals(expect.trim(), printer.print(1).trim());
    }

    @Test
    public void shouldPrintIII(){
        RomanPrinter printer = new RomanPrinter();
        String expect =
              "\n  _____    _____    _____  \n" +
                " |_   _|  |_   _|  |_   _| \n" +
                "   | |      | |      | |   \n" +
                "   | |      | |      | |   \n" +
                "  _| |_    _| |_    _| |_  \n" +
                " |_____|  |_____|  |_____| \n" +
                "                         \n" +
                "                         ";
        assertEquals(expect.trim(), printer.print(3).trim());
    }
}


