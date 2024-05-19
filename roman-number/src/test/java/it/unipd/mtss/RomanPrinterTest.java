package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {

    //test ASCII I
    @Test
    public void TestI() {
        String one = RomanPrinter.print(1);
        assertEquals(" _____ \n"+
                "|_   _|\n"+
                "  | |  \n"+
                "  | |  \n"+
                " _| |_ \n"+
                "|_____|\n" , one);
    }

    //test ASCII V
    @Test
    public void TestV(){
        String five = RomanPrinter.print(5);
        assertEquals("__      __\n"+
                "\\ \\    / /\n"+
                " \\ \\  / / \n"+
                "  \\ \\/ /  \n"+
                "   \\  /   \n"+
                "    \\/    \n", five);

    }

    @Test
    public void TestX(){
        String ten = RomanPrinter.print(10);
        assertEquals("__   __ \n"+
                "\\ \\ / / \n"+
                " \\ V /  \n"+
                "  > <   \n"+
                " / . \\  \n"+
                "/_/ \\_\\ \n", ten);
    }

    @Test
    public void TestXX(){
        String twenty = RomanPrinter.print(20);
        assertEquals("__   __ __   __ \n"+
                "\\ \\ / / \\ \\ / / \n"+
                " \\ V /   \\ V /  \n"+
                "  > <     > <   \n"+
                " / . \\   / . \\  \n"+
                "/_/ \\_\\ /_/ \\_\\ \n", twenty);
    }
}
