package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    //test dei numeri fuori dal range, zero, sotto 1 oppure oltre 20
    @Test(expected = IllegalArgumentException.class)
    public void overRangeThrowsIllegalArgumentException() {
        IntegerToRoman.convert(51);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_0_IllegalArgumentException() {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void under_0_ThrowsIllegalArgumentException() {
        IntegerToRoman.convert(-1);
    }

    //primi 3 numeri
    @Test
    public void First3NumbersConversion() {
        assertEquals(IntegerToRoman.convert(1), "I");
        assertEquals(IntegerToRoman.convert(2), "II");
        assertEquals(IntegerToRoman.convert(3), "III");
    }

    //primi 6 numeri
    @Test
    public void First6NumbersConversion() {
        assertEquals(IntegerToRoman.convert(4), "IV");
        assertEquals(IntegerToRoman.convert(5), "V");
        assertEquals(IntegerToRoman.convert(6), "VI");
    }

    //primi 10 numeri
    @Test
    public void First10NumbersConversion() {
        assertEquals(IntegerToRoman.convert(7), "VII");
        assertEquals(IntegerToRoman.convert(8), "VIII");
        assertEquals(IntegerToRoman.convert(9), "IX");
        assertEquals(IntegerToRoman.convert(10), "X");
    }

    //primi 20 numeri
    @Test
    public void First20NumbersConversion() {
        assertEquals(IntegerToRoman.convert(12), "XII");
        assertEquals(IntegerToRoman.convert(17), "XVII");
        assertEquals(IntegerToRoman.convert(20), "XX");
    }

    @Test
    public void First50NumbersConversion(){
        assertEquals(IntegerToRoman.convert(50), "L");
    }
}