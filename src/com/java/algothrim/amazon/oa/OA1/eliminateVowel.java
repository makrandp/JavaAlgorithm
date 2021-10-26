package com.java.algothrim.amazon.oa.OA1;

public class eliminateVowel {

    public static String solution (String string){
        String newString = "";
        int i = 0;
        char[] chars = string.toCharArray();
        int len = string.length();
        if(len == 0){
            return "";
        }
        while (i < chars.length){
            switch (chars[i]){

//                    i++;
//                    break;
                case 'a': i ++;
                    break;
                case 'e': i ++;
                    break;
                case 'i': i ++;
                    break;
                case 'o': i ++;
                    break;
                case 'u': i ++;
                    break;
                case 'A': i ++;
                    break;
                case 'E': i ++;
                    break;
                case 'I': i ++;
                    break;
                case 'O': i ++;
                    break;
                case 'U': i ++;
                    break;
                default:
                    newString += chars[i];
                    i++;
            }
        }
        return  newString;
    }
}
