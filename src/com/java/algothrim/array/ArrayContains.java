package com.java.algothrim.array;

public class ArrayContains {

    public static void test(){
        char[] array1 = new char[] {'a','b','c','d','1','2','3'};
        char[] array2 = new char[] {'b','1','3'};

        System.out.println(contain(array1,array2));
    }

    public static boolean contain(char[] array1, char[] array2 ){
        return containHelper(array1,array2);

    }

    private static boolean containHelper(char[] array1, char[] array2){
        char[] smallerArray,biggerArray;

        if(array1.length>array2.length){
            smallerArray = array2;
            biggerArray = array1;
        }else {
            smallerArray = array1;
            biggerArray = array2;
        }

        for(int j = 0; j <smallerArray.length; j++){
            if(!arrayContainsChar(smallerArray[j],biggerArray)){
                return false;
            }
        }

        return true;
    }

    private static boolean arrayContainsChar(char character, char[] array){
        for(int i = 0; i < array.length; i ++){
            if(character == array[i]){
                return  true;
            }
        }
        return  false;
    }
}
