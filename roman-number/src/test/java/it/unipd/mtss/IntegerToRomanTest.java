package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {
    //test dei numeri fuori dal range, zero, sotto 1 oppure oltre 10
    @Test(expected = IllegalArgumentException.class)
    public void overRangeThrowsIllegalArgumentException() {
        IntegerToRoman.convert(11);
    }
    @Test(expected = IllegalArgumentException.class)
    public void underRangeThrowsIllegalArgumentException() {
        IntegerToRoman.convert(0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void underZeroThrowsIllegalArgumentException() {
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

}