package services;

import lombok.experimental.ExtensionMethod;

import java.util.Arrays;

@ExtensionMethod({Arrays.class, StringExtension.class})
public class ExtensionService {

    public static void main(String[] args){

        int[] intArray = {5, 3, 8, 2};
//        Arrays.sort(intArray);
        //intArray.sort();

        for(int x=0;x<intArray.length;x++){
            System.out.print(intArray[x]);
        }

        System.out.println();
        //System.out.println("Hello".toTileCase());

    }

}

class StringExtension{

    public static String toTileCase(String in){
        if(in.isEmpty()) return in;
        return "ABC";
    }

}
