////////////////////////////////////////////////////////////////////
// [DAVIDE] [MARTINELLI] [2077679]
// [MARCO] [COLA] [2079237]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number){
        if(number < 1 || number > 6){
            throw new IllegalArgumentException("Numero fuori dal range");
        }

        StringBuilder res = new StringBuilder();

        if(number >= 5) {
            res.append("V");
            number -= 5;
        }
        if(number == 4) {
            res.append("IV");
            number -= 4;
        } else {
            for (int i = 0; i < number; i++) {
                res.append("I");
            }
        }

        return res.toString();
    }
}

