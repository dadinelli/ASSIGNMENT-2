package it.unipd.mtss;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntegerToRomanTest {

    @Test
    public void shouldConvert3(){
        IntegerToRoman conv = new IntegerToRoman();
        assertEquals("III", conv.convert(3));
        System.out.println("shouldConvert3()");
    }

}