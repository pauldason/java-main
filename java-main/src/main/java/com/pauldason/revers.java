package com.pauldason;

public class revers {


    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String a = "001";
        String b = "002";


        System.out.println(Integer.parseInt(a)+Integer.parseInt(b));


        reverseadd(100,200);
    }


    public static void reverseadd(int a ,int b) {

        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);

        int aIndexlength = aStr.length();
        int bIndexlength = bStr.length();

        String aReverseStr = "";
        String bReverseStr = "";

        for (int i = aIndexlength-1; i >=0; i--) {


             aReverseStr = aReverseStr+(aStr.charAt(i));
            //System.out.println(aReverseStr);
            //System.out.println(aStr.charAt(i));
        }

        for (int j = bIndexlength -1; j >=0; j--) {

            //System.out.println(bStr.charAt(j));
            bReverseStr = bReverseStr+(bStr.charAt(j));

        }


        System.out.println(Integer.parseInt(aReverseStr) + Integer.parseInt(bReverseStr));
    }






}
