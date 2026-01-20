import java.util.ArrayList;
import java.util.Arrays;

import APClasses.IBIO;

public class DotIncindiareyDevices {
    public DotIncindiareyDevices(){

    }

    public static ArrayList<Integer> explodeDots(int num, int base){
        boolean cancel = false;
        if(base < 2) cancel = true;
        if(num < 0) cancel = true;
        
        ArrayList<Integer> explodedDots = new ArrayList<Integer>();
        if(cancel) return explodedDots;


        while(num>0){
            explodedDots.add(subtractModulus(num,base));
            num/=base;
        }
        return explodedDots;
    }

    private static int subtractModulus(int num, int base){
        while(true){
            if(num>-1 && num < base){
                return num;
            }
            num -= base;
        }
    }
    public static void main(String[] args) {
        IBIO console = new IBIO();
        int number = console.inputInt("gimme a number(positive integer please)");
        int base = console.inputInt("gimme a number(positivity is integeral!)");
        console.output((DotIncindiareyDevices.explodeDots(314, 10)).toString());
    }
}
