package com.java.algothrim.String;
public class ExcelSheetColumnNumber {

    //https://leetcode.com/problems/excel-sheet-column-number/
    public static int titleToNumber(String s) {
        char[] array = s.toCharArray();
        int number = 0;
        for (int i = 0; i < array.length ; i++){
            number += Math.pow(26f,array.length - i - 1) * (array[i] - 'A' + 1);
        }
        return number;
    }

    //https://leetcode.com/problems/excel-sheet-column-title/
    public static String convertToTitle(int n) {
        String title = "";
        while (n >= 1) {
            char charater = 'A';
            if (n % 26 == 0) {
                title = 'Z' + title;
                n = n - 26;
            } else {
                charater = (char) ('A' + n % 26 - 1);
                title = charater + title;

            }
            n = n / 26;
        }
        return title;
    }

//    public static String convertToTitle(int A) {
//
//        StringBuffer sb=new StringBuffer("");
//        while(A!=0)
//        {
//            char ch;
//            if(A%26==0)
//            {
//                ch = 'Z';
//                A=A-26;
//            }
//            else
//                ch = (char)((A%26)+64);
//            A=A/26;
//            sb.append(ch);
//
//
//        }
//        sb.reverse();
//        return sb.toString();
//    }

}
