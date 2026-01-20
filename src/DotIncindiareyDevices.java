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
    public static int collectDots(ArrayList<Integer> list, int base){
        int result = 0;
        int st_base = 0;
        for(int idx = list.size()-1; idx >=0; idx--){
            result += (int) Math.pow(base,idx) * list.get(idx);
        }
        return result;
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
        ArrayList<Integer> array = (DotIncindiareyDevices.explodeDots(number, base));
        console.output(array.toString());
        console.output(collectDots(array, base));
    }
}
