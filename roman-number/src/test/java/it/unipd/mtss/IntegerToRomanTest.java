package it.unipd.mtss;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntegerToRomanTest {

    @Test
    public void shouldConvert1() {
        assertEquals("I", IntegerToRoman.convert(1));
        System.out.println("shouldConvert1()");
    }

    @Test
    public void shouldConvert2() {
        assertEquals("II", IntegerToRoman.convert(2));
        System.out.println("shouldConvert2()");
    }

    @Test
    public void shouldConvert3(){
        assertEquals("III", IntegerToRoman.convert(3));
        System.out.println("shouldConvert3()");
    }

    @Test
    public void shouldConvert4() {
        assertEquals("IV", IntegerToRoman.convert(4));
        System.out.println("shouldConvert4()");
    }

    @Test
    public void shouldConvert5() {
        assertEquals("V", IntegerToRoman.convert(5));
        System.out.println("shouldConvert5()");
    }

    @Test
    public void shouldConvert6() {
        assertEquals("VI", IntegerToRoman.convert(6));
        System.out.println("shouldConvert6()");
    }
}