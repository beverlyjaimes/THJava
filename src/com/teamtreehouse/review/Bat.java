package com.teamtreehouse.review;

public class Bat {

    public static void main(String[] args) {
//            System.out.println(sleepIn(true, false));
//            System.out.println(monkeyTrouble(true, false));
//            System.out.println(missingChar("Kitten", 3));
//            System.out.println(diff21( 3));
//            System.out.println(stringTimes("Bev", 3));
//        System.out.println(close10(10 , 3));
//        System.out.println(close10(1,9));
////        System.out.println(close10(4,6));
//        System.out.println(helloName("Bev"));
//        System.out.println(makeOutWord("<<<<","dog"));


//        double dblTotal = 2.3;
//        int intValue = 32;
//        String stringVal = "This is string";
//
//        System.out.printf("Total is: $%,.2f%n", dblTotal);
//        System.out.printf("Total: %-10.2f: ", dblTotal);
//        System.out.printf("% 4d", intValue);
//        System.out.printf("%20.10s\n", stringVal);
//        String s = "Hello World";
//        System.out.printf("The String object %s is at hash code %h%n", s, s);
        System.out.println(icyHot(100, 30));
        System.out.println(lastDigit(10,33));

    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return (vacation) || (!weekday && !vacation);
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
    }

    public static String missingChar(String str, int n) {
        String front = str.substring(0, n);

        String back = str.substring(n + 1, str.length());

        return front + back;
    }

    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + str;  // could use += here
        }
        return result;
    }


    public static int close10(int a, int b) {
        int aDist = Math.abs(a - 10);
        int bDist = Math.abs(b - 10);
        if (aDist < bDist) {
            return a;
        }
        if (bDist < aDist) {
            return b;
        }
        return 0;
    }

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    public static String makeOutWord(String out, String word) {

//        System.out.println(out.substring(0,out.length()/2));
        String half = out.substring(0,out.length()/2);
        StringBuilder input1 = new StringBuilder();
        StringBuilder rev = input1.reverse();
        return half + word + rev;
    }

    public static boolean icyHot(int temp1, int temp2) {
        if((temp1 < 0 && temp2 > 100) || (temp1 > 0 && temp2 < 100)){
            return true;
        } else {
            return false;
        }
    }

    public static boolean lastDigit(int a, int b) {
        return(a % 10 == b % 10);
    }


//    We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

    public static boolean parrotTrouble(boolean talking, int hour) {
            return (talking && (hour < 7 || hour > 20));

    }

}


