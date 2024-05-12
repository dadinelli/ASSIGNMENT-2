////////////////////////////////////////////////////////////////////
// [DAVIDE] [MARTINELLI] [2077679]
// [MARCO] [COLA] [2079237]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number){
        String res = "";
        if(number < 3 & number > 0){
            for(int i = 0; i < number; i++){
                res = res + "I";
            }
        }
        return null;
    }
}

